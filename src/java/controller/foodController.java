/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Animals;
import entity.AnimalsFacadeLocal;
import entity.Foods;
import entity.FoodsFacadeLocal;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author NGUYEN HOANG BAO
 */
@WebServlet(name = "foodController", urlPatterns = {"/Foods/*"})
public class foodController extends HttpServlet {

    @EJB
    private AnimalsFacadeLocal animalsFacade;
    @EJB
    private FoodsFacadeLocal foodsFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Part part;
    public static final String SAVE_DIRECTORY = "ImageItems";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String path = request.getPathInfo();
           switch(path){
               case "/List":
                   show(request, response);
                   break;
               case "/Delete":
                   delete(request, response);
                   break;
               case "/Create":
                   getViewCreate(request, response);
                   break;
               case "/Store":
                   insert(request, response);
                   break;
               case "/Edit":
                   getViewEdit(request, response);
                   break;
               case "/Update":
                   update(request, response);
                   break;
               default:
                   out.print("Ko có");
                   break;
           }
        }
    }

    private String extracFile(Part part) {
        String i = part.getHeader("content-disposition");//form-data; name="file"; filename="Avatar.jpg"
        String[] items = i.split(";");//cat chuoi thanh mang sau mỗi dấu ;
        for (String s : items) {
            if (s.trim().startsWith("filename")) {//tìm chuoi bat dau bang filename
                String newS = s.substring(s.indexOf("=") + 2, s.length() - 1);//cat chuoi
                newS = newS.replace("\\", "/");
                int a = newS.lastIndexOf("/");
                return newS.substring(a + 1);
            }
        }
        return null;

    }

    private void saveToFolder(String savePath) {
        try {
            InputStream is = part.getInputStream();
            FileOutputStream fos = new FileOutputStream(savePath);
            byte[] buf = new byte[1024];
            int len;
            while ((len = is.read(buf)) > 0) {
                fos.write(buf, 0, len);
            }
        } catch (Exception e) {

        }
    }

    private String getFullPath(HttpServletRequest request, HttpServletResponse response) {
        String path = request.getServletContext().getRealPath("");
        path = path.replace("\\", "/");
        path = path.replace("build/", "");
        String fullPath = null;
        if (path.endsWith("/")) {
            fullPath = path + SAVE_DIRECTORY;
        } else {
            fullPath = path + File.separator + SAVE_DIRECTORY;
        }
        return fullPath;
    }

    private void show(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", foodsFacade.findAll());
        request.getRequestDispatcher("/Admin/food/foodList.jsp").forward(request, response);
    }

    private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        part = request.getPart("image");
        String fileName = extracFile(part);
        String description = request.getParameter("description");
        int cFId = Integer.parseInt(request.getParameter("cFId"));
        Animals animals = animalsFacade.find(cFId);
        Foods food = new Foods(id, name, price, fileName, description, animals);
        String savePath = getFullPath(request, response) + File.separator + fileName;
        saveToFolder(savePath);
        request.getRequestDispatcher("/Admin/food/foodList.jsp").forward(request, response);
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        Foods food = foodsFacade.find(id);
        String fileName = food.getImage();
        String pathDe = getFullPath(request, response) + File.separator + fileName;
        File file = new File(pathDe);
        file.delete();
        foodsFacade.remove(food);
        response.sendRedirect("List");
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        part = request.getPart("image");
        String fileName = extracFile(part);
        String description = request.getParameter("description");
        int cFId = Integer.parseInt(request.getParameter("cFId"));
        Animals animals = animalsFacade.find(cFId);
        Foods food = foodsFacade.find(id);
        String fileNameDe = food.getImage();
        String pathDe = getFullPath(request, response) + File.separator + fileNameDe;
        File fileDe = new File(pathDe);
        fileDe.delete();
        String savePath = getFullPath(request, response) + File.separator + fileName;
        saveToFolder(savePath);
        Foods foods = new Foods(id, name, price, fileName, description, animals);
        foodsFacade.edit(foods);
    }
    
    private void getViewList(HttpServletRequest request, HttpServletResponse response){
        request.getRequestDispatcher("/Admin/food/foodList.jsp");
    }
    
    private void getViewCreate(HttpServletRequest request, HttpServletResponse response){
        request.getRequestDispatcher("/Admin/food/addFood.jsp");
    }
    
    private void getViewEdit(HttpServletRequest request, HttpServletResponse response) throws IOException{
        if(request.getParameter("id") == null || request.getParameter("id").trim().isEmpty()){
            response.sendRedirect("List");
        }else{
            String id = request.getParameter("id");
            request.setAttribute("food", foodsFacade.find(id));
            request.getRequestDispatcher("/Admin/food/updateFood.jsp");
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
