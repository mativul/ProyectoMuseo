/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museo;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Restauradores;
import model.Restauracion;
import model.GestorBD;
import model.Obra;

/**
 *
 * @author Usuario
 */
public class AgregarRestauracion extends javax.swing.JFrame {

    GestorBD g = new GestorBD();
    ArrayList<Restauradores> listRestauradores = new ArrayList<Restauradores>();
    ArrayList<Obra> listobra = new ArrayList<Obra>();
    int value=0;
    int proceso = 0; 

    public AgregarRestauracion() {
        initComponents();
        cargarLista();
        cargarCombo();
        

        
        ButtonGroup gb = new ButtonGroup();
        {
            gb.add(rbtNo);
            gb.add(rbtSi);
        }
       // lstPersonas.setListData(g.loadAllPersonas().toArray());
     //   lstObras.setListData(g.mostrarObra().toArray());
    //    lstObras.setListData(listaO);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        txtRestauracion = new javax.swing.JTextField();
        cboEncargado = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();
        rbtSi = new javax.swing.JRadioButton();
        rbtNo = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblObras = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Harrington", 0, 36)); // NOI18N
        jLabel7.setText("Restauracion");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Harrington", 0, 36)); // NOI18N
        jLabel6.setText("Ingreso");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("obra");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cursos-de-restauracion-de-pintura-mural-29.jpg"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 650, 280));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("en restauracion:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 316, -1, 20));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Encargado");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, -1, -1));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("restauracion");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        btnAceptar.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 237, -1));

        txtRestauracion.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jPanel2.add(txtRestauracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 168, -1));

        cboEncargado.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jPanel2.add(cboEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 170, -1));

        btnVolver.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 237, -1));

        rbtSi.setBackground(new java.awt.Color(0, 0, 0));
        rbtSi.setForeground(new java.awt.Color(255, 255, 255));
        rbtSi.setText("si");
        jPanel2.add(rbtSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 40, -1));

        rbtNo.setBackground(new java.awt.Color(0, 0, 0));
        rbtNo.setForeground(new java.awt.Color(255, 255, 255));
        rbtNo.setText("no");
        jPanel2.add(rbtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 40, -1));

        tblObras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblObras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblObrasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblObras);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 340, 200));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        Principal p = new Principal();
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
        p.setVisible(true);

    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        String estado = "";
        
        if (proceso==0) {
            
        
        if (rbtNo.isSelected()) {
            estado = "no";
            JOptionPane.showMessageDialog(this, "Seleccione Para Restaurar");
            return;
        }
        if (rbtSi.isSelected()) {
            estado = "si";
        
        
        if (!txtRestauracion.getText().equals("")) {
        String restauracion = txtRestauracion.getText();
        
        int encargado = cboEncargado.getSelectedIndex()+1;
            if (value > 0 ) {
                
        g.RegistarRestauracion(estado, restauracion, value, encargado);

        JOptionPane.showMessageDialog(this, "Cargado con Exito");
        cargarLista();
            }else {
            
        JOptionPane.showMessageDialog(this, "Selecione una Obra");
                
            
            }
            
        }else{
        JOptionPane.showMessageDialog(this, "Carge Una Descripcion");
        
        }
        

        }else {
        
        JOptionPane.showMessageDialog(this, "Carge Los Campos");
        
        }       
       }else if (proceso==1) {
           JOptionPane.showMessageDialog(this, "Ya en Restauracion"); 
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void tblObrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblObrasMouseClicked
        String v="";
        int index = tblObras.getSelectedRow();
        TableModel model = tblObras.getModel();
         value = Integer.parseInt(model.getValueAt(index, 0).toString());
        
       v = g.versiono(value);
        
        if (v.equals("si")) {
         rbtNo.setSelected(false);
        rbtSi.setSelected(true);
        rbtSi.setEnabled(false);
        rbtNo.setEnabled(false);
        proceso=1;
        
        }else  {
        
         rbtNo.setSelected(true);
        rbtSi.setEnabled(true);
        rbtNo.setEnabled(true);
        proceso=0;
        }
        
    }//GEN-LAST:event_tblObrasMouseClicked

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
            java.util.logging.Logger.getLogger(AgregarRestauracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarRestauracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarRestauracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarRestauracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarRestauracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cboEncargado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbtNo;
    private javax.swing.JRadioButton rbtSi;
    private javax.swing.JTable tblObras;
    private javax.swing.JTextField txtRestauracion;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        listRestauradores = g.MostarRestauradores();

        for (Restauradores listRestauradore : listRestauradores) {
            model.addElement(listRestauradore.getNombre());

        }
        cboEncargado.setModel(model);
    }

     private void cargarLista() {
        DefaultTableModel model = new DefaultTableModel() ;
        String[] column={"Id Obbra","Artista","nombre Obra","Estado Obra"};
        model.setColumnIdentifiers(column);
        listobra = g.mostrarObra();
        for (Obra o : listobra) {
            Object[] obj = {o.getId_obra(),o.getNombreartista(),o.getNombre(),o.getDescripcion()};
            model.addRow(obj);
        }
        tblObras.setModel(model);
    }
}
