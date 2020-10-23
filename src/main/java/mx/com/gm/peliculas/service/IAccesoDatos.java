package mx.com.gm.peliculas.service;

import mx.com.gm.peliculas.model.Pelicula;

import java.util.List;

public interface IAccesoDatos {
    /*
    Contiene las operaciones a ejecutar en el archivo de
    peliculas.txt
     */

    boolean existe(String nombreArchivo);
    List<Pelicula> listar(String nombre);
    String buscar(String nombreArchivo, String buscar);
    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar);
    void crear(String nombreArchivo);
    void borrar(String nombreArchivo);
}
