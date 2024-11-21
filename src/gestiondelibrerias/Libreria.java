/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondelibrerias;

/*
Martín Valetta - 251093
Santiago Oliveros - 339937
*/

import java.util.ArrayList;

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
    
}

