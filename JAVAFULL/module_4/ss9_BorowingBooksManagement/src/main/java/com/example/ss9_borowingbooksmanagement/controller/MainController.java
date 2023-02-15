package com.example.ss9_borowingbooksmanagement.controller;

import com.example.ss9_borowingbooksmanagement.model.TitleBook;
import com.example.ss9_borowingbooksmanagement.model.Transaction;
import com.example.ss9_borowingbooksmanagement.model.User;
import com.example.ss9_borowingbooksmanagement.service.TitleBookService;
import com.example.ss9_borowingbooksmanagement.service.TransactionService;
import com.example.ss9_borowingbooksmanagement.service.UserService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/main")
public class MainController {
    @Autowired
    TitleBookService titleBookService;
    @Autowired
    TransactionService transactionService;
    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/bookList")
    public String showBookList(Model model, @RequestParam(value = "idUser") int id){
        String string = "login";
        for (User user : userService.findAll()){
            if (user.getId()==id){
                model.addAttribute("bookList", titleBookService.findAll());
                model.addAttribute("idUser", id);
                string = "bookList";
                break;
            }
        }
        return string;
    }

    @GetMapping("/borrow/{title}/{idUser}")
    public String borrow(@PathVariable("title") String title, @PathVariable("idUser") int id){
        TitleBook titleBook = titleBookService.findByTitle(title);
        if (titleBook.getQuantity() > 0){
            int currentQuantity = titleBook.getQuantity();
            titleBook.setQuantity(currentQuantity-1);
//      Create, save 1 transaction without endDate
            Random random = new Random();
            LocalDate today = LocalDate.now();
            Transaction transaction = new Transaction(10000 + random.nextInt(90000), today.toString(), "Being borrowed", titleBook, new User(id));
            transactionService.save(transaction);
        }
        return "redirect:/main/bookList?idUser="+id;
    }

    @GetMapping("/borrowedList/{idUser}")
    public String showBorrowed(Model model, @PathVariable("idUser") int id){
        List<Transaction> transactionList = new ArrayList<>();
        for (Transaction transaction : transactionService.findAll()){
            if (transaction.getUser().getId()==id){
                transactionList.add(transaction);
            }
        }
        model.addAttribute("transactions", transactionList);
        return "borrowedList";
    }

    @GetMapping("/giveBack/{borrowedCode}/{idUser}")
    public String giveBack(@PathVariable("borrowedCode") int borrowedCode, @PathVariable("idUser") int id){
        Transaction transaction = transactionService.findByBorrowedCode(borrowedCode);
        if (transaction.getEndDate().equals("Being borrowed")){
            TitleBook titleBook = transaction.getTitleBook();
            int currentQuantity = titleBook.getQuantity();
            titleBook.setQuantity(currentQuantity+1);
            transaction.setEndDate(LocalDate.now().toString());
            transactionService.save(transaction);
            return "redirect:/main/bookList?idUser="+id;
        } else {
            return "redirect:/main/borrowedList/"+id;
        }
    }
}
