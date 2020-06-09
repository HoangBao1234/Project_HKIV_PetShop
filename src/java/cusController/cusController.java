/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cusController;

import entity.Members;
import entity.MembersFacadeLocal;
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
@WebServlet(name = "cusController", urlPatterns = {"/Customer/*"})
public class cusController extends HttpServlet {

    @EJB
    private MembersFacadeLocal membersFacade;

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
                case "/Login":
                    getViewLogin(request, response);
                    break;
                case "/Check":
                    login(request, response);
                    break;
                case "/Success":
                    success(request, response);
                    break;
                case "/Register":
                    getRegisterView(request, response);
                    break;
                case "/Store":
                    register(request, response);
                    break;
                default:
                    getViewError(request, response);
                    break;
            }

        }
    }

    private void getViewError(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
    }
    private void getViewLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Login/login.jsp").forward(request, response);
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mail = request.getParameter("txtMail");
        String password = request.getParameter("txtPassword");
        boolean check = false;
        // tao Session
        HttpSession session = request.getSession();

        for (Members member : membersFacade.findAll()) {
            if (mail.equals(member.getMail()) && password.equals(member.getPassword())) {
                // luu vao session
                session.setAttribute("username", member);

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
                response.sendRedirect(request.getContextPath());
                check = true;
            }
        }
        if (check == false) {
            request.setAttribute("error", "Username or Password invalid !");
            response.sendRedirect("Login");
        }
    }

    private void success(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Project_HKIV_PetShop/index.jsp").forward(request, response);
        
    }

    private void getRegisterView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Login/register.jsp").forward(request, response);
    }

    private void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("regis_name");
        String mail = request.getParameter("regis_mail");
        String password = request.getParameter("regis_pass");
        String phone = request.getParameter("regis_phone");
        String address = request.getParameter("regis_address");
        Members mem = new Members(name, mail, password, phone, address);
        membersFacade.create(mem);
        response.sendRedirect("Login");
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
