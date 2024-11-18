/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondelibrerias;

/*
Martín Valetta - 251093
Santiago Oliveros - 339937
*/

public class Autor {

    // Atributos
    private String nombre;
    private String nacionalidad;
    private Genero[] generos; 

    // Constructor vacío
    public Autor() {
    }

    // Constructor con parámetros
    public Autor(String nombre, String nacionalidad, Genero[] generos) {
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

    public Genero[] getGeneros() {
        return this.generos; 
    }

    public void setGeneros(Genero[] generos) {
        this.generos = generos;
    }
    // Fin de Getters y Setters
    
}

