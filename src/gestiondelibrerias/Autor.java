/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondelibrerias;

import java.util.*;

/*
Martín Valetta - 251093
Santiago Oliveros - 339937
*/

public class Autor {

    // Atributos
    private String nombre;
    private String nacionalidad;
    private ArrayList<String> generos; 
    
    // Constructor vacío
    public Autor() {
        this.generos = new ArrayList<>();
    }

    // Constructor con parámetros
    public Autor(String nombre, String nacionalidad, ArrayList<String> generos) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.generos = generos;
    }

    // Getters y Setters
    public String getNombre() {
        return this.nombre; 
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public ArrayList<String> getGeneros() {
        return this.generos; 
    }

    public void setGeneros(ArrayList<String> generos) {
        this.generos = generos;
    }
    // Fin de Getters y Setters
    
}

