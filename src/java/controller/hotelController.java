/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Members;
import entity.MembersFacadeLocal;
import entity.Pethotel;
import entity.PethotelFacadeLocal;
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
@WebServlet(name = "hotelController", urlPatterns = {"/hotelController"})
public class hotelController extends HttpServlet {

    @EJB
    private MembersFacadeLocal membersFacade;
    @EJB
    private PethotelFacadeLocal pethotelFacade;

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

        }
    }

    private void show(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("list", pethotelFacade.findAll());
    }

    private void insert(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        String namePet = request.getParameter("namePet");
        String dateStart = request.getParameter("dateStart");
        String dateEnd = request.getParameter("dateEnd");
        int price = Integer.parseInt(request.getParameter("price"));
        String mId = request.getParameter("MId");
        Members member = membersFacade.find(mId);
        Pethotel hotel = new Pethotel(mId, namePet, dateStart, dateEnd, price, null, member);
        pethotelFacade.create(hotel);
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        Pethotel hoPethotel = pethotelFacade.find(id);
        pethotelFacade.remove(hoPethotel);
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        String namePet = request.getParameter("namePet");
        String dateStart = request.getParameter("dateStart");
        String dateEnd = request.getParameter("dateEnd");
        int price = Integer.parseInt(request.getParameter("price"));
        String mId = request.getParameter("MId");
        Members member = membersFacade.find(mId);
        Pethotel hotel = new Pethotel(mId, namePet, dateStart, dateEnd, price, null, member);
        pethotelFacade.edit(hotel);
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
