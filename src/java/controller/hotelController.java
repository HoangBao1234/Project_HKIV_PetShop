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
@WebServlet(name = "hotelController", urlPatterns = {"/Hotel/*"})
public class hotelController extends HttpServlet {

    @EJB
    private PethotelFacadeLocal pethotelFacade;

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
                case "/List":
                    getListView(request, response);
                    break;
                case "/Delete":
                    delete(request, response);
                    break;
                case "/Edit":
                    getEditView(request, response);
                    break;
                case "/Update":
                    update(request, response);
                    break;
                default:
                    getViewError(request, response);
                    break;
            }

        }
    }

    private void getViewError(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
    }

    private void getListView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("hotelList", pethotelFacade.findAll());
        request.getRequestDispatcher("/Admin/hotel/hotelList.jsp").forward(request, response);
    }

    private void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String id = request.getParameter("id");
            String namePet = request.getParameter("namePet");
            String dateStart = request.getParameter("dateStart");
            String dateEnd = request.getParameter("dateEnd");
            int price = Integer.parseInt(request.getParameter("price"));
            String status = request.getParameter("status");
            String mId = request.getParameter("MId");
            Members member = membersFacade.find(mId);
            Pethotel hotel = new Pethotel(mId, namePet, dateStart, dateEnd, price, status, member);
            pethotelFacade.create(hotel);
        } catch (Exception e) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            String id = request.getParameter("id");
            Pethotel hoPethotel = pethotelFacade.find(id);
            pethotelFacade.remove(hoPethotel);
            response.sendRedirect("List");
        } catch (Exception e) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String id = request.getParameter("id");
            String namePet = request.getParameter("namePet");
            String dateStart = request.getParameter("dateStart");
            String dateEnd = request.getParameter("dateEnd");
            int price = Integer.parseInt(request.getParameter("price"));
            String status = request.getParameter("status");
            String mId = request.getParameter("MId");
            Members member = membersFacade.find(mId);
            Pethotel hotel = new Pethotel(mId, namePet, dateStart, dateEnd, price, status, member);
            pethotelFacade.edit(hotel);
        } catch (Exception e) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }
    }

    private void getEditView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            if (request.getParameter("id") == null || request.getParameter("id").trim().isEmpty()) {
                response.sendRedirect("List");
            } else {
                String id = request.getParameter("id");
                request.setAttribute("members", membersFacade.findAll());
                request.setAttribute("hotel", pethotelFacade.find(id));

                request.getRequestDispatcher("/Admin/hotel/updateHotel.jsp").forward(request, response);
            }
        } catch (Exception e) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
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
