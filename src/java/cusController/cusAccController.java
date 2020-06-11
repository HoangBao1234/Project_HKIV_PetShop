/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cusController;

import entity.AccessoriesFacadeLocal;
import entity.AnimalsFacadeLocal;
import entity.BreedsFacadeLocal;
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
@WebServlet(name = "cusAccController", urlPatterns = {"/AccessoriesProduct/*"})
public class cusAccController extends HttpServlet {

    @EJB
    private BreedsFacadeLocal breedsFacade;
    @EJB
    private CateESFacadeLocal cateESFacade;
    @EJB
    private AccessoriesFacadeLocal accessoriesFacade;
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
            String path = request.getPathInfo();

            switch (path) {
                case "/All":
                    getViewAll(request, response);
                    break;
                case "/ShowByAnimals":
                    getViewAnimals(request, response);
                    break;
                case "/ShowByCate":
                    getViewCate(request, response);
                    break;
                case "/Detail":
                    getDetailView(request, response);
                default:
                    out.print("Huhu");
                    break;
            }
        }
    }

    private void getViewAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", accessoriesFacade.findAll());
        request.setAttribute("animals", animalsFacade.findAll());
        request.setAttribute("cate", cateESFacade.findAll());
        request.getRequestDispatcher("/Customer/Accessories/index.jsp").forward(request, response);
    }

    private void getDetailView(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.getParameter("id") == null || request.getParameter("id").trim().isEmpty()) {
            response.sendRedirect("All");
        } else {
            String id = request.getParameter("id");
            request.setAttribute("acc", accessoriesFacade.find(id));
            request.getRequestDispatcher("/Customer/Accessories/detail.jsp").forward(request, response);
        }
    }

    private void getViewAnimals(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("id") == null || request.getParameter("id").trim().isEmpty()) {
            response.sendRedirect("All");
        } else {
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("animals", animalsFacade.find(id));
            request.getRequestDispatcher("/Customer/Accessories/showByAnimals.jsp").forward(request, response);
        }

    }

    private void getViewCate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("id") == null || request.getParameter("id").trim().isEmpty()) {
            response.sendRedirect("All");
        } else {
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("cates", cateESFacade.find(id));
            request.getRequestDispatcher("/Customer/Accessories/showByCate.jsp").forward(request, response);
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
