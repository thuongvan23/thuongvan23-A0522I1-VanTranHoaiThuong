package Controller;

import Model.BenhAn;
import Model.BenhNhan;
import Service.BenhAnService;
import Service.BenhNhanService;
import Service.Impl.BenhAnServiceImpl;
import Service.Impl.BenhNhanServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "MainServlet", value = "/MainServlet")
public class MainServlet extends HttpServlet {

    BenhNhanService benhNhanService = new BenhNhanServiceImpl();
    BenhAnService benhAnService = new BenhAnServiceImpl();
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
        benhNhanService.deleteById(id);
        showList(request, response);
    }

    private void showUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        request.setAttribute("benhNhan", benhNhanService.findById(id));
        request.getRequestDispatcher("obj1/update.jsp").forward(request, response);
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("benhAns", benhAnService.findAll());
        request.getRequestDispatcher("obj1/create.jsp").forward(request, response);
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("benhNhans", benhNhanService.findAll());
        request.setAttribute("benhAns", benhAnService.findAll());
        request.getRequestDispatcher("obj1/list.jsp").forward(request, response);
    }

    private void showHome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
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

    private void doSearch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String searchInput = request.getParameter("searchInput");
        BenhNhan benhNhan = benhNhanService.findById(searchInput);
        request.setAttribute("benhNhan", benhNhan);
        request.getRequestDispatcher("obj1/search.jsp").forward(request, response);
    }

    private void doUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idUpdate = request.getParameter("idUpdate");
        try {
            String ten_benh_nhan = request.getParameter("ten_benh_nhan");
            Date ngay_nhap_vien = null;
            Date ngay_ra_vien = null;
            ngay_nhap_vien = df.parse(request.getParameter("ngay_nhap_vien"));
            ngay_ra_vien = df.parse(request.getParameter("ngay_ra_vien"));
            String li_do_nhap_vien = request.getParameter("li_do_nhap_vien");
            String ma_benh_nhan = benhNhanService.findById(idUpdate).getMa_benh_nhan();
            BenhAn benh_an = benhNhanService.findById(idUpdate).getBenh_an();

            BenhNhan benhNhan = new BenhNhan(ma_benh_nhan, ten_benh_nhan, ngay_nhap_vien, ngay_ra_vien, li_do_nhap_vien, benh_an);
            benhNhanService.update(benhNhan, idUpdate);
            showList(request, response);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private void doCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            String ma_benh_nhan = request.getParameter("ma_benh_nhan");
            String ten = request.getParameter("ten_benh_nhen");
            String ngay_nhap_vienText = request.getParameter("ngay_nhap_vien");
            String ngay_ra_vienText = request.getParameter("ngay_ra_vien");
            Date ngay_nhap_vien = df.parse(ngay_nhap_vienText);
            Date ngay_ra_vien = df.parse(ngay_ra_vienText);
            String li_do_nhap_vien = request.getParameter("li_do_nhap_vien");
            String ma_benh_an = request.getParameter("ma_benh_an");
            BenhAn benhAn = benhAnService.findById(ma_benh_an);
            BenhNhan benhNhan = new BenhNhan(ma_benh_nhan, ten, ngay_nhap_vien, ngay_ra_vien, li_do_nhap_vien, benhAn);
            benhNhanService.save(benhNhan);
            response.sendRedirect("MainServlet?action=list");
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
    }
}
