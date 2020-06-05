/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Animals;
import entity.AnimalsFacadeLocal;
import entity.Breeds;
import entity.BreedsFacadeLocal;
import entity.Pets;
import entity.PetsFacadeLocal;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author NGUYEN HOANG BAO
 */
@WebServlet(name = "petController", urlPatterns = {"/Pet/*"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 * 1024 * 10, maxRequestSize = 1024 * 1024 * 50)
public class petController extends HttpServlet {

    @EJB
    private BreedsFacadeLocal breedsFacade;
    @EJB
    private AnimalsFacadeLocal animalsFacade;

    @EJB
    private PetsFacadeLocal petsFacade;
    Part part;
    public static final String SAVE_DIRECTORY = "ImageItems";

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
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String path = request.getPathInfo();

            switch (path) {
                case "/List":
                    getViews(request, response);
                    break;
                case "/Create":
                    getViewCreate(request, response);
                    break;
                case "/Store":
                    insert(request, response);
                    break;
                case "/Delete":
                    delete(request, response);
                    break;
                case "/Edit":
                    getViewEdit(request, response);
                    break;
                case "/Update":
                    update(request, response);
                    break;
                default:
                    out.print("Khong co trang nay");
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

    private String getFullPath(HttpServletRequest request) {
        String appPath = request.getServletContext().getRealPath("");
        appPath = appPath.replace('\\', '/');
        appPath = appPath.replace("build/", "");
        String fullSavePath = null;
        if (appPath.endsWith("/")) {
            fullSavePath = appPath + SAVE_DIRECTORY;
        } else {
            fullSavePath = appPath + "/" + SAVE_DIRECTORY;
        }
        return fullSavePath;
    }

    private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id = request.getParameter("pet_id");
        String name = request.getParameter("pet_name");
        String color = request.getParameter("color");
        String age = request.getParameter("age");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String origin = request.getParameter("origin");
        int price = Integer.parseInt(request.getParameter("price"));
        String description = request.getParameter("description");
        int AId = Integer.parseInt(request.getParameter("animals"));
        int BId = Integer.parseInt(request.getParameter("breeds"));
        part = request.getPart("image");
        String filename = extracFile(part);
        String savePath = getFullPath(request) + File.separator + filename;
        saveToFolder(savePath);
        Animals animals = animalsFacade.find(AId);
        Breeds breeds = breedsFacade.find(BId);  
        Pets pet = new Pets(id, name, color, age, gender, origin, price, filename, description, animals, breeds);
        petsFacade.create(pet);
        response.sendRedirect("List");
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String pId = request.getParameter("pet_id");
        String name = request.getParameter("pet_name");
        String color = request.getParameter("color");
        String age = request.getParameter("age");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String origin = request.getParameter("origin");
        int price = Integer.parseInt(request.getParameter("price"));
        int AId = Integer.parseInt(request.getParameter("animals"));
        int BId = Integer.parseInt(request.getParameter("breeds"));
        String description = request.getParameter("description");
        Animals animals = animalsFacade.find(AId);
        Breeds breeds = breedsFacade.find(BId);
        part = null;
        part = request.getPart("image");
        
        //find hinh cu
        Pets pet = petsFacade.find(pId);
        //xoa hinh cu
        String dePath = getFullPath(request) + File.separator + pet.getImage();
        File file = new File(dePath);
        file.delete();
        
        //update hinh moi
        String fileName = extracFile(part);
        String savePath = getFullPath(request) + File.separator + fileName;
        saveToFolder(savePath);
        Pets petUp = new Pets(pId, name, color, age, gender, origin, price, fileName, description, animals, breeds);
        petsFacade.edit(petUp);
        response.sendRedirect("List");
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String pId = request.getParameter("PId");
        Pets pet = petsFacade.find(pId);
        String dePath = getFullPath(request) + File.separator + pet.getImage();
        File file = new File(dePath);
        file.delete();
        petsFacade.remove(pet);
        response.sendRedirect("/List");
    }

    private Pets findById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Pets pet = petsFacade.find(id);
        return pet;
    }

    private void getViews(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        request.setAttribute("list", petsFacade.findAll());
        request.getRequestDispatcher("/Admin/pet/petList.jsp").forward(request, response);
    }

    private void getViewCreate(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        request.setAttribute("animals", animalsFacade.findAll());
        request.setAttribute("breeds", breedsFacade.findAll());
        request.getRequestDispatcher("/Admin/pet/addPet.jsp").forward(request, response);
    }

    private void getViewEdit(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {

        if (request.getParameter("id") == null || request.getParameter("id").trim().isEmpty()) {
            response.sendRedirect("List");
        } else {
            String id = request.getParameter("id");
            request.setAttribute("animals", animalsFacade.findAll());
            request.setAttribute("breeds", breedsFacade.findAll());
            request.setAttribute("pet", petsFacade.find(id));
            request.getRequestDispatcher("/Admin/pet/updatePet.jsp").forward(request, response);
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
        try {
            processRequest(request, response);

        } catch (ParseException ex) {
            Logger.getLogger(petController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);

        } catch (ParseException ex) {
            Logger.getLogger(petController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
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
