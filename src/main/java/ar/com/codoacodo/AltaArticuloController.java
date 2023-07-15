 package ar.com.codoacodo;

import java.io.IOException;
import java.time.LocalDateTime;

import ar.com.codoacodo.DAO.DAO;
import ar.com.codoacodo.DAO.MySqlDAOImplement;
import ar.com.codoacodo.opp.Articulo;
import ar.com.codoacodo.opp.Libro;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AltaArticuloController")
public class AltaArticuloController extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String titulo = req.getParameter("nombre");
        double precio = Double.parseDouble(req.getParameter("precio"));
        String autor = req.getParameter("autor");
        String codigo = req.getParameter("codigo");
        String isbn = req.getParameter("isbn");
        LocalDateTime ldt = LocalDateTime.now();
        String imagen = "";

        Articulo nuevo = new Libro(titulo, imagen, autor, precio, false, isbn, codigo, ldt);

        DAO dao = new MySqlDAOImplement();

        try {
            dao.create(nuevo);

            resp.sendRedirect(req.getContextPath()+ "/ListadoArticuloController");
        } catch (Exception e) {

            getServletContext().getRequestDispatcher("/nuevo.jsp").forward(req, resp);
           System.out.println("error - " + e.getMessage());
            
        }
        


    }
}
