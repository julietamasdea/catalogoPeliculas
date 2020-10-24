package mx.com.gm.peliculas.service;

public interface ICatalogoPeliculas {
    /*
    Contiene las operaciones necesarias de la aplicacion
    CatalogoPeliculas
     */
    String NOMBRE_RECURSO = "peliculas.txt";
    void agregarPelicula(String nombrePelicula);
    void listarPeliculas();
    void buscarPelicula(String buscar);
    void iniciarArchivo();
}
