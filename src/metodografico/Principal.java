/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodografico;
import javax.swing.*;
/**
 *
 * @author saul
 */
public class Principal extends JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fila1_x1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fila1_x2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fila2_x1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        fila2_x2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        fila3_x1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        fila3_x2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        fila4_x1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fila4_x2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        fila5_x1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        fila5_x2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        fila1_select = new javax.swing.JComboBox<>();
        fila3_select = new javax.swing.JComboBox<>();
        fila2_select = new javax.swing.JComboBox<>();
        fila4_select = new javax.swing.JComboBox<>();
        fila5_select = new javax.swing.JComboBox<>();
        fila1_sol = new javax.swing.JTextField();
        fila2_sol = new javax.swing.JTextField();
        fila3_sol = new javax.swing.JTextField();
        fila4_sol = new javax.swing.JTextField();
        fila5_sol = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 22)); // NOI18N
        jLabel1.setText("Proyecto de programación lineal Método gráfico ");

        jLabel2.setText("Seleccione el número de ");

        jLabel3.setText("Restriciones que va a manejar");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "1", "2", "3", "4", "5" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modelo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel4.setText("Max Z = ");

        jLabel5.setText("x1");

        jLabel6.setText("x2");

        jLabel7.setText("s.a");

        fila1_x1.setEnabled(false);

        jLabel8.setText("x1");

        fila1_x2.setEnabled(false);

        jLabel9.setText("x2");

        fila2_x1.setEnabled(false);

        jLabel10.setText("x1");

        fila2_x2.setEnabled(false);

        jLabel11.setText("x2");

        fila3_x1.setEnabled(false);

        jLabel12.setText("x1");

        fila3_x2.setEnabled(false);

        jLabel13.setText("x2");

        fila4_x1.setEnabled(false);

        jLabel14.setText("x1");

        fila4_x2.setEnabled(false);

        jLabel15.setText("x2");

        fila5_x1.setEnabled(false);

        jLabel16.setText("x1");

        fila5_x2.setEnabled(false);

        jLabel17.setText("x2");

        fila1_select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", ">=", "<=" }));
        fila1_select.setEnabled(false);
        fila1_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fila1_selectActionPerformed(evt);
            }
        });

        fila3_select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", ">=", "<=" }));
        fila3_select.setEnabled(false);

        fila2_select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", ">=", "<=" }));
        fila2_select.setEnabled(false);
        fila2_select.setMinimumSize(new java.awt.Dimension(85, 27));

        fila4_select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", ">=", "<=" }));
        fila4_select.setEnabled(false);

        fila5_select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", ">=", "<=" }));
        fila5_select.setEnabled(false);

        fila1_sol.setEnabled(false);

        fila2_sol.setEnabled(false);

        fila3_sol.setEnabled(false);

        fila4_sol.setEnabled(false);

        fila5_sol.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fila5_x1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fila5_x2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fila4_x1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fila4_x2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fila3_x1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fila3_x2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fila2_x1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fila2_x2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fila1_x1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fila1_x2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fila1_select, 0, 0, Short.MAX_VALUE)
                            .addComponent(fila3_select, 0, 1, Short.MAX_VALUE)
                            .addComponent(fila4_select, 0, 1, Short.MAX_VALUE)
                            .addComponent(fila5_select, 0, 0, Short.MAX_VALUE)
                            .addComponent(fila2_select, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fila5_sol, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fila4_sol, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fila3_sol, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fila2_sol, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fila1_sol, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fila1_x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(fila1_x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fila2_x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(fila2_x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fila3_x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(fila3_x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fila4_x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(fila4_x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fila5_x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(fila5_x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fila1_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fila2_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fila5_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fila1_sol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fila2_sol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fila3_sol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fila3_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fila4_sol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fila4_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fila5_sol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jButton1.setText("Generar gráfica");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String opcion = jComboBox1.getSelectedItem().toString();
//        JOptionPane.showInputDialog(null, opcion);
        switch(opcion) {
            case "1":
                enabledF1();
                break;
            case "2":
                enabledF2();
                break;
            case "3":
                enabledF3();
                break;
            case "4":
                enabledF4();
                break;
            case "5":
                enabledF5();
                break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void fila1_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fila1_selectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fila1_selectActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String opcion = jComboBox1.getSelectedItem().toString();       
//        JOptionPane.showMessageDialog(null, opcion);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                
            }
        });
    }

    public void enabledF1(){
        fila1_x1.setEnabled(true);
        fila1_x2.setEnabled(true);
        fila1_select.setEnabled(true);
        fila1_sol.setEnabled(true);
        // Desactivar la fila 2
        fila2_x1.setEnabled(false);
        fila2_x2.setEnabled(false);
        fila2_select.setEnabled(false);
        fila2_sol.setEnabled(false);
        // Desactivar la fila 3
        fila3_x1.setEnabled(false);
        fila3_x2.setEnabled(false);
        fila3_select.setEnabled(false);
        fila3_sol.setEnabled(false);
        // Desactivar la fila 4
        fila4_x1.setEnabled(false);
        fila4_x2.setEnabled(false);
        fila4_select.setEnabled(false);
        fila4_sol.setEnabled(false);
        // Desactivar la fila 5
        fila5_x1.setEnabled(false);
        fila5_x2.setEnabled(false);
        fila5_select.setEnabled(false);
        fila5_sol.setEnabled(false);
    }
    public void enabledF2(){
        fila1_x1.setEnabled(true);
        fila1_x2.setEnabled(true);
        fila1_select.setEnabled(true);
        fila1_sol.setEnabled(true);
        fila2_x1.setEnabled(true);
        fila2_x2.setEnabled(true);
        fila2_select.setEnabled(true);
        fila2_sol.setEnabled(true);
        // Desactivar la fila 3
        fila3_x1.setEnabled(false);
        fila3_x2.setEnabled(false);
        fila3_select.setEnabled(false);
        fila3_sol.setEnabled(false);
        // Desactivar la fila 4
        fila4_x1.setEnabled(false);
        fila4_x2.setEnabled(false);
        fila4_select.setEnabled(false);
        fila4_sol.setEnabled(false);
        // Desactivar la fila 5
        fila5_x1.setEnabled(false);
        fila5_x2.setEnabled(false);
        fila5_select.setEnabled(false);
        fila5_sol.setEnabled(false);
    }
    public void enabledF3(){
        fila1_x1.setEnabled(true);
        fila1_x2.setEnabled(true);
        fila1_select.setEnabled(true);
        fila1_sol.setEnabled(true);
        fila2_x1.setEnabled(true);
        fila2_x2.setEnabled(true);
        fila2_select.setEnabled(true);
        fila2_sol.setEnabled(true);
        fila3_x1.setEnabled(true);
        fila3_x2.setEnabled(true);
        fila3_select.setEnabled(true);
        fila3_sol.setEnabled(true);
        // Desactivar la fila 4
        fila4_x1.setEnabled(false);
        fila4_x2.setEnabled(false);
        fila4_select.setEnabled(false);
        fila4_sol.setEnabled(false);
        // Desactivar la fila 5
        fila5_x1.setEnabled(false);
        fila5_x2.setEnabled(false);
        fila5_select.setEnabled(false);
        fila5_sol.setEnabled(false);
    }
    public void enabledF4(){
        fila1_x1.setEnabled(true);
        fila1_x2.setEnabled(true);
        fila1_select.setEnabled(true);
        fila1_sol.setEnabled(true);
        fila2_x1.setEnabled(true);
        fila2_x2.setEnabled(true);
        fila2_select.setEnabled(true);
        fila2_sol.setEnabled(true);
        fila3_x1.setEnabled(true);
        fila3_x2.setEnabled(true);
        fila3_select.setEnabled(true);
        fila3_sol.setEnabled(true);
        fila4_x1.setEnabled(true);
        fila4_x2.setEnabled(true);
        fila4_select.setEnabled(true);
        fila4_sol.setEnabled(true);
        // Desactivar la fila 5
        fila5_x1.setEnabled(false);
        fila5_x2.setEnabled(false);
        fila5_select.setEnabled(false);
        fila5_sol.setEnabled(false);
    }
    public void enabledF5(){
        fila1_x1.setEnabled(true);
        fila1_x2.setEnabled(true);
        fila1_select.setEnabled(true);
        fila1_sol.setEnabled(true);
        fila2_x1.setEnabled(true);
        fila2_x2.setEnabled(true);
        fila2_select.setEnabled(true);
        fila2_sol.setEnabled(true);
        fila3_x1.setEnabled(true);
        fila3_x2.setEnabled(true);
        fila3_select.setEnabled(true);
        fila3_sol.setEnabled(true);
        fila4_x1.setEnabled(true);
        fila4_x2.setEnabled(true);
        fila4_select.setEnabled(true);
        fila4_sol.setEnabled(true);
        fila5_x1.setEnabled(true);
        fila5_x2.setEnabled(true);
        fila5_select.setEnabled(true);
        fila5_sol.setEnabled(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> fila1_select;
    private javax.swing.JTextField fila1_sol;
    private javax.swing.JTextField fila1_x1;
    private javax.swing.JTextField fila1_x2;
    private javax.swing.JComboBox<String> fila2_select;
    private javax.swing.JTextField fila2_sol;
    private javax.swing.JTextField fila2_x1;
    private javax.swing.JTextField fila2_x2;
    private javax.swing.JComboBox<String> fila3_select;
    private javax.swing.JTextField fila3_sol;
    private javax.swing.JTextField fila3_x1;
    private javax.swing.JTextField fila3_x2;
    private javax.swing.JComboBox<String> fila4_select;
    private javax.swing.JTextField fila4_sol;
    private javax.swing.JTextField fila4_x1;
    private javax.swing.JTextField fila4_x2;
    private javax.swing.JComboBox<String> fila5_select;
    private javax.swing.JTextField fila5_sol;
    private javax.swing.JTextField fila5_x1;
    private javax.swing.JTextField fila5_x2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
