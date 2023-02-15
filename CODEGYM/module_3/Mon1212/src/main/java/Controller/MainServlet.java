package Controller;

import Model.House;
import Model.Payment;
import Service.HouseService;
import Service.Impl.HouseServiceImpl;
import Service.Impl.PaymentServiceImpl;
import Service.PaymentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "MainServlet", value = "/MainServlet")
public class MainServlet extends HttpServlet {
    private final HouseService houseService = new HouseServiceImpl();
    private final PaymentService paymentService = new PaymentServiceImpl();
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
            case "delete":
                delete(request, response);
                break;
            default:
                showHome(request, response);
        }
    }

    private void showHome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        houseService.deleteById(id);
        showList(request, response);
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("payments", paymentService.findAll());
        request.getRequestDispatcher("obj1/create.jsp").forward(request, response);
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("houses", houseService.findAll());
        request.setAttribute("payments", paymentService.findAll());
        request.getRequestDispatcher("obj1/list.jsp").forward(request, response);
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
            default:
                response.sendRedirect("/MainServlet");
        }
    }

    private void doSearch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int searchInput = Integer.parseInt(request.getParameter("searchInput"));
        House house = houseService.findById(searchInput);
        request.setAttribute("house", house);
        request.getRequestDispatcher("obj1/search.jsp").forward(request, response);
    }

    private void doCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            String username = request.getParameter("userName");
            String dateStartText = request.getParameter("dateStart");
            Date dateStart = df.parse(dateStartText);
            int phoneNumber = Integer.parseInt(request.getParameter("phoneNumber"));
            int paymentId = Integer.parseInt(request.getParameter("paymentId"));
            String note = request.getParameter("note");
            Payment payment = paymentService.findById(paymentId);
            House house = new House(username, phoneNumber, dateStart, note, payment );
            houseService.save(house);
            response.sendRedirect("MainServlet?action=list");
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
    }
}
