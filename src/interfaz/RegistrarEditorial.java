/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

/**
 *
 * @author marti
 */
public class RegistrarEditorial extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarEditorial
     */
    public RegistrarEditorial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombreEditorial = new javax.swing.JLabel();
        lblPaisOrigen = new javax.swing.JLabel();
        txtPaisOrigen = new javax.swing.JTextField();
        txtNombreEditorial = new javax.swing.JTextField();
        btnAñadir = new javax.swing.JButton();
        sepRegistro = new javax.swing.JSeparator();
        scrTabla = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Editorial");
        getContentPane().setLayout(null);

        lblNombreEditorial.setText("Nombre de la editorial:");
        getContentPane().add(lblNombreEditorial);
        lblNombreEditorial.setBounds(30, 20, 130, 16);

        lblPaisOrigen.setText("País de origen:");
        getContentPane().add(lblPaisOrigen);
        lblPaisOrigen.setBounds(30, 50, 130, 16);

        txtPaisOrigen.setToolTipText("País");
        txtPaisOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisOrigenActionPerformed(evt);
            }
        });
        getContentPane().add(txtPaisOrigen);
        txtPaisOrigen.setBounds(240, 50, 130, 20);

        txtNombreEditorial.setToolTipText("Nombre");
        getContentPane().add(txtNombreEditorial);
        txtNombreEditorial.setBounds(240, 20, 130, 20);

        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        getContentPane().add(btnAñadir);
        btnAñadir.setBounds(279, 80, 90, 20);
        getContentPane().add(sepRegistro);
        sepRegistro.setBounds(10, 110, 380, 10);

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "País"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrTabla.setViewportView(tblTabla);

        getContentPane().add(scrTabla);
        scrTabla.setBounds(20, 130, 360, 470);

        setBounds(0, 0, 415, 680);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void txtPaisOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisOrigenActionPerformed

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
    private javax.swing.JButton btnAñadir;
    private javax.swing.JLabel lblNombreEditorial;
    private javax.swing.JLabel lblPaisOrigen;
    private javax.swing.JScrollPane scrTabla;
    private javax.swing.JSeparator sepRegistro;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtNombreEditorial;
    private javax.swing.JTextField txtPaisOrigen;
    // End of variables declaration//GEN-END:variables
}
