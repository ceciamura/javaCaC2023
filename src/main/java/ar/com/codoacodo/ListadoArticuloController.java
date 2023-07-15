 package ar.com.codoacodo;

import java.io.IOException;
import java.util.ArrayList;

import ar.com.codoacodo.DAO.DAO;
import ar.com.codoacodo.DAO.MySqlDAOImplement;
import ar.com.codoacodo.opp.Articulo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ListadoArticuloController")
public class ListadoArticuloController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{


        DAO dao = new MySqlDAOImplement();

        try {
         ArrayList <Articulo> listado =  dao.findAll();

         req.setAttribute("listado", listado);

        } catch (Exception e) {

            var listado = new ArrayList<>();
            req.setAttribute("listado", listado);

           req.setAttribute("error", e.getMessage());
            
        }
        
        getServletContext().getRequestDispatcher("/listado.jsp").forward(req, resp);

    }
}
