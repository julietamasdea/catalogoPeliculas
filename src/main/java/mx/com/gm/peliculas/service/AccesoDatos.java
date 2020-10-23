package mx.com.gm.peliculas.service;

import mx.com.gm.peliculas.model.Pelicula;

import java.util.List;

public class AccesoDatos implements IAccesoDatos{


    public boolean existe(String nombreArchivo) {
        return false;
    }

    public List<Pelicula> listar(String nombre) {
        return null;
    }

    public String buscar(String nombreArchivo, String buscar) {
        return null;
    }

    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {

    }

    public void crear(String nombreArchivo) {

    }

    public void borrar(String nombreArchivo) {

    }
}
