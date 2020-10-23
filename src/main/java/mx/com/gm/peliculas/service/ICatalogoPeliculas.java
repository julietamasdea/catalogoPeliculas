package mx.com.gm.peliculas.service;

public interface ICatalogoPeliculas {
    /*
    Contiene las operaciones necesarias de la aplicacion
    CatalogoPeliculas
     */
    void agregarPelicula(String nombrePelicula, String nombreArchivo);
    void listarPeliculas(String nombreArchivo);
    void buscarPelicuala(String nombreArchivo, String buscar);
    void iniciarArchivo(String nombreArchivo);
}
