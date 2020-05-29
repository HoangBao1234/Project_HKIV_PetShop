/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Animals;
import entity.AnimalsFacadeLocal;
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
@WebServlet(name = "animalsController", urlPatterns = {"/animalsController"})
public class animalsController extends HttpServlet {

    @EJB
    private AnimalsFacadeLocal animalsFacade;

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
            String action = request.getParameter("action");
            if (action.equals("Insert")) {
                String name = request.getParameter("animals_name");
                Animals animals = new Animals(name);
                animalsFacade.create(animals);
                out.print("Ok");
                request.setAttribute("list", animalsFacade.findAll());
                request.getRequestDispatcher("showAnimals.jsp").forward(request, response);

            }
            if (action.equals("Show")) {
                request.setAttribute("list", animalsFacade.findAll());
                request.getRequestDispatcher("showAnimals.jsp").forward(request, response);
            }
            if (action.equals("Delete")) {
                int id = Integer.parseInt("id");
                Animals an = animalsFacade.find(id);
                animalsFacade.remove(an);
                request.setAttribute("list", animalsFacade.findAll());
                request.getRequestDispatcher("showAnimals.jsp").forward(request, response);
            }
            if (action.equals("findId")) {
                int id = Integer.parseInt("id");

                Animals an = animalsFacade.find(id);
                request.setAttribute("an", an);
                request.getRequestDispatcher("updateAnimals.jsp").forward(request, response);
            }
            if (action.equals("update")) {
                int id = Integer.parseInt("id");
                String name = request.getParameter("name");
                Animals an = new Animals(id, name);
                animalsFacade.edit(an);
                request.setAttribute("list", animalsFacade.findAll());
                request.getRequestDispatcher("showAnimals.jsp").forward(request, response);
            }
            
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
