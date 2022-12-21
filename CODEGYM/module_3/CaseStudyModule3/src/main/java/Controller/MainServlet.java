package Controller;

import Model.Customer;
import Model.CustomerType;
import Service.CustomerService;
import Service.CustomerTypeService;
import Service.Impl.CustomerServiceImpl;
import Service.Impl.CustomerTypeServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "MainServlet", value = "/MainServlet")
public class MainServlet extends HttpServlet {
    CustomerService customerService = new CustomerServiceImpl();
    CustomerTypeService customerTypeService = new CustomerTypeServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "home";
        }
        switch (action) {
            case "createCustomer":
                showCreateCustomer(request, response);
                break;
            case "showAllCustomer":
                showAllCustomer(request, response);
                break;
            case "createNewService":
                createNewService(request, response);
                break;
            case "createEmployee":
                createEmployee(request, response);
                break;
            case "showAllEmployee":
                showAllEmployee(request, response);
                break;
            case "createContract":
                createContract(request, response);
                break;
            default:
                showHome(request, response);
        }
    }

    private void createContract(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("createContract.jsp").forward(request, response);
    }

    private void showAllEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("showAllEmployee.jsp").forward(request, response);
    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("createEmployee.jsp").forward(request, response);
    }

    private void createNewService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("createNewService.jsp").forward(request, response);
    }

    private void showAllCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("allCustomer.jsp").forward(request, response);
    }

    private void showCreateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("customer.jsp").forward(request, response);
    }

    private void showHome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        switch (action){
            case "createCustomer":
                doCreateCustomer(request, response);
                break;
        }
    }

    private void doCreateCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String id = request.getParameter("customerId");
        String name = request.getParameter("fullName");
        Date birthday = null;
        try {
            birthday = df.parse(request.getParameter("birthday"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Integer gender = Integer.valueOf(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String customerTypeId = request.getParameter("customerTypeId");
        CustomerType customerType = customerTypeService.findById(customerTypeId);
        Customer customer = new Customer(id, name, birthday, gender, idCard, phoneNumber, email, address, customerType);
        customerService.createOrUpdate(customer);
        response.sendRedirect("MainServlet?action=showAllCustomer");
    }
}
