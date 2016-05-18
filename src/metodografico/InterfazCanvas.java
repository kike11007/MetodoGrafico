/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodografico;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saul
 */
public class InterfazCanvas extends javax.swing.JFrame {
    
    ArrayList <Ecuacion> ic_ecuaciones = new ArrayList <Ecuacion> ();
    
    public void recibirEcuaciones(ArrayList ecuaciones){
        ic_ecuaciones = ecuaciones;
    }
    
    public void asignacionValores(){
        int x1 = ic_ecuaciones.get(0).getX1();
        int x2 = ic_ecuaciones.get(0).getX2();
        String fun = ic_ecuaciones.get(0).getOperacion();
        label_fun_obj.setText("Max Z = "+x1+"x1"+fun +x2+"x2");
        int opcion = ic_ecuaciones.size();
        switch(opcion){
            case 2:
                jLabel3.setText(ic_ecuaciones.get(1).getX1() +"x1"
                        +ic_ecuaciones.get(1).getOperacion()
                        +ic_ecuaciones.get(1).getX2()+"x2"
                        +ic_ecuaciones.get(1).getEqual()
                        +ic_ecuaciones.get(1).getSol()
                );
                jLabel4.setText(" ");
                jLabel5.setText(" ");
                jLabel6.setText(" ");
                jLabel7.setText(" ");
                break;
            case 3:
                jLabel3.setText(ic_ecuaciones.get(1).getX1() +"x1"
                        +ic_ecuaciones.get(1).getOperacion()
                        +ic_ecuaciones.get(1).getX2()+"x2"
                        +ic_ecuaciones.get(1).getEqual()
                        +ic_ecuaciones.get(1).getSol()
                );
                jLabel4.setText(ic_ecuaciones.get(2).getX1() +"x1"
                        +ic_ecuaciones.get(2).getOperacion()
                        +ic_ecuaciones.get(2).getX2()+"x2"
                        +ic_ecuaciones.get(2).getEqual()
                        +ic_ecuaciones.get(2).getSol()
                );
                jLabel5.setText(" ");
                jLabel6.setText(" ");
                jLabel7.setText(" ");
                break;
            case 4:
                jLabel3.setText(ic_ecuaciones.get(1).getX1() +"x1"
                        +ic_ecuaciones.get(1).getOperacion()
                        +ic_ecuaciones.get(1).getX2()+"x2"
                        +ic_ecuaciones.get(1).getEqual()
                        +ic_ecuaciones.get(1).getSol()
                );
                jLabel4.setText(ic_ecuaciones.get(2).getX1() +"x1"
                        +ic_ecuaciones.get(2).getOperacion()
                        +ic_ecuaciones.get(2).getX2()+"x2"
                        +ic_ecuaciones.get(2).getEqual()
                        +ic_ecuaciones.get(2).getSol()
                );
                jLabel5.setText(ic_ecuaciones.get(3).getX1() +"x1"
                        +ic_ecuaciones.get(3).getOperacion()
                        +ic_ecuaciones.get(3).getX2()+"x2"
                        +ic_ecuaciones.get(3).getEqual()
                        +ic_ecuaciones.get(3).getSol()
                );
                jLabel6.setText(" ");
                jLabel7.setText(" ");
                break;
            case 5:
                jLabel3.setText(ic_ecuaciones.get(1).getX1() +"x1"
                        +ic_ecuaciones.get(1).getOperacion()
                        +ic_ecuaciones.get(1).getX2()+"x2"
                        +ic_ecuaciones.get(1).getEqual()
                        +ic_ecuaciones.get(1).getSol()
                );
                jLabel4.setText(ic_ecuaciones.get(2).getX1() +"x1"
                        +ic_ecuaciones.get(2).getOperacion()
                        +ic_ecuaciones.get(2).getX2()+"x2"
                        +ic_ecuaciones.get(2).getEqual()
                        +ic_ecuaciones.get(2).getSol()
                );
                jLabel5.setText(ic_ecuaciones.get(3).getX1() +"x1"
                        +ic_ecuaciones.get(3).getOperacion()
                        +ic_ecuaciones.get(3).getX2()+"x2"
                        +ic_ecuaciones.get(3).getEqual()
                        +ic_ecuaciones.get(3).getSol()
                );
                jLabel6.setText(ic_ecuaciones.get(4).getX1() +"x1"
                        +ic_ecuaciones.get(4).getOperacion()
                        +ic_ecuaciones.get(4).getX2()+"x2"
                        +ic_ecuaciones.get(4).getEqual()
                        +ic_ecuaciones.get(4).getSol()
                );
                jLabel7.setText(" ");
                break;
            case 6:
                jLabel3.setText(ic_ecuaciones.get(1).getX1() +"x1"
                        +ic_ecuaciones.get(1).getOperacion()
                        +ic_ecuaciones.get(1).getX2()+"x2"
                        +ic_ecuaciones.get(1).getEqual()
                        +ic_ecuaciones.get(1).getSol()
                );
                jLabel4.setText(ic_ecuaciones.get(2).getX1() +"x1"
                        +ic_ecuaciones.get(2).getOperacion()
                        +ic_ecuaciones.get(2).getX2()+"x2"
                        +ic_ecuaciones.get(2).getEqual()
                        +ic_ecuaciones.get(2).getSol()
                );
                jLabel5.setText(ic_ecuaciones.get(3).getX1() +"x1"
                        +ic_ecuaciones.get(3).getOperacion()
                        +ic_ecuaciones.get(3).getX2()+"x2"
                        +ic_ecuaciones.get(3).getEqual()
                        +ic_ecuaciones.get(3).getSol()
                );
                jLabel6.setText(ic_ecuaciones.get(4).getX1() +"x1"
                        +ic_ecuaciones.get(4).getOperacion()
                        +ic_ecuaciones.get(4).getX2()+"x2"
                        +ic_ecuaciones.get(4).getEqual()
                        +ic_ecuaciones.get(4).getSol()
                );
                jLabel7.setText(ic_ecuaciones.get(5).getX1() +"x1"
                        +ic_ecuaciones.get(5).getOperacion()
                        +ic_ecuaciones.get(5).getX2()+"x2"
                        +ic_ecuaciones.get(5).getEqual()
                        +ic_ecuaciones.get(5).getSol()
                );
                break;
            
        }
    }
    public void asignacionModeloTablas() {
        int opcion = ic_ecuaciones.size();
        String[] columnNames = {"X1", "X2"};
        if(opcion == 2){        
            jTable1.setVisible(true);
            Object[][] model1 = {
                {ic_ecuaciones.get(1).getX1(), "0"},
                {"0", ic_ecuaciones.get(1).getX2()}
            };
            DefaultTableModel dtm= new DefaultTableModel(model1, columnNames);
            jTable1.setModel(dtm);
        } 
        if(opcion == 3){
            jTable1.setVisible(true);
            jTable2.setVisible(true);
            Object[][] model1 = {
                {ic_ecuaciones.get(1).getX1(), "0"},
                {"0", ic_ecuaciones.get(1).getX2()}
            };
            Object[][] model2 = {
                {ic_ecuaciones.get(2).getX1(), "0"},
                {"0", ic_ecuaciones.get(2).getX2()}
            };
            DefaultTableModel dtm= new DefaultTableModel(model1, columnNames);
            DefaultTableModel dtm2= new DefaultTableModel(model2, columnNames);
            jTable1.setModel(dtm);
            jTable2.setModel(dtm2);
        }
        if(opcion == 4){
            jTable1.setVisible(true);
            jTable2.setVisible(true);
            jTable3.setVisible(true);
            Object[][] model1 = {
                {ic_ecuaciones.get(1).getX1(), "0"},
                {"0", ic_ecuaciones.get(1).getX2()}
            };
            Object[][] model2 = {
                {ic_ecuaciones.get(2).getX1(), "0"},
                {"0", ic_ecuaciones.get(2).getX2()}
            };
            Object[][] model3 = {
                {ic_ecuaciones.get(3).getX1(), "0"},
                {"0", ic_ecuaciones.get(3).getX2()}
            };
            DefaultTableModel dtm= new DefaultTableModel(model1, columnNames);
            DefaultTableModel dtm2= new DefaultTableModel(model2, columnNames);
            DefaultTableModel dtm3= new DefaultTableModel(model3, columnNames);
            jTable1.setModel(dtm);
            jTable2.setModel(dtm2);
            jTable3.setModel(dtm3);
        }    
        if(opcion == 5){
            jTable1.setVisible(true);
            jTable2.setVisible(true);
            jTable3.setVisible(true);
            jTable4.setVisible(true);
            Object[][] model1 = {
                {ic_ecuaciones.get(1).getX1(), "0"},
                {"0", ic_ecuaciones.get(1).getX2()}
            };
            Object[][] model2 = {
                {ic_ecuaciones.get(2).getX1(), "0"},
                {"0", ic_ecuaciones.get(2).getX2()}
            };
            Object[][] model3 = {
                {ic_ecuaciones.get(3).getX1(), "0"},
                {"0", ic_ecuaciones.get(3).getX2()}
            };
            Object[][] model4 = {
                {ic_ecuaciones.get(4).getX1(), "0"},
                {"0", ic_ecuaciones.get(4).getX2()}
            };
            DefaultTableModel dtm = new DefaultTableModel(model1, columnNames);
            DefaultTableModel dtm2 = new DefaultTableModel(model2, columnNames);
            DefaultTableModel dtm3 = new DefaultTableModel(model3, columnNames);
            DefaultTableModel dtm4 = new DefaultTableModel(model4, columnNames);
            jTable1.setModel(dtm);
            jTable2.setModel(dtm2);
            jTable3.setModel(dtm3);
            jTable4.setModel(dtm4);
        }
        if(opcion == 6){
            jTable1.setVisible(true);
            jTable2.setVisible(true);
            jTable3.setVisible(true);
            jTable4.setVisible(true);
            jTable5.setVisible(true);
            Object[][] model1 = {
                {ic_ecuaciones.get(1).getX1(), "0"},
                {"0", ic_ecuaciones.get(1).getX2()}
            };
            Object[][] model2 = {
                {ic_ecuaciones.get(2).getX1(), "0"},
                {"0", ic_ecuaciones.get(2).getX2()}
            };
            Object[][] model3 = {
                {ic_ecuaciones.get(3).getX1(), "0"},
                {"0", ic_ecuaciones.get(3).getX2()}
            };
            Object[][] model4 = {
                {ic_ecuaciones.get(4).getX1(), "0"},
                {"0", ic_ecuaciones.get(4).getX2()}
            };
            Object[][] model5 = {
                {ic_ecuaciones.get(5).getX1(), "0"},
                {"0", ic_ecuaciones.get(5).getX2()}
            };
            DefaultTableModel dtm = new DefaultTableModel(model1, columnNames);
            DefaultTableModel dtm2 = new DefaultTableModel(model2, columnNames);
            DefaultTableModel dtm3 = new DefaultTableModel(model3, columnNames);
            DefaultTableModel dtm4 = new DefaultTableModel(model4, columnNames);
            DefaultTableModel dtm5 = new DefaultTableModel(model5, columnNames);
            jTable1.setModel(dtm);
            jTable2.setModel(dtm2);
            jTable3.setModel(dtm3);
            jTable4.setModel(dtm4);
            jTable5.setModel(dtm5);
        }
    }
    
    public void evaluacionFuncionObjetico(){
        int opcion = ic_ecuaciones.size();
        int fo_x1 = ic_ecuaciones.get(0).getX1();
        int fo_x2 = ic_ecuaciones.get(0).getX2();
        int f1_x1 = ic_ecuaciones.get(1).getX1();
        int f1_x2 = ic_ecuaciones.get(1).getX2();
        String fo_signo = ic_ecuaciones.get(0).getOperacion();
        int f2_x1, f2_x2, f3_x1, f3_x2, f4_x1, f4_x2, f5_x1, f5_x2;
        switch(opcion){
            case 2:
                jLabel13.setText(fo_x1+"("+f1_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*f1_x1);
                jLabel14.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f1_x2 +") = "+fo_x2*f1_x2);
                break;
            case 3:
                f2_x1 = ic_ecuaciones.get(2).getX1();
                f2_x2 = ic_ecuaciones.get(2).getX2();
                
                jLabel13.setText(fo_x1+"("+f1_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*f1_x1);
                jLabel14.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f1_x2 +") = "+fo_x2*f1_x2);
                // Etiquetas para la fila 2
                jLabel15.setText(fo_x1+"("+f2_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*f2_x1);
                jLabel16.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f2_x2 +") = "+fo_x2*f2_x2);
                break;
            case 4:
                f2_x1 = ic_ecuaciones.get(2).getX1();
                f2_x2 = ic_ecuaciones.get(2).getX2();
                f3_x1 = ic_ecuaciones.get(3).getX1();
                f3_x2 = ic_ecuaciones.get(3).getX2();
                
                jLabel13.setText(fo_x1+"("+f1_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*f1_x1);
                jLabel14.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f1_x2 +") = "+fo_x2*f1_x2);
                // Etiquetas para la fila 2
                jLabel15.setText(fo_x1+"("+f2_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*f2_x1);
                jLabel16.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f2_x2 +") = "+fo_x2*f2_x2);
                // Etiquetas para la fila 3
                jLabel17.setText(fo_x1+"("+f3_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*f3_x1);
                jLabel18.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f3_x2 +") = "+fo_x2*f3_x2);
                break;
            case 5:
                f2_x1 = ic_ecuaciones.get(2).getX1();
                f2_x2 = ic_ecuaciones.get(2).getX2();
                f3_x1 = ic_ecuaciones.get(3).getX1();
                f3_x2 = ic_ecuaciones.get(3).getX2();
                f4_x1 = ic_ecuaciones.get(4).getX1();
                f4_x2 = ic_ecuaciones.get(4).getX2();
                
                jLabel13.setText(fo_x1+"("+f1_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*f1_x1);
                jLabel14.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f1_x2 +") = "+fo_x2*f1_x2);
                // Etiquetas para la fila 2
                jLabel15.setText(fo_x1+"("+f2_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*f2_x1);
                jLabel16.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f2_x2 +") = "+fo_x2*f2_x2);
                // Etiquetas para la fila 3
                jLabel17.setText(fo_x1+"("+f3_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*f3_x1);
                jLabel18.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f3_x2 +") = "+fo_x2*f3_x2);
                // Etiquetas para la fila 4
                jLabel19.setText(fo_x1+"("+f4_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*f4_x1);
                jLabel20.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f4_x2 +") = "+fo_x2*f4_x2);
                break;
            case 6:
                f2_x1 = ic_ecuaciones.get(2).getX1();
                f2_x2 = ic_ecuaciones.get(2).getX2();
                f3_x1 = ic_ecuaciones.get(3).getX1();
                f3_x2 = ic_ecuaciones.get(3).getX2();
                f4_x1 = ic_ecuaciones.get(4).getX1();
                f4_x2 = ic_ecuaciones.get(4).getX2();
                f5_x1 = ic_ecuaciones.get(5).getX1();
                f5_x2 = ic_ecuaciones.get(5).getX2();
                
                jLabel13.setText(fo_x1+"("+f1_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*f1_x1);
                jLabel14.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f1_x2 +") = "+fo_x2*f1_x2);
                // Etiquetas para la fila 2
                jLabel15.setText(fo_x1+"("+f2_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*f2_x1);
                jLabel16.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f2_x2 +") = "+fo_x2*f2_x2);
                // Etiquetas para la fila 3
                jLabel17.setText(fo_x1+"("+f3_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*f3_x1);
                jLabel18.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f3_x2 +") = "+fo_x2*f3_x2);
                // Etiquetas para la fila 4
                jLabel19.setText(fo_x1+"("+f4_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*f4_x1);
                jLabel20.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f4_x2 +") = "+fo_x2*f4_x2);
                // Etiquetas para la fila 5
                jLabel21.setText(fo_x1+"("+f5_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*f5_x1);
                jLabel22.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f5_x2 +") = "+fo_x2*f5_x2);
                break;
                
        }
    }
    public InterfazCanvas() {
        initComponents();
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        
        jTable2.setVisible(false);
        jTable3.setVisible(false);
        jTable4.setVisible(false);
        jTable5.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        label_fun_obj = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Método Gráfico");

        jButton1.setText("Cargar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        label_fun_obj.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        label_fun_obj.setText("jLabel2");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Restricciones"));

        jLabel2.setText("S.A");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignación de Valores "));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "X1", "X2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setText("Para 1");

        jLabel9.setText("Para 2");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "X1", "X2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel10.setText("Para 3");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "X1", "X2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel11.setText("Para 4");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "X1", "X2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "X1", "X2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jLabel12.setText("Para 4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)))
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)))
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)))
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)))
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)))
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel14)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel16)))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel18)))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel20)))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_fun_obj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_fun_obj)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        label_fun_obj.getAccessibleContext().setAccessibleName("label_fun_obj");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        asignacionValores();
        new Ventana();
        jButton1.setVisible(false);
        jPanel1.setVisible(true);
        jPanel2.setVisible(true); 
        asignacionModeloTablas();
        evaluacionFuncionObjetico();
    }//GEN-LAST:event_jButton1ActionPerformed
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfazCanvas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JLabel label_fun_obj;
    // End of variables declaration//GEN-END:variables
}
