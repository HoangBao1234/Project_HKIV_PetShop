/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cusController;

import entity.MembersFacadeLocal;
import entity.OdersDetails;
import entity.OdersDetailsFacadeLocal;
import entity.Orders;
import entity.OrdersFacadeLocal;
import entity.Pets;
import entity.PetsFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author NGUYEN HOANG BAO
 */
@WebServlet(name = "orderController", urlPatterns = {"/Order/*"})
public class orderController extends HttpServlet {

    @EJB
    private PetsFacadeLocal petsFacade;

    @EJB
    private MembersFacadeLocal membersFacade;
    @EJB
    private OdersDetailsFacadeLocal odersDetailsFacade;

    @EJB
    private OrdersFacadeLocal ordersFacade;

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
                case "/View":
                    getOrderView(request, response);
                    break;
                case "/Store":
                    addToCart(request, response);
                    break;
                case "/Delete":
                    delete(request, response);
                    break;
                default:
                    out.print("sai");
                    break;
            }

        }
    }

    private void getOrderView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/Customer/Cart/cart.jsp").forward(request, response);

    }

    private void addToCart(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int quantity = 1;
        HttpSession session = request.getSession();
        int total = 5;
        PrintWriter out = response.getWriter();
        if (request.getParameter("PId") != null && !request.getParameter("PId").trim().isEmpty()) {
            String id = request.getParameter("PId");
            Pets pet = petsFacade.find(id);
            String status = "running...";
            //neu chua co gio hang
            if (session.getAttribute("order") == null) {
                Orders orders = new Orders(status);
                ordersFacade.create(orders);
                List<OdersDetails> cart = new ArrayList<>();
                //items
                OdersDetails items = new OdersDetails(1, pet.getPId(), pet.getPName(), pet.getPrice(), quantity, pet.getImage(), orders);
                //add to list
                cart.add(items);
                //add to order
                orders.setOdersDetailsCollection(cart);
                total = items.getProductPrice() * items.getQuantity();
                orders.setTotal(total);
                ordersFacade.edit(orders);
                session.setAttribute("order", orders);
                request.getRequestDispatcher("/Customer/Cart/cart.jsp").forward(request, response);
            } else {
                Orders oders = (Orders) session.getAttribute("order");
                List<OdersDetails> itemList = (List<OdersDetails>) oders.getOdersDetailsCollection();
                
                boolean check = false;
                
                for (OdersDetails items : itemList) {
                    if (items.getProductId().equals(pet.getPId())) {
                        items.setQuantity(items.getQuantity() + quantity);
                        odersDetailsFacade.edit(items);
                        check = true;
                    }
                }
                
                if (check == false) {
                    OdersDetails items = new OdersDetails(pet.getPId(), pet.getPName(), pet.getPrice(), quantity, pet.getImage(), oders);
                    itemList.add(items);
                    odersDetailsFacade.create(items);
                    oders.setOdersDetailsCollection(itemList);
                }

                total = 0;
                for (OdersDetails items : itemList) {
                    total += items.getProductPrice() * items.getQuantity();
                }
                oders.setTotal(total);
                ordersFacade.edit(oders);
                session.setAttribute("order", oders);
                request.getRequestDispatcher("/Customer/Cart/cart.jsp").forward(request, response);
            }
        } else {
            out.print("Null");
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        if (session.getAttribute("order") != null) {
            String id = request.getParameter("productId");
            Orders orders = (Orders) session.getAttribute("order");
            List<OdersDetails> itemList = (List<OdersDetails>) orders.getOdersDetailsCollection();
            OdersDetails itemDe = null;
            for (OdersDetails item : itemList) {
                if (item.getProductId().equals(id)) {
                    itemDe = item;

                }
            }
            itemList.remove(itemDe);
            odersDetailsFacade.remove(odersDetailsFacade.find(itemDe.getOdId()));
            orders.setOdersDetailsCollection(itemList);
            session.setAttribute("order", orders);
            response.sendRedirect(request.getContextPath() + "/Order/View");
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
