/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Members;
import entity.MembersFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author NGUYEN HOANG BAO
 */
@WebServlet(name = "memberController", urlPatterns = {"/Member/*"})
public class memberController extends HttpServlet {

    @EJB
    private MembersFacadeLocal membersFacade;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String path = request.getPathInfo();
            switch (path) {
                case "/List":
                    getListView(request, response);
                    break;
                case "/Delete":
                    delete(request, response);
                    break;
                case "/Details":
                    getViewEdit(request, response);
                    break;
                case "/Create":
                    getViewCreate(request, response);
                    break;
                case "/Store":
                    insert(request, response);
                default:
                    out.print("Sai");
                    break;
            }
        }
    }

    private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("members_name");
        String mail = request.getParameter("mail");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        Members members = new Members(name, mail, password, phone, address);
        membersFacade.create(members);
        response.sendRedirect("List");
    }

    private Members findById(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        return membersFacade.find(id);
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Members members = membersFacade.find(id);
        membersFacade.remove(members);
        request.setAttribute("list", membersFacade.findAll());
        request.getRequestDispatcher("/Admin/member/memberList.jsp").forward(request, response);
    }
    
    private void update(HttpServletRequest request, HttpServletResponse response) throws IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("members_name");
        String mail = request.getParameter("mail");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        Members members = new Members(id, name, mail, password, phone, address);
        membersFacade.edit(members);
        response.sendRedirect("List");
    }

    private void getListView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", membersFacade.findAll());
        request.getRequestDispatcher("/Admin/member/memberList.jsp").forward(request, response);
    }
    
    private void getViewCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Login/register.jsp").forward(request, response);
    }
    
    private void getViewEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        if (request.getParameter("id") == null || request.getParameter("id").trim().isEmpty()) {
//            request.getRequestDispatcher("/Admin/member/memberList.jsp").forward(request, response);
            response.sendRedirect("List");
        } else {
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("member", membersFacade.find(id));
            request.getRequestDispatcher("/Admin/member/memberDetail.jsp").forward(request, response);
        }

    }

    public memberController() {
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
