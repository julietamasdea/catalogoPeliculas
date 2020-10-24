package mx.com.gm.peliculas.service;

import mx.com.gm.peliculas.model.Pelicula;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatos implements IAccesoDatos{


    public boolean existe(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    public List<Pelicula> listar(String nombreArchivo) {
        List<Pelicula> listaPeliculas = new ArrayList();
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while (lectura != null) {
                Pelicula pelicula = new Pelicula();
                pelicula.setNombre(lectura);
                listaPeliculas.add(pelicula);
                lectura = entrada.readLine();
            }
            return listaPeliculas;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String buscar(String nombreArchivo, String buscar) {
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while (lectura != null) {
                if (buscar.equals(lectura)) {
                    return lectura;
                }
                lectura = entrada.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,anexar));
            salida.println(pelicula.getNombre());
            salida.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crear(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void borrar(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        archivo.delete();
    }
}
