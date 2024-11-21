/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

/**
 *
 * @author marti
 */

import gestiondelibrerias.*;

public class Inicio extends javax.swing.JFrame {


    private AnularVenta anularVenta;
    private BuscarIsbn buscarIsbn;
    private ConsultaDeLibros consultaDeLibros;
    private ConsultaDeVentas consultaDeVentas;
    private DatosLibro datosLibro;
    private RegistrarAutor registrarAutor;
    private RegistrarEditorial registrarEditorial;
    private RegistrarGenero registrarGenero;
    private RegistrarLibro registrarLibro;
    private RegistroDeVenta registroDeVenta;
    
    private Libreria sistema;
    
    public Inicio() {
        initComponents();
        
        sistema = new Libreria();
        
        anularVenta = new AnularVenta();
        buscarIsbn = new BuscarIsbn();
        consultaDeLibros = new ConsultaDeLibros();
        consultaDeVentas = new ConsultaDeVentas();
        datosLibro = new DatosLibro();
        
        registrarAutor = new RegistrarAutor(sistema);
        registrarAutor.actualizarLista();
        
        registrarEditorial = new RegistrarEditorial(sistema);
        registrarEditorial.actualizarTabla();
        
        registrarGenero = new RegistrarGenero(sistema);
        registrarGenero.actualizarLista();
        
        registrarLibro = new RegistrarLibro(sistema);
        registrarLibro.cargarEditoriales();
        registrarLibro.cargarGeneros();
        
        registroDeVenta = new RegistroDeVenta(sistema);
        registroDeVenta.actualizarLibros();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnbPrincipal = new javax.swing.JMenuBar();
        mnuRegistros = new javax.swing.JMenu();
        itmRegistrarEditorial = new javax.swing.JMenuItem();
        itmRegistrarGenero = new javax.swing.JMenuItem();
        itmRegistrarAutor = new javax.swing.JMenuItem();
        itmRegistrarLibro = new javax.swing.JMenuItem();
        mnuVentas = new javax.swing.JMenu();
        itmRegistroDeVenta = new javax.swing.JMenuItem();
        itmAnularVenta = new javax.swing.JMenuItem();
        mnuConsultas = new javax.swing.JMenu();
        itmConsultaDeLibros = new javax.swing.JMenuItem();
        itmConsultaDeVentas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Librerías - Realizado por: Martín Valetta 251093 - Santiago Oliveros 339937");
        getContentPane().setLayout(null);

        mnuRegistros.setText("Registros");

        itmRegistrarEditorial.setText("Registrar editorial");
        itmRegistrarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistrarEditorialActionPerformed(evt);
            }
        });
        mnuRegistros.add(itmRegistrarEditorial);

        itmRegistrarGenero.setText("Registrar género");
        itmRegistrarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistrarGeneroActionPerformed(evt);
            }
        });
        mnuRegistros.add(itmRegistrarGenero);

        itmRegistrarAutor.setText("Registrar autor");
        itmRegistrarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistrarAutorActionPerformed(evt);
            }
        });
        mnuRegistros.add(itmRegistrarAutor);

        itmRegistrarLibro.setText("Registrar libro");
        itmRegistrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistrarLibroActionPerformed(evt);
            }
        });
        mnuRegistros.add(itmRegistrarLibro);

        mnbPrincipal.add(mnuRegistros);

        mnuVentas.setText("Ventas");

        itmRegistroDeVenta.setText("Registro de venta");
        itmRegistroDeVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistroDeVentaActionPerformed(evt);
            }
        });
        mnuVentas.add(itmRegistroDeVenta);

        itmAnularVenta.setText("Anular venta");
        itmAnularVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAnularVentaActionPerformed(evt);
            }
        });
        mnuVentas.add(itmAnularVenta);

        mnbPrincipal.add(mnuVentas);

        mnuConsultas.setText("Consultas");

        itmConsultaDeLibros.setText("Consulta de libros");
        itmConsultaDeLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultaDeLibrosActionPerformed(evt);
            }
        });
        mnuConsultas.add(itmConsultaDeLibros);

        itmConsultaDeVentas.setText("Consulta de ventas");
        itmConsultaDeVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultaDeVentasActionPerformed(evt);
            }
        });
        mnuConsultas.add(itmConsultaDeVentas);

        mnbPrincipal.add(mnuConsultas);

        setJMenuBar(mnbPrincipal);

        setBounds(0, 0, 714, 455);
    }// </editor-fold>//GEN-END:initComponents

    private void itmRegistrarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistrarEditorialActionPerformed
        this.ocultarVentanas();
        
        registrarEditorial.setVisible(true);
    }//GEN-LAST:event_itmRegistrarEditorialActionPerformed

    private void itmRegistrarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistrarGeneroActionPerformed
        this.ocultarVentanas();
        
        registrarGenero.actualizarLista();
        registrarGenero.setVisible(true);
    }//GEN-LAST:event_itmRegistrarGeneroActionPerformed

    private void itmRegistroDeVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistroDeVentaActionPerformed
        this.ocultarVentanas();
        
        registroDeVenta.actualizarLibros();
        registroDeVenta.actualizarNroFactura();
        registroDeVenta.setVisible(true);
    }//GEN-LAST:event_itmRegistroDeVentaActionPerformed

    private void itmConsultaDeVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultaDeVentasActionPerformed
        this.ocultarVentanas();
        
        consultaDeVentas.setVisible(true);
    }//GEN-LAST:event_itmConsultaDeVentasActionPerformed

    private void itmAnularVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAnularVentaActionPerformed
        this.ocultarVentanas();
        
        anularVenta.setVisible(true);
    }//GEN-LAST:event_itmAnularVentaActionPerformed

    private void itmRegistrarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistrarAutorActionPerformed
        this.ocultarVentanas();
        
        registrarAutor.cargarGeneros();
        registrarAutor.actualizarLista();
        registrarAutor.setVisible(true);
    }//GEN-LAST:event_itmRegistrarAutorActionPerformed

    private void itmRegistrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistrarLibroActionPerformed
        this.ocultarVentanas();
        
        registrarLibro.cargarEditoriales();
        registrarLibro.cargarGeneros();
        registrarLibro.setVisible(true);
    }//GEN-LAST:event_itmRegistrarLibroActionPerformed

    private void itmConsultaDeLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultaDeLibrosActionPerformed
        this.ocultarVentanas();
        
        consultaDeLibros.setVisible(true);
    }//GEN-LAST:event_itmConsultaDeLibrosActionPerformed

    private void ocultarVentanas() {
        anularVenta.setVisible(false);
        buscarIsbn.setVisible(false);
        consultaDeLibros.setVisible(false);
        consultaDeVentas.setVisible(false);
        datosLibro.setVisible(false);
        registrarAutor.setVisible(false);
        registrarEditorial.setVisible(false);
        registrarGenero.setVisible(false);
        registrarLibro.setVisible(false);
        registroDeVenta.setVisible(false);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAnularVenta;
    private javax.swing.JMenuItem itmConsultaDeLibros;
    private javax.swing.JMenuItem itmConsultaDeVentas;
    private javax.swing.JMenuItem itmRegistrarAutor;
    private javax.swing.JMenuItem itmRegistrarEditorial;
    private javax.swing.JMenuItem itmRegistrarGenero;
    private javax.swing.JMenuItem itmRegistrarLibro;
    private javax.swing.JMenuItem itmRegistroDeVenta;
    private javax.swing.JMenuBar mnbPrincipal;
    private javax.swing.JMenu mnuConsultas;
    private javax.swing.JMenu mnuRegistros;
    private javax.swing.JMenu mnuVentas;
    // End of variables declaration//GEN-END:variables
}
