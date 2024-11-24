/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondelibrerias;

/*
Martín Valetta - 251093
Santiago Oliveros - 339937
*/

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Libreria {

    // Atributos
    private ArrayList<Editorial> listaEditoriales;
    private ArrayList<Genero> listaGeneros;
    private ArrayList<Autor> listaAutores;
    private ArrayList<Libro> listaLibros;
    private ArrayList<Venta> listaVentas;

    // Constructor vacío
    public Libreria() {
        this.listaEditoriales = new ArrayList<>();
        this.listaGeneros = new ArrayList<>();
        this.listaAutores = new ArrayList<>();
        this.listaLibros = new ArrayList<>();
        this.listaVentas = new ArrayList<>();
    }

    // Getters y Setters
    public ArrayList<Editorial> getListaEditoriales() {
        return this.listaEditoriales;
    }

    public void setListaEditoriales(ArrayList<Editorial> listaEditoriales) {
        this.listaEditoriales = listaEditoriales;
    }

    public ArrayList<Genero> getListaGeneros() {
        return this.listaGeneros;
    }

    public void setListaGeneros(ArrayList<Genero> listaGeneros) {
        this.listaGeneros = listaGeneros;
    }

    public ArrayList<Autor> getListaAutores() {
        return this.listaAutores;
    }

    public void setListaAutores(ArrayList<Autor> listaAutores) {
        this.listaAutores = listaAutores;
    }

    public ArrayList<Libro> getListaLibros() {
        return this.listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ArrayList<Venta> getListaVentas() {
        return this.listaVentas;
    }

    public void setListaVentas(ArrayList<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }
    // Fin Getters y Setters
    
    // Agregar elementos a las listas
    public void agregarEditorial(Editorial editorial) {
        this.listaEditoriales.add(editorial);
    }

    public void agregarGenero(Genero genero) {
        this.listaGeneros.add(genero);
    }

    public void agregarAutor(Autor autor) {
        this.listaAutores.add(autor);
    }

    public void agregarLibro(Libro libro) {
        this.listaLibros.add(libro);
    }

    public void agregarVenta(Venta venta) {
        this.listaVentas.add(venta);
    }
    // Fin de metodos de agregacion
    
    // Verificar si el nombre del genero no está repetido
    public boolean generoRepetido(String nombre) {
        boolean repetido = false;
        
        for (Genero actual : this.getListaGeneros()) {
            if (actual.getNombre().trim().equalsIgnoreCase(nombre.trim())) {
                repetido = true;
                break;
            }
        }
        
        return repetido; 
    }
    
    // Verificar si el nombre del autor no esta repetido
    public boolean autorRepetido(String nombre) {
        boolean repetido = false;
    
        for (Autor actual : this.getListaAutores()) {
            if (actual.getNombre().trim().equalsIgnoreCase(nombre.trim())) {
                repetido = true;
                break;
            }
        }
        
        return repetido;
    }
    
    // Verificamos si el nombre de la editorial no esta repetido
    public boolean editorialRepetida(String nombre) {
        boolean repetido = false;

        for (Editorial actual : this.getListaEditoriales()) {
            if (actual.getNombre().trim().equalsIgnoreCase(nombre.trim())) {
                repetido = true;
                break;
            }
        }

        return repetido; 
    }
    
    // Verificamos si el isbn del libro no esta repetieo
    public boolean libroRepetido(String isbn) {
        boolean repetido = false;
        
        for (Libro actual : this.getListaLibros()) {
            if (actual.getIsbn().trim().equalsIgnoreCase(isbn.trim())) {
                repetido = true;
                break;
            }
        }
        
        return repetido;
    }
    
    
    public void cargarDatos() {
        String directorioDatos = System.getProperty("user.dir") + File.separator + "datos";

        // Crear la carpeta si no existe
        File carpetaDatos = new File(directorioDatos);
        if (!carpetaDatos.exists()) {
            carpetaDatos.mkdir();
            return; // Si no hay carpeta, no hay datos para cargar
        }

        try {
            // Cargar Editoriales
            Path archivoEditoriales = Paths.get(directorioDatos, "editoriales.txt");
            if (Files.exists(archivoEditoriales)) {
                List<String> lineas = Files.readAllLines(archivoEditoriales);
                for (String linea : lineas) {
                    String[] partes = linea.split("\\|");
                    if (partes.length == 2) {
                        String nombre = partes[0].trim();
                        String pais = partes[1].trim();
                        if (!editorialRepetida(nombre)) {
                            agregarEditorial(new Editorial(nombre, pais));
                        }
                    }
                }
            }

            // Cargar Géneros
            Path archivoGeneros = Paths.get(directorioDatos, "generos.txt");
            if (Files.exists(archivoGeneros)) {
                List<String> lineas = Files.readAllLines(archivoGeneros);
                for (String linea : lineas) {
                    String[] partes = linea.split("\\|");
                    if (partes.length == 2) {
                        String nombre = partes[0].trim();
                        String descripcion = partes[1].trim();
                        if (!generoRepetido(nombre)) {
                            agregarGenero(new Genero(nombre, descripcion));
                        }
                    }
                }
            }

            // Cargar Autores
            Path archivoAutores = Paths.get(directorioDatos, "autores.txt");
            if (Files.exists(archivoAutores)) {
                List<String> lineas = Files.readAllLines(archivoAutores);
                for (String linea : lineas) {
                    String[] partes = linea.split("\\|");
                    if (partes.length == 3) {
                        String nombre = partes[0].trim();
                        String nacionalidad = partes[1].trim();
                        List<String> generos = Arrays.asList(partes[2].split(","));
                        if (!autorRepetido(nombre)) {
                            agregarAutor(new Autor(nombre, nacionalidad, new ArrayList<>(generos)));
                        }
                    }
                }
            }

            // Cargar Libros
            Path archivoLibros = Paths.get(directorioDatos, "libros.txt");
            if (Files.exists(archivoLibros)) {
                List<String> lineas = Files.readAllLines(archivoLibros);
                for (String linea : lineas) {
                    String[] partes = linea.split("\\|");
                    if (partes.length == 9) {
                        String isbn = partes[0].trim();
                        String titulo = partes[1].trim();
                        String editorial = partes[2].trim();
                        String genero = partes[3].trim();
                        String autor = partes[4].trim();
                        String foto = partes[5].trim();
                        int costo = Integer.parseInt(partes[6].trim());
                        int venta = Integer.parseInt(partes[7].trim());
                        int stock = Integer.parseInt(partes[8].trim());
                        if (!libroRepetido(isbn)) {
                            agregarLibro(new Libro(editorial, genero, autor, isbn, titulo, foto, costo, venta, stock));
                        }
                    }
                }
            }

            // Cargar Ventas
            Path archivoVentas = Paths.get(directorioDatos, "ventas.txt");
            if (Files.exists(archivoVentas)) {
                List<String> lineas = Files.readAllLines(archivoVentas);
                for (String linea : lineas) {
                    String[] partes = linea.split("\\|");
                    if (partes.length == 5) {
                        String fecha = partes[0].trim();
                        String cliente = partes[1].trim();
                        int factura = Integer.parseInt(partes[2].trim());
                        int precioCompra = Integer.parseInt(partes[3].trim());
                        String[] librosVendidos = partes[4].split(",");
                        HashMap<Libro, Integer> libros = new HashMap<>();
                        for (String libroInfo : librosVendidos) {
                            String[] libroPartes = libroInfo.split(":");
                            String isbn = libroPartes[0].trim();
                            int cantidad = Integer.parseInt(libroPartes[1].trim());
                            for (Libro libro : listaLibros) {
                                if (libro.getIsbn().equals(isbn)) {
                                    libros.put(libro, cantidad);
                                    break;
                                }
                            }
                        }
                        boolean facturaExistente = listaVentas.stream()
                                .anyMatch(v -> v.getFactura() == factura);
                        if (!facturaExistente) {
                            agregarVenta(new Venta(fecha, cliente, factura, libros, precioCompra));
                        }
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Error al cargar los archivos de datos: " + e.getMessage());
        }
    }

}

