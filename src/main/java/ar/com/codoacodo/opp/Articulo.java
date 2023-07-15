package ar.com.codoacodo.opp;

import java.time.LocalDateTime;

public class Articulo {

    protected Long id;
    protected String titulo;
    protected double precio;
    protected String imagen; 
    protected String autor;
    protected boolean novedad;
    protected LocalDateTime fechaCreacion;//alt+shit+r
    protected String codigo;



          //constructor con id

          
    public Articulo(Long id2, String titulo, double precio, String imagen, String autor, boolean novedad,
            LocalDateTime fechaCreacion, String codigo) {
        this.titulo = titulo;

        this.precio = precio;
        this.imagen = imagen;
        this.autor = autor;
        this.novedad = false;
        this.fechaCreacion = fechaCreacion;
        this.codigo = codigo;
    }

        //constructor con id

    public Articulo(Long id, String titulo, String imagen2, String imagen, Double precio2, boolean novedad,
            String codigo2, LocalDateTime localDateTime) {

        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.imagen = imagen;
        this.autor = autor;
        this.novedad = false;
        this.fechaCreacion = fechaCreacion;
        this.codigo = codigo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    @Override
    public String toString() {
        return "Articulo [titulo=" + titulo + ", precio=" + precio + ", imagen=" + imagen + ", autor=" + autor
                + ", novedad=" + novedad + ", fechaCreacion=" + fechaCreacion + "]";
    }


    
    
   

    

}
