package mx.com.gm.peliculas.service;

import mx.com.gm.peliculas.model.Pelicula;

import java.util.List;

public class CatalogoPeliculas implements ICatalogoPeliculas{
    /*
    Contiene la implementacion de las operaciones necesarias de la
    aplicacion CatalogoPeliculas
     */
    private IAccesoDatos datos;

    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        anexar = datos.existe(NOMBRE_RECURSO);
        this.datos.escribir(pelicula,NOMBRE_RECURSO,anexar);
    }

    public void listarPeliculas() {
        List<Pelicula> lista = this.datos.listar(NOMBRE_RECURSO);
        for (Pelicula pelicula:lista) {
            System.out.println(pelicula.getNombre());
        }
    }

    public void buscarPelicula(String buscar) {
        System.out.println(datos.buscar(NOMBRE_RECURSO,buscar));
    }

    public void iniciarArchivo() {
        if(this.datos.existe(NOMBRE_RECURSO)) {
            datos.borrar(NOMBRE_RECURSO);
            datos.crear(NOMBRE_RECURSO);
        } else {
            datos.crear(NOMBRE_RECURSO);
        }
    }

    public CatalogoPeliculas() {
        this.datos = new AccesoDatos();
    }
}
