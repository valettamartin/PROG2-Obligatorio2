/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiondelibrerias;
import interfaz.Inicio;
/*
Martín Valetta - 251093
Santiago Oliveros - 339937
*/

import javax.swing.JOptionPane;

public class GestionDeLibrerias {

    /**
     * @param args the command line arguments
    */
    
    public static void main(String[] args) {
        
        // Declaramos un nuevo sistema
        Libreria sistema = new Libreria();
        Inicio menu = new Inicio(sistema);
        
        // Preguntamos si se desean cargar datos
        int cargar = JOptionPane.showConfirmDialog(
            null, 
            "¿Desea cargar datos previos?", 
            "Cargar Datos", 
            JOptionPane.YES_NO_OPTION 
        );
        
        // Resolvemos en funcion de la respuesta anterior
        if (cargar == JOptionPane.YES_OPTION) {
            sistema.cargarDatos();
        }

        // Hacemos el programa visible
        menu.setVisible(true);
        
    }
    
}
