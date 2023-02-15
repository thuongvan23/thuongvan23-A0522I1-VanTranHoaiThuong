package Controller;

import Model.Student;
import Model.StudentType;
import Service.Impl.StudentServiceImpl;
import Service.Impl.StudentTypeServiceImpl;
import Service.StudentService;
import Service.StudentTypeService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(name = "MainServlet", value = "/MainServlet")
public class MainServlet extends HttpServlet {
    StudentService studentService = new StudentServiceImpl();
    StudentTypeService studentTypeService = new StudentTypeServiceImpl();
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action =request.getParameter("action");
        if (action == null) {
            action = "home";
        }
        switch (action) {
            case "list":
                showList(request, response);
                break;
            case "create":
                showCreate(request, response);
                break;
            case "update":
                showUpdate(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
            default:
                showHome(request, response);
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        studentService.deleteById(id);
        showList(request, response);
    }

    private void showUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        request.setAttribute("studentType", studentService.findById(id).getStudentType().getType());
        request.setAttribute("student", studentService.findById(id));
        request.getRequestDispatcher("obj1/update.jsp").forward(request, response);
    }

    private void showHome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("students", studentService.findAll());
        request.setAttribute("studentTypes", studentTypeService.findAll());
        request.getRequestDispatcher("obj1/list.jsp").forward(request, response);
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("studentTypes", studentTypeService.findAll());
        request.getRequestDispatcher("obj1/create.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        switch (action) {
            case "create":
                doCreate(request, response);
                break;
            case "search":
                doSearch(request, response);
                break;
            case "update":
                doUpdate(request, response);
                break;
            default:
                response.sendRedirect("/MainServlet");
        }
    }

    private void doUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idUpdate = request.getParameter("idUpdate");
        try {
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            Date birthday = null;
            birthday = df.parse(request.getParameter("birthday"));
            int age = Integer.parseInt(request.getParameter("age"));
            int gender = Integer.parseInt(request.getParameter("gender"));
            int studentTypeId = Integer.parseInt(request.getParameter("studentTypeId"));
            StudentType studentType = studentTypeService.findById(studentTypeId);
            Student student = new Student(id, name, age, birthday, gender, studentType);
            studentService.update(student, idUpdate);
            showList(request, response);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private void doSearch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String searchInput = request.getParameter("searchInput");
        Student student = studentService.findById(searchInput);
        request.setAttribute("student", student);
        request.getRequestDispatcher("obj1/search.jsp").forward(request, response);
    }

    private void doCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String birthdayText = request.getParameter("birthday");
            Date birthday = df.parse(birthdayText);
            int age = Integer.parseInt(request.getParameter("age"));
            int gender = Integer.parseInt(request.getParameter("gender"));
            int studentTypeId = Integer.parseInt(request.getParameter("studentTypeId"));
            StudentType studentType = studentTypeService.findById(studentTypeId);
            Student student = new Student(id, name, age, birthday, gender, studentType);
            studentService.save(student);
            response.sendRedirect("MainServlet?action=list");
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
    }
}
