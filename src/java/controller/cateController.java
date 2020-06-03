/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Admins;
import entity.CateES;
import entity.CateESFacadeLocal;
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
@WebServlet(name = "cateController", urlPatterns = {"/Cate/*"})
public class cateController extends HttpServlet {

    @EJB
    private CateESFacadeLocal cateESFacade;

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
            
            switch(path){
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
               default:
                   out.print("Sai");
                   break;
           }
        }
    }

    private void getListView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", cateESFacade.findAll());
        request.getRequestDispatcher("/Admin/cate/cateList.jsp").forward(request, response);
    }

    private void insert(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("admins_id"));
        String username = request.getParameter("admins_name");
        CateES cate = new CateES(id, username);
        cateESFacade.create(cate);
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt("id");
        CateES cate = cateESFacade.find(id);
        cateESFacade.remove(cate);
        response.sendRedirect("List");
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("admins_id"));
        String username = request.getParameter("admins_name");

        CateES cate = new CateES(id, username);
        cateESFacade.edit(cate);
        response.sendRedirect("List");
    }

    private void getCreateView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.getRequestDispatcher("/Admin/cate/cateList.jsp").forward(request, response);
    }
    
    private void getEditView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.getRequestDispatcher("/Admin/cate/updateCate.jsp").forward(request, response);
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
