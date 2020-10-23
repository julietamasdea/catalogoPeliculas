package mx.com.gm.peliculas.model;

public class Pelicula {
    //Representa los objetos pelicula utilizados en la aplicacion
    //catalogo de peliculas
    private String nombre;
    private static int contadorPeliculas;
    private final int id;


    public Pelicula(String nombre) {
        this();
        this.nombre = nombre;
    }

    public Pelicula() {
        this.id = ++contadorPeliculas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pelicula{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
