/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondelibrerias;

/*
Martín Valetta - 251093
Santiago Oliveros - 339937
*/

import java.util.HashMap;

public class Venta {

    // Atributos
    private String fecha;
    private String cliente;
    private int factura;
    private int precioCompra;
    private HashMap<Libro, Integer> libros; // Clave: Libro, Valor: Cantidad vendida

    // Constructor vacío
    public Venta() {
        this.libros = new HashMap<>();
        this.precioCompra = 0;
    }

    // Constructor con parámetros
    public Venta(String fecha, String cliente, int factura, HashMap<Libro, Integer> libros, int precioCompra) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.factura = factura;
        this.libros = libros;
        this.precioCompra = precioCompra;
    }

    // Getters y Setters
    public String getFecha() {
        return this.fecha; 
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return this.cliente; 
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getFactura() {
        return this.factura; 
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public HashMap<Libro, Integer> getLibros() {
        return this.libros;
    }

    public void setLibros(HashMap<Libro, Integer> libros) {
        this.libros = libros;
    }
    
    public int getPrecioCompra() {
        return this.precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }
    // Fin Getters y Setters

    // Método para agregar un libro y su cantidad
    public void agregarLibro(Libro libro, int cantidad) {
        this.libros.put(libro, cantidad);
    }
}

