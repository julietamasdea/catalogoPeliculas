package mx.com.gm.laboratorioFinal;

import mx.com.gm.peliculas.service.AccesoDatos;
import mx.com.gm.peliculas.service.CatalogoPeliculas;
import mx.com.gm.peliculas.service.ICatalogoPeliculas;

import java.util.Scanner;

public class LaboratorioFinal {
    /*
    Contiene el menu que permite al usuario seleccionar
    la accion a ejecutar sobre el catalogo de peliculas
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogoPeliculas = new CatalogoPeliculas();
        String pelicula = new String();
        catalogoPeliculas.iniciarArchivo();
        int accion = 1;
        while (accion != 0) {
            System.out.println("Ingrese opcion \n"
            + "0: Salir \n"
            + "1: Agregar pelicula \n"
            + "2: Listar Peliculas de catalogo \n"
            + "3: Buscar Pelicula \n");
            accion = Integer.parseInt(scanner.nextLine());
            switch (accion) {
                case 1:
                    System.out.println("Ingrese nombre de pelicula");
                    pelicula = scanner.nextLine();
                    catalogoPeliculas.agregarPelicula(pelicula);
                    break;

                case 2:
                    catalogoPeliculas.listarPeliculas();
                    break;
                case 3:
                    System.out.println("Ingrese nombre de pelicula");
                    pelicula = scanner.nextLine();
                    catalogoPeliculas.buscarPelicula(pelicula);
                    break;
            }
        }

    }

}
