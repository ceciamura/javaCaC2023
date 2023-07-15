 package ar.com.codoacodo;

import java.io.IOException;
import ar.com.codoacodo.DAO.DAO;
import ar.com.codoacodo.DAO.MySqlDAOImplement;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DeleteArticuloController")
public class DeleteArticuloController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String id = req.getParameter("id");

        DAO dao = new MySqlDAOImplement();
       
        
        try {
            dao.delete(Long.parseLong(id));
            resp.sendRedirect(req.getContextPath()+ "/ListadoArticuloController");
        }  catch (Exception e) {
            e.getMessage();
        }


    }
}
