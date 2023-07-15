package ar.com.codoacodo.opp;

import java.time.LocalDateTime;

public class Libro extends Articulo {
    
    private String isbn;

    public Libro(Long id, String titulo, double precio, String imagen, String autor, boolean novedad,
            LocalDateTime fechaCreacion, String codigo, String isbn) {

        super(id, titulo, precio, imagen, autor, novedad, fechaCreacion, codigo);
        
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    @Override
    public String toString() {
      
        return super.toString() + ", Libro [isbn=" + isbn + "]";
    }

    

}
