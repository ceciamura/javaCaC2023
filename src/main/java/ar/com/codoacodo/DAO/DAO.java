package ar.com.codoacodo.DAO;

import java.util.ArrayList;

import ar.com.codoacodo.opp.Articulo;

public interface DAO {
    
    public Articulo getById(Long id) throws Exception;
    public void delete(Long id) throws Exception;
    public void update(Articulo articulo) throws Exception;
    public void create(Articulo articulo) throws Exception;
    
    public ArrayList<Articulo> findAll() throws Exception;
    public ArrayList<Articulo> findAllByTitle(String clave) throws Exception;

    

}
