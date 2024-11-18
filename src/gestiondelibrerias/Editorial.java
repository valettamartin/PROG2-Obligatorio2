/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondelibrerias;

/*
Martín Valetta - 251093
Santiago Oliveros - 339937
*/

public class Editorial {

    // Atributos
    private String nombre;
    private String pais;

    // Constructor vacío
    public Editorial() {
    }

    // Constructor con parámetros
    public Editorial(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    // Getters y Setters
    public String getNombre() {
        return this.nombre; 
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    // Fin de Getters y Setters
    
}

