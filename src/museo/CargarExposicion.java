/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museo;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Empleado;
import model.GestorBD;

/**
 *
 * @author ezepc
 */
public class CargarExposicion extends javax.swing.JFrame {

    GestorBD g = new GestorBD();
    ArrayList<Empleado> listaE = new ArrayList<>();

    public CargarExposicion() {
        initComponents();
        cargarGuia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lalala = new javax.swing.JPanel();
        cboHorario = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboTipoV = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        cboGuia = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtFechaFin = new com.toedter.calendar.JDateChooser();
        txtFechaIn = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lalala.setBackground(new java.awt.Color(0, 0, 0));
        lalala.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00 am", "10:00 am", "12:00 am", "18:00 pm", "20:00 pm", " " }));
        lalala.add(cboHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 110, -1));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel2.setText("Guia");
        lalala.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, 50));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel1.setText("Tipo de visita");
        lalala.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel3.setText("Monto");
        lalala.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel4.setText("Fecha de inicio");
        lalala.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel5.setText("Fecha de fin");
        lalala.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel6.setText("Nombre de expocicion");
        lalala.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel7.setText("Horario");
        lalala.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        cboTipoV.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        cboTipoV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colegio", "General" }));
        cboTipoV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoVActionPerformed(evt);
            }
        });
        lalala.add(cboTipoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 110, -1));

        txtNombre.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        lalala.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 110, -1));

        txtMonto.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        lalala.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 110, -1));

        cboGuia.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        lalala.add(cboGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 110, -1));

        btnAceptar.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        lalala.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, 40));

        btnVolver.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        lalala.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 70, 40));
        lalala.add(txtFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 110, -1));
        lalala.add(txtFechaIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 110, -1));

        jLabel8.setFont(new java.awt.Font("Harrington", 0, 36)); // NOI18N
        jLabel8.setText("Agregar Exposición");
        lalala.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/women-3118387_640.jpg"))); // NOI18N
        lalala.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        lalala.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, -1, -1));

        getContentPane().add(lalala, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboTipoVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoVActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal p = new Principal();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        if(!txtMonto.getText().equals("") && !txtNombre.getText().equals(""))
        {
        
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        String fecha_inicio = dFormat.format(txtFechaIn.getDate());
        int id_visita = cboTipoV.getSelectedIndex() + 1;
        int id_empleado = 0;

        listaE = g.comboGuias();
        String d = cboGuia.getSelectedItem().toString();
        for (Empleado emp : listaE) {
            if (emp.getNombre().equals(d)) {
                id_empleado = emp.getId();
            }
        }
        String monto = txtMonto.getText();
        Date objDate = new Date(); // Sistema actual La fecha y la hora se asignan a objDate 

        String strDateFormat = "dd-MM-yyyy"; // El formato de fecha está especificado  
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto 

        String fechahoy = objSDF.format(objDate); // El formato de fecha se aplica a la fecha actual

        if (txtFechaIn.getDate().before(objDate)) {

            JOptionPane.showMessageDialog(this, "La Fecha es Anterio a hoy No se Puede Registar");
        } else {
            String fecha_fin = dFormat.format(txtFechaFin.getDate());
            String horario = (String) cboHorario.getSelectedItem();

            // falta este metodo  //
            g.registrarExpocicion(id_visita, id_empleado, monto, fecha_inicio, fecha_fin, txtNombre.getText(), horario);

            AgregarObrasPorExpo e = new AgregarObrasPorExpo();
            e.setVisible(true);
            this.setVisible(false);

        }
        }else{
        JOptionPane.showMessageDialog(this, "Complete Todos los campos");
        }


    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(CargarExposicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarExposicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarExposicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarExposicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarExposicion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cboGuia;
    private javax.swing.JComboBox<String> cboHorario;
    private javax.swing.JComboBox<String> cboTipoV;
    private javax.swing.JLabel imagen;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel lalala;
    private com.toedter.calendar.JDateChooser txtFechaFin;
    private com.toedter.calendar.JDateChooser txtFechaIn;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void cargarGuia() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        listaE = g.comboGuias();

        for (Empleado emp : listaE) {
            model.addElement(emp.getNombre());
        }

        cboGuia.setModel(model);
    }

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo numeros");
        }
        if (txtMonto.getText().length() > 8) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar hasta 9 caracteres");
        }
    }

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {
        char validar2 = evt.getKeyChar();
        if (Character.isDigit(validar2)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Letras");
        }
    }

}
