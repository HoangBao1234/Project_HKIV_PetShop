/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Admins;
import entity.AdminsFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author NGUYEN HOANG BAO
 */
@WebServlet(name = "adminController", urlPatterns = {"/Admins/*"})
public class adminController extends HttpServlet {
    @EJB
    private AdminsFacadeLocal adminsFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String path = request.getPathInfo();

            switch (path) {
                case "/List":
                    getListView(request, response);
                    break;
                case "/Create":
                    getCreateView(request, response);
                    break;
                case "/Store":
                    insert(request, response);
                    break;
                case "/Edit":
                    getEditView(request, response);
                    break;
                case "/Update":
                    update(request, response);
                    break;
                case "/Delete":
                    delete(request, response);
                    break;
                case "/Login":
                    getViewLogin(request, response);
                    break;
                default:
                    out.print("huhu");
                    break;
            }
        }
    }

    private void getListView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", adminsFacade.findAll());
        request.getRequestDispatcher("/Admin/admin/adminList.jsp").forward(request, response);
    }

    private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String mail = request.getParameter("admins_mail");
        String password = request.getParameter("admins_pass");
        String msg = null;
        Admins ad = new Admins(mail, password);
        adminsFacade.create(ad);
        response.sendRedirect("List");
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Admins ad = adminsFacade.find(id);
        adminsFacade.remove(ad);
        response.sendRedirect("List");
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
        String mail = request.getParameter("admins_mail");
        String password = request.getParameter("admins_pass");
        Admins ad = new Admins(mail, password);
        adminsFacade.edit(ad);
    }

    private void getCreateView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Login/register_admin.jsp").forward(request, response);
    }

    private void getEditView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Admin/admin/updateAdmin.jsp").forward(request, response);
    }

    private void getViewLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Login/login.jsp").forward(request, response);
    }
    
    private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String mail = request.getParameter("txtMail");
            String password = request.getParameter("txtPassword");
            boolean check = false;
            // tao Session
            HttpSession session = request.getSession();
          
            for (Admins admin : adminsFacade.findAll()) {
                if (mail.equals(admin.getMail()) && password.equals(admin.getPassword())) {
                    // luu vao session
                    session.setAttribute("username", admin);

                    // tao Cookie lay thong tin cua nguoi dung de nho lai
                    Cookie user = new Cookie("user", mail);
                    Cookie pass = new Cookie("pass", password);
                    if (request.getParameter("chkRemember") != null) {
                        user.setMaxAge(60 * 60 * 24);
                        pass.setMaxAge(60 * 60 * 24);
                    } else {
                        user.setMaxAge(0);
                        pass.setMaxAge(0);
                    }
                    response.addCookie(user);
                    response.addCookie(pass);
                    RequestDispatcher dis = request.getRequestDispatcher("index.jsp");
                    dis.forward(request, response);
                    check = true;
                }
            }
            if (check == false) {
                request.setAttribute("error", "Username or Password invalid !");
                request.getRequestDispatcher("Login/login.jsp").forward(request, response);
            }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
