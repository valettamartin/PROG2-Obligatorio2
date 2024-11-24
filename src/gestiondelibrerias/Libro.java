/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondelibrerias;

/*
Martín Valetta - 251093
Santiago Oliveros - 339937
*/

public class Libro {

    // Atributos
    private String editorial;
    private String genero;
    private String autor;
    private String isbn;
    private String titulo;
    private String foto;
    private int precioCosto;
    private int precioVenta;
    private int stock;

    // Constructor vacío
    public Libro() {
    }

    // Constructor con parámetros
    public Libro(String editorial, String genero, String autor, String isbn, String titulo, String foto, int precioCosto, int precioVenta, int stock) {
        this.editorial = editorial;
        this.genero = genero;
        this.autor = autor;
        this.isbn = isbn;
        this.titulo = titulo;
        this.foto = foto;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    // Getters y Setters
    public String getEditorial() {
        return this.editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getPrecioCosto() {
        return this.precioCosto;
    }

    public void setPrecioCosto(int precioCosto) {
        this.precioCosto = precioCosto;
    }

    public int getPrecioVenta() {
        return this.precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    // Fin de Getters y Setters
    
}