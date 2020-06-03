/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Admins;
import entity.AdminsFacadeLocal;
import entity.Breeds;
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
@WebServlet(name = "adminController", urlPatterns = {"/adminController"})
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
            
        }
    }

    private void show(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("list", adminsFacade.findAll());
    }

    private void insert(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("admins_id"));
        String username = request.getParameter("admins_name");
        String password = request.getParameter("admins_pass");
        Admins ad = new Admins(id, username, password);
        adminsFacade.create(ad);
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt("id");
        Admins ad = adminsFacade.find(id);
        adminsFacade.remove(ad);
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("admins_id"));
        String username = request.getParameter("admins_name");
        String password = request.getParameter("admins_pass");
        Admins ad = new Admins(id, username, password);
        adminsFacade.edit(ad);
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
