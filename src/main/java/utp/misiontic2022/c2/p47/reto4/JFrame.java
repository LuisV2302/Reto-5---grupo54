package utp.misiontic2022.c2.p47.reto4;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.ComprasPagadas;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.ComprasPagoParcial;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.MaterialesConstruccion;
import utp.misiontic2022.c2.p47.reto4.vista.Modelo;
import utp.misiontic2022.c2.p47.reto4.vista.VistaRequerimientos;

public class JFrame extends javax.swing.JFrame {

    public JFrame() {
    initComponents();  
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        Requerimiento1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RQ1 = new javax.swing.JButton();
        Requerimiento2 = new javax.swing.JLabel();
        RQ2 = new javax.swing.JButton();
        Requerimiento3 = new javax.swing.JLabel();
        RQ3 = new javax.swing.JButton();
        BotonCerrar = new javax.swing.JButton();
        JFrame Frame = new JFrame();
        
        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Requerimiento1.setText("Requerimiento 1");

        jLabel3.setText("Requerimientos Reto 5");

        RQ1.setText("Mostrar");
        RQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RQ1ActionPerformed(evt);
            }
        });

        Requerimiento2.setText("Requerimiento 2");

        RQ2.setText("Mostrar");
        RQ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RQ2ActionPerformed(evt);
            }
        });

        Requerimiento3.setText("Requerimiento 3");

        RQ3.setText("Mostrar");
        RQ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RQ3ActionPerformed(evt);
            }
        });

        BotonCerrar.setText("Cerrar");
        BotonCerrar.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Requerimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Requerimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Requerimiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RQ3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(BotonCerrar)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Requerimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Requerimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Requerimiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RQ3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(BotonCerrar)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RQ1ActionPerformed
        // TODO add your handling code here:
        Modelo modelo = new Modelo();
        final ControladorRequerimientos controlador = new ControladorRequerimientos();
        try {
            ArrayList <ComprasPagadas> lista = controlador.comprasPagadas();
            Object matriz[][] = new Object [lista.size()][1];
            for (int i = 0; i < lista.size(); i++){
                matriz[i][0] = lista.get(i).getID_Compra();
            }
            Modelo.modelo = matriz;
            JTable tabla = new JTable(modelo);
            JTableHeader head = tabla.getTableHeader();
            TableColumnModel tcm = head.getColumnModel();
            TableColumn tabCM = tcm.getColumn(0);
            tabCM.setHeaderValue("ID_Compra");
            tabla.repaint();
            JScrollPane scroll = new JScrollPane(tabla);
            JOptionPane.showMessageDialog(null, scroll);
            scroll.add(tabla);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }//GEN-LAST:event_RQ1ActionPerformed

    private void RQ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RQ2ActionPerformed
        // TODO add your handling code here:
        Modelo modelo = new Modelo();
        final ControladorRequerimientos controlador = new ControladorRequerimientos();
            try {
                ArrayList<MaterialesConstruccion> resultado2 = controlador.materialesConstruccion();
                Object matriz[][] = new Object [resultado2.size()][1];
            for (int i = 0; i < resultado2.size(); i++){
                matriz[i][0] = resultado2.get(i).getID_Compra();
            }
            Modelo.modelo = matriz;
            JTable tabla = new JTable(modelo);
            JTableHeader head = tabla.getTableHeader();
            TableColumnModel tcm = head.getColumnModel();
            TableColumn tabCM = tcm.getColumn(0);
            tabCM.setHeaderValue("ID_Compra");
            tabla.repaint();
            JScrollPane scroll = new JScrollPane(tabla);
            JOptionPane.showMessageDialog(null, scroll);
            scroll.add(tabla);
            } catch (Exception e) {
                System.err.println(e);
            }
        }

    private void RQ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RQ3ActionPerformed
        // TODO add your handling code here:
        Modelo modelo = new Modelo();
        final ControladorRequerimientos controlador = new ControladorRequerimientos();
        try {
            ArrayList<ComprasPagoParcial> resultado3 = controlador.comprasPagoParcial();
            Object matriz[][] = new Object [resultado3.size()][2];
            for (int i = 0; i < resultado3.size(); i++){
                matriz[i][0] = resultado3.get(i).getID_Proyecto();
                matriz[i][1] = resultado3.get(i).getFecha();
            }
            Modelo.modelo = matriz;
            JTable tabla = new JTable(modelo);
            JTableHeader head = tabla.getTableHeader();
            TableColumnModel tcm = head.getColumnModel();
            TableColumn tabCM = tcm.getColumn(0);
            tabCM.setHeaderValue("ID_proyecto");
            tabCM = tcm.getColumn(1);
            tabCM.setHeaderValue("Fecha");
            tabla.repaint();
            JScrollPane scroll = new JScrollPane(tabla);
            JOptionPane.showMessageDialog(null, scroll);
            scroll.add(tabla);
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_RQ3ActionPerformed

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RQ3ActionPerformed
        
    }//GEN-LAST:event_RQ3ActionPerformed
    
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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JButton RQ1;
    private javax.swing.JButton RQ2;
    private javax.swing.JButton RQ3;
    private javax.swing.JLabel Requerimiento1;
    private javax.swing.JLabel Requerimiento2;
    private javax.swing.JLabel Requerimiento3;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
