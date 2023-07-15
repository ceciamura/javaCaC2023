 package ar.com.codoacodo;

import java.time.LocalDateTime;

import ar.com.codoacodo.DAO.DAO;
import ar.com.codoacodo.DAO.MySqlDAOImplement;
import ar.com.codoacodo.opp.Articulo;
import ar.com.codoacodo.opp.Libro;


/**
 * Hello world!
 *
 */
public class Controller 
{
    public static void main( String[] args )
    {
    
        String titulo = "titulo del front";
        double precio = 1500;
        String autor = "autor que viene en el form";
        String codigo = "ABC1234";
        String isbn = "1223345";
        LocalDateTime ldt = LocalDateTime.now();
        String imagen = "";

        Articulo nuevo = new Libro(titulo, imagen, autor, precio, false, isbn, codigo, ldt);

        DAO dao = new MySqlDAOImplement();

        try {
            dao.create(nuevo);
        } catch (Exception e) {
           System.out.println("error - " + e.getMessage());
            
        }
        


    }
}
