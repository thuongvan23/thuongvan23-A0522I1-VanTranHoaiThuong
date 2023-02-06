package com.example.ss9_borowingbooksmanagement.controller;

import com.example.ss9_borowingbooksmanagement.model.TitleBook;
import com.example.ss9_borowingbooksmanagement.model.Transaction;
import com.example.ss9_borowingbooksmanagement.service.TitleBookService;
import com.example.ss9_borowingbooksmanagement.service.TransactionService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.Stack;

@Controller
@RequestMapping("/main")
public class MainController {
    @Autowired
    TitleBookService titleBookService;
    @Autowired
    TransactionService transactionService;

    @GetMapping("/bookList")
    public String showBookList(Model model){
        model.addAttribute("bookList", titleBookService.findAll());
        return "bookList";
    }

    @GetMapping("/borrow/{title}")
    public String borrow(@PathVariable("title") String title, Model model){
        TitleBook titleBook = titleBookService.findByTitle(title);
        if (titleBook.getQuantity() > 0){
            int currentQuantity = titleBook.getQuantity();
            titleBook.setQuantity(currentQuantity-1);
//      Create, save 1 transaction without endDate
            Random random = new Random();
            LocalDate today = LocalDate.now();
            Transaction transaction = new Transaction(10000 + random.nextInt(90000), today.toString(), "Being borrowed", titleBook);
            transactionService.save(transaction);
            return "redirect:/main/bookList";
        } else {
         return "redirect:/main/bookList";
        }
    }

    @GetMapping("/borrowedList")
    public String showBorrowed(Model model){
        model.addAttribute("transactions", transactionService.findAll());
        return "borrowedList";
    }

    @GetMapping("/giveBack/{borrowedCode}")
    public String giveBack(@PathVariable("borrowedCode") int borrowedCode){
        Transaction transaction = transactionService.findByBorrowedCode(borrowedCode);
        if (transaction.getEndDate().equals("Being borrowed")){
            TitleBook titleBook = transaction.getTitleBook();
            int currentQuantity = titleBook.getQuantity();
            titleBook.setQuantity(currentQuantity+1);
            transaction.setEndDate(LocalDate.now().toString());
            transactionService.save(transaction);
            return "redirect:/main/bookList";
        } else {
            return "redirect:/main/borrowedList";
        }
    }
}
