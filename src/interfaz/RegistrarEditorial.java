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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistrarEditorial extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarEditorial
     */
    
    private Libreria sistema;
    
    public RegistrarEditorial() {
        initComponents();
    }
    
    public RegistrarEditorial(Libreria sistema) {
        initComponents();
        
        pnlDatos.add(scrDatos, java.awt.BorderLayout.CENTER);
        scrDatos.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrDatos.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        tblDatos.setFillsViewportHeight(true);
        
        this.sistema = sistema;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRegistro = new javax.swing.JPanel();
        pnlRegistroNombre = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        pnlRegistroPais = new javax.swing.JPanel();
        lblPais = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        pnlRegistroCompletar = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        pnlDatos = new javax.swing.JPanel();
        scrDatos = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        pnlSeparador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Editorial");
        getContentPane().setLayout(new java.awt.BorderLayout(15, 0));

        pnlRegistro.setMaximumSize(new java.awt.Dimension(2147483647, 150));
        pnlRegistro.setMinimumSize(new java.awt.Dimension(10, 150));
        pnlRegistro.setPreferredSize(new java.awt.Dimension(100, 150));
        pnlRegistro.setLayout(new java.awt.BorderLayout());

        pnlRegistroNombre.setMaximumSize(new java.awt.Dimension(32767, 60));
        pnlRegistroNombre.setMinimumSize(new java.awt.Dimension(10, 60));
        pnlRegistroNombre.setPreferredSize(new java.awt.Dimension(100, 60));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre.setText("Nombre de la editorial:");
        lblNombre.setMaximumSize(new java.awt.Dimension(150, 50));
        lblNombre.setMinimumSize(new java.awt.Dimension(150, 50));
        lblNombre.setPreferredSize(new java.awt.Dimension(150, 50));
        pnlRegistroNombre.add(lblNombre);

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setMaximumSize(new java.awt.Dimension(100, 30));
        txtNombre.setMinimumSize(new java.awt.Dimension(100, 30));
        txtNombre.setPreferredSize(new java.awt.Dimension(100, 30));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        pnlRegistroNombre.add(txtNombre);

        pnlRegistro.add(pnlRegistroNombre, java.awt.BorderLayout.PAGE_START);

        pnlRegistroPais.setMaximumSize(new java.awt.Dimension(32767, 60));
        pnlRegistroPais.setMinimumSize(new java.awt.Dimension(10, 60));
        pnlRegistroPais.setPreferredSize(new java.awt.Dimension(100, 60));

        lblPais.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPais.setText("País de origen:");
        lblPais.setMaximumSize(new java.awt.Dimension(150, 50));
        lblPais.setMinimumSize(new java.awt.Dimension(150, 50));
        lblPais.setPreferredSize(new java.awt.Dimension(150, 50));
        pnlRegistroPais.add(lblPais);

        txtPais.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPais.setMaximumSize(new java.awt.Dimension(100, 30));
        txtPais.setMinimumSize(new java.awt.Dimension(100, 30));
        txtPais.setName(""); // NOI18N
        txtPais.setPreferredSize(new java.awt.Dimension(100, 30));
        txtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisActionPerformed(evt);
            }
        });
        pnlRegistroPais.add(txtPais);

        pnlRegistro.add(pnlRegistroPais, java.awt.BorderLayout.CENTER);

        pnlRegistroCompletar.setMaximumSize(new java.awt.Dimension(32767, 30));
        pnlRegistroCompletar.setMinimumSize(new java.awt.Dimension(10, 30));
        pnlRegistroCompletar.setPreferredSize(new java.awt.Dimension(100, 30));

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setMargin(new java.awt.Insets(0, 14, 0, 14));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        pnlRegistroCompletar.add(btnAgregar);

        pnlRegistro.add(pnlRegistroCompletar, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(pnlRegistro, java.awt.BorderLayout.PAGE_START);

        pnlDatos.setLayout(new java.awt.BorderLayout());

        tblDatos.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 0, 10));
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Pais"
            }
        ));
        tblDatos.setMaximumSize(new java.awt.Dimension(32767, 32767));
        tblDatos.setMinimumSize(new java.awt.Dimension(100, 50));
        tblDatos.setPreferredSize(new java.awt.Dimension(300, 200));
        scrDatos.setViewportView(tblDatos);

        pnlDatos.add(scrDatos, java.awt.BorderLayout.CENTER);
        pnlDatos.add(pnlSeparador, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(pnlDatos, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 341, 451);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (this.txtNombre.getText().length() > 0 && this.txtPais.getText().length() > 0) {
            // Sabemos que las dos casillas fueron ingresadas
            if (this.sistema.editorialRepetida(this.txtNombre.getText())) {
                // La editorial ya fue ingresada previamente
                JOptionPane.showMessageDialog(
                    this,
                    "Ya se ha ingresado a esta librería.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            } else {
                // Todo en orden, continuamos con el registro
                String nombre = this.txtNombre.getText().trim();
                String pais = this.txtPais.getText().trim();
                
                Editorial editorial = new Editorial(nombre, pais);
                this.sistema.agregarEditorial(editorial);
                
                this.actualizarTabla();
                
                this.txtNombre.setText("");
                this.txtPais.setText("");
            }
        } else {
            if (!(this.txtNombre.getText().length() > 0)) {
                // No se ingresó un nombre
                JOptionPane.showMessageDialog(
                    this,
                    "No se ha ingresado un nombre.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            } else {
                // No se ingresó un pais
                JOptionPane.showMessageDialog(
                    this,
                    "No se ingresó un país.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    public void actualizarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();

        // Vaciamos la tabla
        modelo.setRowCount(0);

        for (Editorial editorial : this.sistema.getListaEditoriales()) {
            Object[] fila = {editorial.getNombre(), editorial.getPais()};
            modelo.addRow(fila);
        }

        // Forzar redibujado de la tabla
        tblDatos.setModel(modelo);
        tblDatos.repaint();
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
            java.util.logging.Logger.getLogger(RegistrarEditorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarEditorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarEditorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarEditorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarEditorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPais;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JPanel pnlRegistroCompletar;
    private javax.swing.JPanel pnlRegistroNombre;
    private javax.swing.JPanel pnlRegistroPais;
    private javax.swing.JPanel pnlSeparador;
    private javax.swing.JScrollPane scrDatos;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables
}
