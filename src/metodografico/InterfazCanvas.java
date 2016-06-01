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
    
    ArrayList <Recta> rectas = new ArrayList <Recta> ();
    
    public void recibirEcuaciones(ArrayList ecuaciones){
        ic_ecuaciones = ecuaciones;
    }
    
    public void asignacionValores(){
        int f1x1, f1x2, f2x1, f2x2, f3x1, f3x2, f4x1, f4x2, f5x1, f5x2;
        int x1 = ic_ecuaciones.get(0).getX1();
        int x2 = ic_ecuaciones.get(0).getX2();
        String fun = ic_ecuaciones.get(0).getOperacion();
        label_fun_obj.setText("Max Z = "+x1+"x1"+fun +x2+"x2");
        int opcion = ic_ecuaciones.size();
        switch(opcion){
            case 2:
            	f1x1 = ic_ecuaciones.get(1).getX1();
            	f1x2 = ic_ecuaciones.get(1).getX2();
                if(f1x1 == 0){
                    jLabel3.setText(f1x2+"x2"
                        +ic_ecuaciones.get(1).getEqual()
                        +ic_ecuaciones.get(1).getSol());
                }else{
                    if(f1x2 == 0){
                        jLabel3.setText(f1x1+"x1"
                        +ic_ecuaciones.get(1).getEqual()
                        +ic_ecuaciones.get(1).getSol());
                    } else{
                        jLabel3.setText(f1x1 +"x1"
                            +ic_ecuaciones.get(1).getOperacion()
                            +f1x2+"x2"
                            +ic_ecuaciones.get(1).getEqual()
                            +ic_ecuaciones.get(1).getSol()
                        );
                    }
                }
                
                jLabel4.setText(" ");
                jLabel5.setText(" ");
                jLabel6.setText(" ");
                jLabel7.setText(" ");
                break;
            case 3:
                f1x1 = ic_ecuaciones.get(1).getX1();
            	f1x2 = ic_ecuaciones.get(1).getX2();
                if(f1x1 == 0){
                    jLabel3.setText(f1x2+"x2"
                        +ic_ecuaciones.get(1).getEqual()
                        +ic_ecuaciones.get(1).getSol());
                }else{
                    if(f1x2 == 0){
                        jLabel3.setText(f1x1+"x1"
                        +ic_ecuaciones.get(1).getEqual()
                        +ic_ecuaciones.get(1).getSol());
                    } else{
                        jLabel3.setText(f1x1 +"x1"
                            +ic_ecuaciones.get(1).getOperacion()
                            +f1x2+"x2"
                            +ic_ecuaciones.get(1).getEqual()
                            +ic_ecuaciones.get(1).getSol()
                        );
                    }
                }
                f2x1 = ic_ecuaciones.get(2).getX1();
            	f2x2 = ic_ecuaciones.get(2).getX2();
                if(f2x1 == 0){
                    jLabel4.setText(f2x2+"x2"
                        +ic_ecuaciones.get(2).getEqual()
                        +ic_ecuaciones.get(2).getSol());
                }else{
                    if(f2x2 == 0){
                        jLabel4.setText(f2x1+"x1"
                        +ic_ecuaciones.get(2).getEqual()
                        +ic_ecuaciones.get(2).getSol());
                    } else{
                        jLabel4.setText(f2x1 +"x1"
                            +ic_ecuaciones.get(2).getOperacion()
                            +f2x2+"x2"
                            +ic_ecuaciones.get(2).getEqual()
                            +ic_ecuaciones.get(2).getSol()
                        );
                    }
                }
                jLabel5.setText(" ");
                jLabel6.setText(" ");
                jLabel7.setText(" ");
                break;
            case 4:
                f1x1 = ic_ecuaciones.get(1).getX1();
            	f1x2 = ic_ecuaciones.get(1).getX2();
                if(f1x1 == 0){
                    jLabel3.setText(f1x2+"x2"
                        +ic_ecuaciones.get(1).getEqual()
                        +ic_ecuaciones.get(1).getSol());
                }else{
                    if(f1x2 == 0){
                        jLabel3.setText(f1x1+"x1"
                        +ic_ecuaciones.get(1).getEqual()
                        +ic_ecuaciones.get(1).getSol());
                    } else{
                        jLabel3.setText(f1x1 +"x1"
                            +ic_ecuaciones.get(1).getOperacion()
                            +f1x2+"x2"
                            +ic_ecuaciones.get(1).getEqual()
                            +ic_ecuaciones.get(1).getSol()
                        );
                    }
                }
                f2x1 = ic_ecuaciones.get(2).getX1();
            	f2x2 = ic_ecuaciones.get(2).getX2();
                if(f2x1 == 0){
                    jLabel4.setText(f2x2+"x2"
                        +ic_ecuaciones.get(2).getEqual()
                        +ic_ecuaciones.get(2).getSol());
                }else{
                    if(f2x2 == 0){
                        jLabel4.setText(f2x1+"x1"
                        +ic_ecuaciones.get(2).getEqual()
                        +ic_ecuaciones.get(2).getSol());
                    } else{
                        jLabel4.setText(f2x1 +"x1"
                            +ic_ecuaciones.get(2).getOperacion()
                            +f2x2+"x2"
                            +ic_ecuaciones.get(2).getEqual()
                            +ic_ecuaciones.get(2).getSol()
                        );
                    }
                }
                f3x1 = ic_ecuaciones.get(3).getX1();
            	f3x2 = ic_ecuaciones.get(3).getX2();
                if(f3x1 == 0){
                    jLabel5.setText(f3x2+"x2"
                        +ic_ecuaciones.get(3).getEqual()
                        +ic_ecuaciones.get(3).getSol());
                }else{
                    if(f3x2 == 0){
                        jLabel5.setText(f3x1+"x1"
                        +ic_ecuaciones.get(3).getEqual()
                        +ic_ecuaciones.get(3).getSol());
                    } else{
                        jLabel5.setText(f3x1 +"x1"
                            +ic_ecuaciones.get(3).getOperacion()
                            +f3x2+"x2"
                            +ic_ecuaciones.get(3).getEqual()
                            +ic_ecuaciones.get(3).getSol()
                        );
                    }
                }
                jLabel6.setText(" ");
                jLabel7.setText(" ");
                break;
            case 5:
                f1x1 = ic_ecuaciones.get(1).getX1();
            	f1x2 = ic_ecuaciones.get(1).getX2();
                if(f1x1 == 0){
                    jLabel3.setText(f1x2+"x2"
                        +ic_ecuaciones.get(1).getEqual()
                        +ic_ecuaciones.get(1).getSol());
                }else{
                    if(f1x2 == 0){
                        jLabel3.setText(f1x1+"x1"
                        +ic_ecuaciones.get(1).getEqual()
                        +ic_ecuaciones.get(1).getSol());
                    } else{
                        jLabel3.setText(f1x1 +"x1"
                            +ic_ecuaciones.get(1).getOperacion()
                            +f1x2+"x2"
                            +ic_ecuaciones.get(1).getEqual()
                            +ic_ecuaciones.get(1).getSol()
                        );
                    }
                }
                f2x1 = ic_ecuaciones.get(2).getX1();
            	f2x2 = ic_ecuaciones.get(2).getX2();
                if(f2x1 == 0){
                    jLabel4.setText(f2x2+"x2"
                        +ic_ecuaciones.get(2).getEqual()
                        +ic_ecuaciones.get(2).getSol());
                }else{
                    if(f2x2 == 0){
                        jLabel4.setText(f2x1+"x1"
                        +ic_ecuaciones.get(2).getEqual()
                        +ic_ecuaciones.get(2).getSol());
                    } else{
                        jLabel4.setText(f2x1 +"x1"
                            +ic_ecuaciones.get(2).getOperacion()
                            +f2x2+"x2"
                            +ic_ecuaciones.get(2).getEqual()
                            +ic_ecuaciones.get(2).getSol()
                        );
                    }
                }
                f3x1 = ic_ecuaciones.get(3).getX1();
            	f3x2 = ic_ecuaciones.get(3).getX2();
                if(f3x1 == 0){
                    jLabel5.setText(f3x2+"x2"
                        +ic_ecuaciones.get(3).getEqual()
                        +ic_ecuaciones.get(3).getSol());
                }else{
                    if(f3x2 == 0){
                        jLabel5.setText(f3x1+"x1"
                        +ic_ecuaciones.get(3).getEqual()
                        +ic_ecuaciones.get(3).getSol());
                    } else{
                        jLabel5.setText(f3x1 +"x1"
                            +ic_ecuaciones.get(3).getOperacion()
                            +f3x2+"x2"
                            +ic_ecuaciones.get(3).getEqual()
                            +ic_ecuaciones.get(3).getSol()
                        );
                    }
                }
                f4x1 = ic_ecuaciones.get(4).getX1();
            	f4x2 = ic_ecuaciones.get(4).getX2();
                if(f4x1 == 0){
                    jLabel6.setText(f4x2+"x2"
                        +ic_ecuaciones.get(4).getEqual()
                        +ic_ecuaciones.get(4).getSol());
                }else{
                    if(f4x2 == 0){
                        jLabel6.setText(f4x1+"x1"
                        +ic_ecuaciones.get(4).getEqual()
                        +ic_ecuaciones.get(4).getSol());
                    } else{
                        jLabel6.setText(f4x1 +"x1"
                            +ic_ecuaciones.get(4).getOperacion()
                            +f4x2+"x2"
                            +ic_ecuaciones.get(4).getEqual()
                            +ic_ecuaciones.get(4).getSol()
                        );
                    }
                }
                jLabel7.setText(" ");
                break;
            case 6:
                f1x1 = ic_ecuaciones.get(1).getX1();
            	f1x2 = ic_ecuaciones.get(1).getX2();
                if(f1x1 == 0){
                    jLabel3.setText(f1x2+"x2"
                        +ic_ecuaciones.get(1).getEqual()
                        +ic_ecuaciones.get(1).getSol());
                }else{
                    if(f1x2 == 0){
                        jLabel3.setText(f1x1+"x1"
                        +ic_ecuaciones.get(1).getEqual()
                        +ic_ecuaciones.get(1).getSol());
                    } else{
                        jLabel3.setText(f1x1 +"x1"
                            +ic_ecuaciones.get(1).getOperacion()
                            +f1x2+"x2"
                            +ic_ecuaciones.get(1).getEqual()
                            +ic_ecuaciones.get(1).getSol()
                        );
                    }
                }
                f2x1 = ic_ecuaciones.get(2).getX1();
            	f2x2 = ic_ecuaciones.get(2).getX2();
                if(f2x1 == 0){
                    jLabel4.setText(f2x2+"x2"
                        +ic_ecuaciones.get(2).getEqual()
                        +ic_ecuaciones.get(2).getSol());
                }else{
                    if(f2x2 == 0){
                        jLabel4.setText(f2x1+"x1"
                        +ic_ecuaciones.get(2).getEqual()
                        +ic_ecuaciones.get(2).getSol());
                    } else{
                        jLabel4.setText(f2x1 +"x1"
                            +ic_ecuaciones.get(2).getOperacion()
                            +f2x2+"x2"
                            +ic_ecuaciones.get(2).getEqual()
                            +ic_ecuaciones.get(2).getSol()
                        );
                    }
                }
                f3x1 = ic_ecuaciones.get(3).getX1();
            	f3x2 = ic_ecuaciones.get(3).getX2();
                if(f3x1 == 0){
                    jLabel5.setText(f3x2+"x2"
                        +ic_ecuaciones.get(3).getEqual()
                        +ic_ecuaciones.get(3).getSol());
                }else{
                    if(f3x2 == 0){
                        jLabel5.setText(f3x1+"x1"
                        +ic_ecuaciones.get(3).getEqual()
                        +ic_ecuaciones.get(3).getSol());
                    } else{
                        jLabel5.setText(f3x1 +"x1"
                            +ic_ecuaciones.get(3).getOperacion()
                            +f3x2+"x2"
                            +ic_ecuaciones.get(3).getEqual()
                            +ic_ecuaciones.get(3).getSol()
                        );
                    }
                }
                f4x1 = ic_ecuaciones.get(4).getX1();
            	f4x2 = ic_ecuaciones.get(4).getX2();
                if(f4x1 == 0){
                    jLabel6.setText(f4x2+"x2"
                        +ic_ecuaciones.get(4).getEqual()
                        +ic_ecuaciones.get(4).getSol());
                }else{
                    if(f4x2 == 0){
                        jLabel6.setText(f4x1+"x1"
                        +ic_ecuaciones.get(4).getEqual()
                        +ic_ecuaciones.get(4).getSol());
                    } else{
                        jLabel6.setText(f4x1 +"x1"
                            +ic_ecuaciones.get(4).getOperacion()
                            +f4x2+"x2"
                            +ic_ecuaciones.get(4).getEqual()
                            +ic_ecuaciones.get(4).getSol()
                        );
                    }
                }
                f5x1 = ic_ecuaciones.get(5).getX1();
            	f5x2 = ic_ecuaciones.get(5).getX2();
                if(f5x1 == 0){
                    jLabel7.setText(f5x2+"x2"
                        +ic_ecuaciones.get(5).getEqual()
                        +ic_ecuaciones.get(5).getSol());
                }else{
                    if(f5x2 == 0){
                        jLabel7.setText(f5x1+"x1"
                        +ic_ecuaciones.get(5).getEqual()
                        +ic_ecuaciones.get(5).getSol());
                    } else{
                        jLabel7.setText(f5x1 +"x1"
                            +ic_ecuaciones.get(5).getOperacion()
                            +f5x2+"x2"
                            +ic_ecuaciones.get(5).getEqual()
                            +ic_ecuaciones.get(5).getSol()
                        );
                    }
                }
                break;       
        }
    }
    
    public void asignacionModeloTablas() {
        int opcion = ic_ecuaciones.size();
        String[] columnNames = {"X1", "X2"};
        if(opcion == 2){        
            jTable1.setVisible(true);
            int r1x1 = ic_ecuaciones.get(1).getX1();
            int r1x2 = ic_ecuaciones.get(1).getX2();
            int r1sol = ic_ecuaciones.get(1).getSol();
            
            float mx1, mx2;
            if(r1x1 == 0){
                Object[][] model1 = {
                    {"--", r1sol/r1x2}
                };
                DefaultTableModel dtm= new DefaultTableModel(model1, columnNames);
                jTable1.setModel(dtm);
            } else{
                if(r1x2 == 0){
                    Object[][] model1 = {
                        {r1sol/r1x1, "--"}
                    };
                    DefaultTableModel dtm= new DefaultTableModel(model1, columnNames);
                    jTable1.setModel(dtm);
                } else{
                    mx1 = r1sol/r1x1;
                    mx2 = r1sol/r1x2;
                    Object[][] model1 = {
                        {mx1, "0"},
                        {"0", mx2}
                    };
                    DefaultTableModel dtm= new DefaultTableModel(model1, columnNames);
                    jTable1.setModel(dtm);
                }
            }
        } 
        if(opcion == 3){
            jTable1.setVisible(true);
            int r1x1 = ic_ecuaciones.get(1).getX1();
            int r1x2 = ic_ecuaciones.get(1).getX2();
            int r1sol = ic_ecuaciones.get(1).getSol();
            
            float mx1, mx2;
            if(r1x1 == 0){
                Object[][] model1 = {
                    {"--", r1sol/r1x2}
                };
                DefaultTableModel dtm= new DefaultTableModel(model1, columnNames);
                jTable1.setModel(dtm);
            } else{
                if(r1x2 == 0){
                    Object[][] model1 = {
                        {r1sol/r1x1, "--"}
                    };
                    DefaultTableModel dtm= new DefaultTableModel(model1, columnNames);
                    jTable1.setModel(dtm);
                } else{
                    mx1 = r1sol/r1x1;
                    mx2 = r1sol/r1x2;
                    Object[][] model1 = {
                        {mx1, "0"},
                        {"0", mx2}
                    };
                    DefaultTableModel dtm= new DefaultTableModel(model1, columnNames);
                    jTable1.setModel(dtm);
                }
            }
            // Modelo para la tabla 2
            jTable2.setVisible(true);
            int r2x1 = ic_ecuaciones.get(2).getX1();
            int r2x2 = ic_ecuaciones.get(2).getX2();
            int r2sol = ic_ecuaciones.get(2).getSol();
            
            float m2x1, m2x2;
            if(r2x1 == 0){
                Object[][] model2 = {
                    {"--", r2sol/r1x2}
                };
                DefaultTableModel dtm2 = new DefaultTableModel(model2, columnNames);
                jTable2.setModel(dtm2);
            } else{
                if(r2x2 == 0){
                    Object[][] model2 = {
                        {r2sol/r1x1, "--"}
                    };
                    DefaultTableModel dtm2 = new DefaultTableModel(model2, columnNames);
                    jTable2.setModel(dtm2);
                } else{
                    m2x1 = r2sol/r2x1;
                    m2x2 = r2sol/r2x2;
                    Object[][] model2 = {
                        {m2x1, "0"},
                        {"0", m2x2}
                    };
                    DefaultTableModel dtm2 = new DefaultTableModel(model2, columnNames);
                    jTable2.setModel(dtm2);
                }
            }
        }
        if(opcion == 4){
            jTable1.setVisible(true);
            int r1x1 = ic_ecuaciones.get(1).getX1();
            int r1x2 = ic_ecuaciones.get(1).getX2();
            int r1sol = ic_ecuaciones.get(1).getSol();
            
            float mx1, mx2;
            if(r1x1 == 0){
                Object[][] model1 = {
                    {"--", r1sol/r1x2}
                };
                DefaultTableModel dtm= new DefaultTableModel(model1, columnNames);
                jTable1.setModel(dtm);
            } else{
                if(r1x2 == 0){
                    Object[][] model1 = {
                        {r1sol/r1x1, "--"}
                    };
                    DefaultTableModel dtm= new DefaultTableModel(model1, columnNames);
                    jTable1.setModel(dtm);
                } else{
                    mx1 = r1sol/r1x1;
                    mx2 = r1sol/r1x2;
                    Object[][] model1 = {
                        {mx1, "0"},
                        {"0", mx2}
                    };
                    DefaultTableModel dtm= new DefaultTableModel(model1, columnNames);
                    jTable1.setModel(dtm);
                }
            }
            // Modelo para la tabla 2
            jTable2.setVisible(true);
            int r2x1 = ic_ecuaciones.get(2).getX1();
            int r2x2 = ic_ecuaciones.get(2).getX2();
            int r2sol = ic_ecuaciones.get(2).getSol();
            float m2x1, m2x2;
            if(r2x2 == 0){
                Object[][] model2 = {
                    {r2sol/r2x1, "--"}
                };
                DefaultTableModel dtm2 = new DefaultTableModel(model2, columnNames);
                jTable2.setModel(dtm2);
            } else{
                if(r2x1 == 0){
                    Object[][] model2 = {
                        {"--", r2sol/r2x2}
                    };
                    DefaultTableModel dtm2 = new DefaultTableModel(model2, columnNames);
                    jTable2.setModel(dtm2);
                } else{
                    m2x1 = r2sol/r2x1;
                    m2x2 = r2sol/r2x2;
                    Object[][] model2 = {
                        {m2x1, "0"},
                        {"0", m2x2}
                    };
                    DefaultTableModel dtm2 = new DefaultTableModel(model2, columnNames);
                    jTable2.setModel(dtm2);
                }
            }
            // Modelo para la tabla 3
            jTable3.setVisible(true);
            int r3x1 = ic_ecuaciones.get(3).getX1();
            int r3x2 = ic_ecuaciones.get(3).getX2();
            int r3sol = ic_ecuaciones.get(3).getSol();
            
            float m3x1, m3x2;
            if(r3x1 == 0){
                Object[][] model3 = {
                    {"--", r3sol/r3x2}
                };
                DefaultTableModel dtm3 = new DefaultTableModel(model3, columnNames);
                jTable3.setModel(dtm3);
            } else{
                if(r3x2 == 0){
                    Object[][] model3 = {
                        {r3sol/r3x1, "--"}
                    };
                    DefaultTableModel dtm3 = new DefaultTableModel(model3, columnNames);
                    jTable3.setModel(dtm3);
                } else{
                    m3x1 = r3sol/r3x1;
                    m3x2 = r3sol/r3x2;
                    Object[][] model3 = {
                        {m3x1, "0"},
                        {"0", m3x2}
                    };
                    DefaultTableModel dtm3 = new DefaultTableModel(model3, columnNames);
                    jTable3.setModel(dtm3);
                }
            }
        }    
        if(opcion == 5){
            jTable1.setVisible(true);
            int r1x1 = ic_ecuaciones.get(1).getX1();
            int r1x2 = ic_ecuaciones.get(1).getX2();
            int r1sol = ic_ecuaciones.get(1).getSol();
            
            float mx1, mx2;
            if(r1x2 == 0){
                Object[][] model1 = {
                    {r1sol/r1x1, "--"}
                };
                DefaultTableModel dtm= new DefaultTableModel(model1, columnNames);
                jTable1.setModel(dtm);
            } else{
                if(r1x1 == 0){
                    Object[][] model1 = {
                        {"--", r1sol/r1x2}
                    };
                    DefaultTableModel dtm= new DefaultTableModel(model1, columnNames);
                    jTable1.setModel(dtm);
                } else{
                    mx1 = r1sol/r1x1;
                    mx2 = r1sol/r1x2;
                    Object[][] model1 = {
                        {mx1, "0"},
                        {"0", mx2}
                    };
                    DefaultTableModel dtm= new DefaultTableModel(model1, columnNames);
                    jTable1.setModel(dtm);
                }
            }
            // Modelo para la tabla 2
            jTable2.setVisible(true);
            int r2x1 = ic_ecuaciones.get(2).getX1();
            int r2x2 = ic_ecuaciones.get(2).getX2();
            int r2sol = ic_ecuaciones.get(2).getSol();
            
            float m2x1, m2x2;
            if(r2x2 == 0){
                Object[][] model2 = {
                    {r2sol/r2x1, "--"}
                };
                DefaultTableModel dtm2 = new DefaultTableModel(model2, columnNames);
                jTable2.setModel(dtm2);
            } else{
                if(r2x1 == 0){
                    Object[][] model2 = {
                        {"--", r2sol/r2x2}
                    };
                    DefaultTableModel dtm2 = new DefaultTableModel(model2, columnNames);
                    jTable2.setModel(dtm2);
                } else{
                    m2x1 = r2sol/r2x1;
                    m2x2 = r2sol/r2x2;
                    Object[][] model2 = {
                        {m2x1, "0"},
                        {"0", m2x2}
                    };
                    DefaultTableModel dtm2 = new DefaultTableModel(model2, columnNames);
                    jTable2.setModel(dtm2);
                }
            }
            // Modelo para la tabla 3
            jTable3.setVisible(true);
            int r3x1 = ic_ecuaciones.get(3).getX1();
            int r3x2 = ic_ecuaciones.get(3).getX2();
            int r3sol = ic_ecuaciones.get(3).getSol();
            
            float m3x1, m3x2;
            if(r3x2 == 0){
                Object[][] model3 = {
                    {r3sol/r3x1, "--"}
                };
                DefaultTableModel dtm3 = new DefaultTableModel(model3, columnNames);
                jTable3.setModel(dtm3);
            } else{
                if(r3x1 == 0){
                    Object[][] model3 = {
                        {"--", r3sol/r3x2}
                    };
                    DefaultTableModel dtm3 = new DefaultTableModel(model3, columnNames);
                    jTable3.setModel(dtm3);
                } else{
                    m3x1 = r3sol/r3x1;
                    m3x2 = r3sol/r3x2;
                    Object[][] model3 = {
                        {m3x1, "0"},
                        {"0", m3x2}
                    };
                    DefaultTableModel dtm3 = new DefaultTableModel(model3, columnNames);
                    jTable3.setModel(dtm3);
                }
            }
            // Modelo para la tabla 4
            jTable4.setVisible(true);
            int r4x1 = ic_ecuaciones.get(4).getX1();
            int r4x2 = ic_ecuaciones.get(4).getX2();
            int r4sol = ic_ecuaciones.get(4).getSol();
            
            float m4x1, m4x2;
            if(r4x2 == 0){
                Object[][] model4 = {
                    {r4sol/r4x1, "--"}
                };
                DefaultTableModel dtm4 = new DefaultTableModel(model4, columnNames);
                jTable4.setModel(dtm4);
            } else{
                if(r4x1 == 0){
                    Object[][] model4 = {
                        {"--", r4sol/r4x2}
                    };
                    DefaultTableModel dtm4 = new DefaultTableModel(model4, columnNames);
                    jTable4.setModel(dtm4);
                } else{
                    m4x1 = r4sol/r4x1;
                    m4x2 = r4sol/r4x2;
                    Object[][] model4 = {
                        {m4x1, "0"},
                        {"0", m4x2}
                    };
                    DefaultTableModel dtm4 = new DefaultTableModel(model4, columnNames);
                    jTable4.setModel(dtm4);
                }
            }
        }
        if(opcion == 6){
            jTable1.setVisible(true);
            int r1x1 = ic_ecuaciones.get(1).getX1();
            int r1x2 = ic_ecuaciones.get(1).getX2();
            int r1sol = ic_ecuaciones.get(1).getSol();
            
            float mx1, mx2;
            if(r1x2 == 0){
                Object[][] model1 = {
                    {r1sol/r1x1, "--"}
                };
                DefaultTableModel dtm= new DefaultTableModel(model1, columnNames);
                jTable1.setModel(dtm);
            } else{
                if(r1x1 == 0){
                    Object[][] model1 = {
                        {"--", r1sol/r1x2}
                    };
                    DefaultTableModel dtm= new DefaultTableModel(model1, columnNames);
                    jTable1.setModel(dtm);
                } else{
                    mx1 = r1sol/r1x1;
                    mx2 = r1sol/r1x2;
                    Object[][] model1 = {
                        {mx1, "0"},
                        {"0", mx2}
                    };
                    DefaultTableModel dtm= new DefaultTableModel(model1, columnNames);
                    jTable1.setModel(dtm);
                }
            }
            // Modelo para la tabla 2
            jTable2.setVisible(true);
            int r2x1 = ic_ecuaciones.get(2).getX1();
            int r2x2 = ic_ecuaciones.get(2).getX2();
            int r2sol = ic_ecuaciones.get(2).getSol();
            
            float m2x1, m2x2;
            if(r2x2 == 0){
                Object[][] model2 = {
                    {r2sol/r2x1, "--"}
                };
                DefaultTableModel dtm2 = new DefaultTableModel(model2, columnNames);
                jTable2.setModel(dtm2);
            } else{
                if(r2x1 == 0){
                    Object[][] model2 = {
                        {"--", r2sol/r2x2}
                    };
                    DefaultTableModel dtm2 = new DefaultTableModel(model2, columnNames);
                    jTable2.setModel(dtm2);
                } else{
                    m2x1 = r2sol/r2x1;
                    m2x2 = r2sol/r2x2;
                    Object[][] model2 = {
                        {m2x1, "0"},
                        {"0", m2x2}
                    };
                    DefaultTableModel dtm2 = new DefaultTableModel(model2, columnNames);
                    jTable2.setModel(dtm2);
                }
            }
            // Modelo para la tabla 3
            jTable3.setVisible(true);
            int r3x1 = ic_ecuaciones.get(3).getX1();
            int r3x2 = ic_ecuaciones.get(3).getX2();
            int r3sol = ic_ecuaciones.get(3).getSol();
            
            float m3x1, m3x2;
            if(r3x2 == 0){
                Object[][] model3 = {
                    {r3sol/r3x1, "--"}
                };
                DefaultTableModel dtm3 = new DefaultTableModel(model3, columnNames);
                jTable3.setModel(dtm3);
            } else{
                if(r3x1 == 0){
                    Object[][] model3 = {
                        {"--", r3sol/r3x2}
                    };
                    DefaultTableModel dtm3 = new DefaultTableModel(model3, columnNames);
                    jTable3.setModel(dtm3);
                } else{
                    m3x1 = r3sol/r3x1;
                    m3x2 = r3sol/r3x2;
                    Object[][] model3 = {
                        {m3x1, "0"},
                        {"0", m3x2}
                    };
                    DefaultTableModel dtm3 = new DefaultTableModel(model3, columnNames);
                    jTable3.setModel(dtm3);
                }
            }
            // Modelo para la tabla 4
            jTable4.setVisible(true);
            int r4x1 = ic_ecuaciones.get(4).getX1();
            int r4x2 = ic_ecuaciones.get(4).getX2();
            int r4sol = ic_ecuaciones.get(4).getSol();
            
            float m4x1, m4x2;
            if(r4x2 == 0){
                Object[][] model4 = {
                    {r4sol/r4x1, "--"}
                };
                DefaultTableModel dtm4 = new DefaultTableModel(model4, columnNames);
                jTable4.setModel(dtm4);
            } else{
                if(r4x1 == 0){
                    Object[][] model4 = {
                        {"--", r4sol/r4x2}
                    };
                    DefaultTableModel dtm4 = new DefaultTableModel(model4, columnNames);
                    jTable4.setModel(dtm4);
                } else{
                    m4x1 = r4sol/r4x1;
                    m4x2 = r4sol/r4x2;
                    Object[][] model4 = {
                        {m4x1, "0"},
                        {"0", m4x2}
                    };
                    DefaultTableModel dtm4 = new DefaultTableModel(model4, columnNames);
                    jTable4.setModel(dtm4);
                }
            }
            // Modelo para la tabla 5
            jTable5.setVisible(true);
            int r5x1 = ic_ecuaciones.get(5).getX1();
            int r5x2 = ic_ecuaciones.get(5).getX2();
            int r5sol = ic_ecuaciones.get(5).getSol();
            
            float m5x1, m5x2;
            if(r5x2 == 0){
                Object[][] model5 = {
                    {r5sol/r5x1, "--"}
                };
                DefaultTableModel dtm5 = new DefaultTableModel(model5, columnNames);
                jTable5.setModel(dtm5);
            } else{
                if(r5x1 == 0){
                    Object[][] model5 = {
                        {"--", r5sol/r5x2}
                    };
                    DefaultTableModel dtm5 = new DefaultTableModel(model5, columnNames);
                    jTable5.setModel(dtm5);
                } else{
                    m5x1 = r5sol/r5x1;
                    m5x2 = r5sol/r5x2;
                    Object[][] model5 = {
                        {m5x1, "0"},
                        {"0", m5x2}
                    };
                    DefaultTableModel dtm5 = new DefaultTableModel(model5, columnNames);
                    jTable5.setModel(dtm5);
                }
            }

        }
    }
    
    public void evaluacionFuncionObjetico(){
        int opcion = ic_ecuaciones.size();
        int fo_x1 = ic_ecuaciones.get(0).getX1();
        int fo_x2 = ic_ecuaciones.get(0).getX2();
        
        float f1_x1 = ic_ecuaciones.get(1).getX1();
        float f1_x2 = ic_ecuaciones.get(1).getX2();
        float f1_sol = ic_ecuaciones.get(1).getSol();
        String fo_signo = ic_ecuaciones.get(0).getOperacion();
        int f2_x1, f2_x2, f3_x1, f3_x2, f4_x1, f4_x2, f5_x1, f5_x2, f2_sol, f3_sol, f4_sol, f5_sol;
        switch(opcion){
            case 2:
                if(f1_x1 == 0){
                    jLabel14.setText("x2 = " +f1_sol/f1_x2);
                }else{
                    if(f1_x2 == 0){
                        jLabel13.setText("x1 = " +f1_sol/f1_x1);
                    }else{
                        jLabel13.setText(fo_x1+"("+f1_sol/f1_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*(f1_sol/f1_x1));
                        jLabel14.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f1_sol/f1_x2+") = "+fo_x2*(f1_sol/f1_x2));
                    }
                }
                break;
            case 3:
                f2_x1 = ic_ecuaciones.get(2).getX1();
                f2_x2 = ic_ecuaciones.get(2).getX2();
                f2_sol = ic_ecuaciones.get(2).getSol();
                
                if(f1_x1 == 0){
                    jLabel14.setText("x2 = " +f1_sol/f1_x2);
                }else{
                    if(f1_x2 == 0){
                        jLabel13.setText("x1 = " +f1_sol/f1_x1);
                    }else{
                        jLabel13.setText(fo_x1+"("+f1_sol/f1_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*(f1_sol/f1_x1));
                        jLabel14.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f1_sol/f1_x2+") = "+fo_x2*(f1_sol/f1_x2));
                    }
                }
                // Etiquetas para la fila 2
                if(f2_x1 == 0){
                    jLabel16.setText("x2"+"= "+f2_sol/f2_x2);
                }else{
                    if(f2_x2 == 0){
                        jLabel15.setText("x1"+"= "+f2_sol/f2_x1);
                    }else{
                        jLabel15.setText(fo_x1+"("+f2_sol/f2_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*(f2_sol/f2_x1));
                        jLabel16.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f2_sol/f2_x2+") = "+fo_x2*(f2_sol/f2_x2));
                    }
                }
                break;
            case 4:
                f2_x1 = ic_ecuaciones.get(2).getX1();
                f2_x2 = ic_ecuaciones.get(2).getX2();
                f2_sol = ic_ecuaciones.get(2).getSol();
                f3_x1 = ic_ecuaciones.get(3).getX1();
                f3_x2 = ic_ecuaciones.get(3).getX2();
                f3_sol = ic_ecuaciones.get(3).getSol();
                
                if(f1_x1 == 0){
                    jLabel14.setText("x2 = " +f1_sol/f1_x2);
                }else{
                    if(f1_x2 == 0){
                        jLabel13.setText("x1 = " +f1_sol/f1_x1);
                    }else{
                        jLabel13.setText(fo_x1+"("+f1_sol/f1_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*(f1_sol/f1_x1));
                        jLabel14.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f1_sol/f1_x2+") = "+fo_x2*(f1_sol/f1_x2));
                    }
                }
                // Etiquetas para la fila 2
                if(f2_x1 == 0){
                    jLabel16.setText("x2"+"= "+f2_sol/f2_x2);
                }else{
                    if(f2_x2 == 0){
                        jLabel15.setText("x1"+"= "+f2_sol/f2_x1);
                    }else{
                        jLabel15.setText(fo_x1+"("+f2_sol/f2_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*(f2_sol/f2_x1));
                        jLabel16.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f2_sol/f2_x2+") = "+fo_x2*(f2_sol/f2_x2));
                    }
                }
                // Etiquetas para la fila 3
                if(f3_x1 == 0){
                    jLabel18.setText("x2 = "+f3_sol/f3_x2);
                }else{
                    if(f3_x2 == 0){
                        jLabel17.setText("x1 = "+f3_sol/f3_x1);
                    }else{
                        jLabel17.setText(fo_x1+"("+f3_sol/f3_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*(f3_sol/f3_x1));
                        jLabel18.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f3_sol/f3_x2+") = "+fo_x2*(f3_sol/f3_x2));
                    }
                }
                break;
            case 5:
                f2_x1 = ic_ecuaciones.get(2).getX1();
                f2_x2 = ic_ecuaciones.get(2).getX2();
                f2_sol = ic_ecuaciones.get(2).getSol();
                f3_x1 = ic_ecuaciones.get(3).getX1();
                f3_x2 = ic_ecuaciones.get(3).getX2();
                f3_sol = ic_ecuaciones.get(3).getSol();
                f4_x1 = ic_ecuaciones.get(4).getX1();
                f4_x2 = ic_ecuaciones.get(4).getX2();
                f4_sol = ic_ecuaciones.get(4).getSol();
                
                if(f1_x1 == 0){
                    jLabel14.setText("x2 = " +f1_sol/f1_x2);
                }else{
                    if(f1_x2 == 0){
                        jLabel13.setText("x1 = " +f1_sol/f1_x1);
                    }else{
                        jLabel13.setText(fo_x1+"("+f1_sol/f1_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*(f1_sol/f1_x1));
                        jLabel14.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f1_sol/f1_x2+") = "+fo_x2*(f1_sol/f1_x2));
                    }
                }
                // Etiquetas para la fila 2
                if(f2_x1 == 0){
                    jLabel16.setText("x2"+"= "+f2_sol/f2_x2);
                }else{
                    if(f2_x2 == 0){
                        jLabel15.setText("x1"+"= "+f2_sol/f2_x1);
                    }else{
                        jLabel15.setText(fo_x1+"("+f2_sol/f2_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*(f2_sol/f2_x1));
                        jLabel16.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f2_sol/f2_x2+") = "+fo_x2*(f2_sol/f2_x2));
                    }
                }
                // Etiquetas para la fila 3
                if(f3_x1 == 0){
                    jLabel18.setText("x2 = "+f3_sol/f3_x2);
                }else{
                    if(f3_x2 == 0){
                        jLabel17.setText("x1 = "+f3_sol/f3_x1);
                    }else{
                        jLabel17.setText(fo_x1+"("+f3_sol/f3_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*(f3_sol/f3_x1));
                        jLabel18.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f3_sol/f3_x2+") = "+fo_x2*(f3_sol/f3_x2));
                    }
                }
                // Etiquetas para la fila 4
                if(f4_x1 == 0){
                    jLabel20.setText("x2 = "+f4_sol/f4_x2);
                }else{
                    if(f4_x2 == 0){
                        jLabel19.setText("x1 = "+f4_sol/f4_x1);
                    }else{
                        jLabel19.setText(fo_x1+"("+f4_sol/f4_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*(f4_sol/f4_x1));
                        jLabel20.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f4_sol/f4_x2+") = "+fo_x2*(f4_sol/f4_x2));
                    }
                }
                break;
            case 6:
                f2_x1 = ic_ecuaciones.get(2).getX1();
                f2_x2 = ic_ecuaciones.get(2).getX2();
                f2_sol = ic_ecuaciones.get(2).getSol();
                f3_x1 = ic_ecuaciones.get(3).getX1();
                f3_x2 = ic_ecuaciones.get(3).getX2();
                f3_sol = ic_ecuaciones.get(3).getSol();
                f4_x1 = ic_ecuaciones.get(4).getX1();
                f4_x2 = ic_ecuaciones.get(4).getX2();
                f4_sol = ic_ecuaciones.get(4).getSol();
                f5_x1 = ic_ecuaciones.get(5).getX1();
                f5_x2 = ic_ecuaciones.get(5).getX2();
                f5_sol = ic_ecuaciones.get(5).getSol();
                
                if(f1_x1 == 0){
                    jLabel14.setText("x2 = " +f1_sol/f1_x2);
                }else{
                    if(f1_x2 == 0){
                        jLabel13.setText("x1 = " +f1_sol/f1_x1);
                    }else{
                        jLabel13.setText(fo_x1+"("+f1_sol/f1_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*(f1_sol/f1_x1));
                        jLabel14.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f1_sol/f1_x2+") = "+fo_x2*(f1_sol/f1_x2));
                    }
                }
                // Etiquetas para la fila 2
                if(f2_x1 == 0){
                    jLabel16.setText("x2"+"= "+f2_sol/f2_x2);
                }else{
                    if(f2_x2 == 0){
                        jLabel15.setText("x1"+"= "+f2_sol/f2_x1);
                    }else{
                        jLabel15.setText(fo_x1+"("+f2_sol/f2_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*(f2_sol/f2_x1));
                        jLabel16.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f2_sol/f2_x2+") = "+fo_x2*(f2_sol/f2_x2));
                    }
                }
                // Etiquetas para la fila 3
                if(f3_x1 == 0){
                    jLabel18.setText("x2 = "+f3_sol/f3_x2);
                }else{
                    if(f3_x2 == 0){
                        jLabel17.setText("x1 = "+f3_sol/f3_x1);
                    }else{
                        jLabel17.setText(fo_x1+"("+f3_sol/f3_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*(f3_sol/f3_x1));
                        jLabel18.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f3_sol/f3_x2+") = "+fo_x2*(f3_sol/f3_x2));
                    }
                }
                // Etiquetas para la fila 4
                if(f4_x1 == 0){
                    jLabel20.setText("x2 = "+f4_sol/f4_x2);
                }else{
                    if(f4_x2 == 0){
                        jLabel19.setText("x1 = "+f4_sol/f4_x1);
                    }else{
                        jLabel19.setText(fo_x1+"("+f4_sol/f4_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*(f4_sol/f4_x1));
                        jLabel20.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f4_sol/f4_x2+") = "+fo_x2*(f4_sol/f4_x2));
                    }
                }
                // Etiquetas para la fila 5
                if(f5_x1 == 0){
                    jLabel22.setText("x2 = "+f5_sol/f5_x2);
                }else{
                    if(f5_x2 == 0){
                        jLabel21.setText("x1 = "+f5_sol/f5_x1);
                    }else{
                        jLabel21.setText(fo_x1+"("+f5_sol/f5_x1+")"+fo_signo+fo_x2+"(0) = "+fo_x1*(f5_sol/f5_x1));
                        jLabel22.setText(fo_x1+"(0)"+fo_signo+fo_x2+"("+f5_sol/f5_x2+") = "+fo_x2*(f5_sol/f5_x2));
                    }
                }
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
        jButton1.setVisible(false);
        jPanel1.setVisible(true);
        jPanel2.setVisible(true); 
        asignacionModeloTablas();
        evaluacionFuncionObjetico();
        
        int opcion = ic_ecuaciones.size();
        float x1 = ic_ecuaciones.get(1).getX1();
        float x2 = ic_ecuaciones.get(1).getX2();
        float f2x1, f2x2, f3x1, f3x2, f4x1, f4x2, f5x1, f5x2;
        Recta r_f1, r_f2, r_f3, r_f4, r_f5;
        
        switch(opcion){
            case 2:
                if(x1 == 0){
                    r_f1 = new Recta(0, ic_ecuaciones.get(1).getSol()/x2);
                    rectas.add(r_f1);
                }else{
                    if(x2 == 0){
                        r_f1 = new Recta(ic_ecuaciones.get(1).getSol()/x1, 0);
                        rectas.add(r_f1);
                    }else{
                        r_f1 = new Recta(ic_ecuaciones.get(1).getSol()/x1, ic_ecuaciones.get(1).getSol()/x2);
                        rectas.add(r_f1);
                    }
                }
                break;
            case 3:
                if(x1 == 0){
                    r_f1 = new Recta(0, ic_ecuaciones.get(1).getSol()/x2);
                    rectas.add(r_f1);
                }else{
                    if(x2 == 0){
                        r_f1 = new Recta(ic_ecuaciones.get(1).getSol()/x1, 0);
                        rectas.add(r_f1);
                    }else{
                        r_f1 = new Recta(ic_ecuaciones.get(1).getSol()/x1, ic_ecuaciones.get(1).getSol()/x2);
                        rectas.add(r_f1);
                    }
                }
                
                f2x1 = ic_ecuaciones.get(2).getX1();
                f2x2 = ic_ecuaciones.get(2).getX2();
                if(f2x1 == 0){
                    r_f2 = new Recta(0, ic_ecuaciones.get(2).getSol()/f2x2);
                    rectas.add(r_f2);
                }else{
                    if(f2x2 == 0){
                        r_f2 = new Recta(ic_ecuaciones.get(2).getSol()/f2x1, 0);
                        rectas.add(r_f2);
                    }else{
                        r_f2 = new Recta(ic_ecuaciones.get(2).getSol()/f2x2, ic_ecuaciones.get(2).getSol()/f2x2);
                        rectas.add(r_f2);
                    }
                }
                break;
            case 4:
                if(x1 == 0){
                    r_f1 = new Recta(0, ic_ecuaciones.get(1).getSol()/x2);
                    rectas.add(r_f1);
                }else{
                    if(x2 == 0){
                        r_f1 = new Recta(ic_ecuaciones.get(1).getSol()/x1, 0);
                        rectas.add(r_f1);
                    }else{
                        r_f1 = new Recta(ic_ecuaciones.get(1).getSol()/x1, ic_ecuaciones.get(1).getSol()/x2);
                        rectas.add(r_f1);
                    }
                }
                
                f2x1 = ic_ecuaciones.get(2).getX1();
                f2x2 = ic_ecuaciones.get(2).getX2();
                if(f2x1 == 0){
                    r_f2 = new Recta(0, ic_ecuaciones.get(2).getSol()/f2x2);
                    rectas.add(r_f2);
                }else{
                    if(f2x2 == 0){
                        r_f2 = new Recta(ic_ecuaciones.get(2).getSol()/f2x1, 0);
                        rectas.add(r_f2);
                    }else{
                        r_f2 = new Recta(ic_ecuaciones.get(2).getSol()/f2x2, ic_ecuaciones.get(2).getSol()/f2x2);
                        rectas.add(r_f2);
                    }
                }
                
                f3x1 = ic_ecuaciones.get(3).getX1();
                f3x2 = ic_ecuaciones.get(3).getX2();
                if(f3x1 == 0){
                    r_f3 = new Recta(0, ic_ecuaciones.get(3).getSol()/f3x2);
                    rectas.add(r_f3);
                }else{
                    if(f3x2 == 0){
                        r_f3 = new Recta(ic_ecuaciones.get(3).getSol()/f3x1, 0);
                        rectas.add(r_f3);
                    }else{
                        r_f3 = new Recta(ic_ecuaciones.get(3).getSol()/f3x2, ic_ecuaciones.get(3).getSol()/f3x2);
                        rectas.add(r_f3);
                    }
                }
                break;
            case 5:
                if(x1 == 0){
                    r_f1 = new Recta(0, ic_ecuaciones.get(1).getSol()/x2);
                    rectas.add(r_f1);
                }else{
                    if(x2 == 0){
                        r_f1 = new Recta(ic_ecuaciones.get(1).getSol()/x1, 0);
                        rectas.add(r_f1);
                    }else{
                        r_f1 = new Recta(ic_ecuaciones.get(1).getSol()/x1, ic_ecuaciones.get(1).getSol()/x2);
                        rectas.add(r_f1);
                    }
                }
                
                f2x1 = ic_ecuaciones.get(2).getX1();
                f2x2 = ic_ecuaciones.get(2).getX2();
                if(f2x1 == 0){
                    r_f2 = new Recta(0, ic_ecuaciones.get(2).getSol()/f2x2);
                    rectas.add(r_f2);
                }else{
                    if(f2x2 == 0){
                        r_f2 = new Recta(ic_ecuaciones.get(2).getSol()/f2x1, 0);
                        rectas.add(r_f2);
                    }else{
                        r_f2 = new Recta(ic_ecuaciones.get(2).getSol()/f2x2, ic_ecuaciones.get(2).getSol()/f2x2);
                        rectas.add(r_f2);
                    }
                }
                
                f3x1 = ic_ecuaciones.get(3).getX1();
                f3x2 = ic_ecuaciones.get(3).getX2();
                if(f3x1 == 0){
                    r_f3 = new Recta(0, ic_ecuaciones.get(3).getSol()/f3x2);
                    rectas.add(r_f3);
                }else{
                    if(f3x2 == 0){
                        r_f3 = new Recta(ic_ecuaciones.get(3).getSol()/f3x1, 0);
                        rectas.add(r_f3);
                    }else{
                        r_f3 = new Recta(ic_ecuaciones.get(3).getSol()/f3x2, ic_ecuaciones.get(3).getSol()/f3x2);
                        rectas.add(r_f3);
                    }
                }
                
                f4x1 = ic_ecuaciones.get(4).getX1();
                f4x2 = ic_ecuaciones.get(4).getX2();
                if(f4x1 == 0){
                    r_f4 = new Recta(0, ic_ecuaciones.get(4).getSol()/f4x2);
                    rectas.add(r_f4);
                }else{
                    if(f4x2 == 0){
                        r_f4 = new Recta(ic_ecuaciones.get(4).getSol()/f4x1, 0);
                        rectas.add(r_f1);
                    }else{
                        r_f4 = new Recta(ic_ecuaciones.get(4).getSol()/f4x1, ic_ecuaciones.get(4).getSol()/f4x2);
                        rectas.add(r_f4);
                    }
                }
                break;
            case 6:
                if(x1 == 0){
                    r_f1 = new Recta(0, ic_ecuaciones.get(1).getSol()/x2);
                    rectas.add(r_f1);
                }else{
                    if(x2 == 0){
                        r_f1 = new Recta(ic_ecuaciones.get(1).getSol()/x1, 0);
                        rectas.add(r_f1);
                    }else{
                        r_f1 = new Recta(ic_ecuaciones.get(1).getSol()/x1, ic_ecuaciones.get(1).getSol()/x2);
                        rectas.add(r_f1);
                    }
                }
                
                f2x1 = ic_ecuaciones.get(2).getX1();
                f2x2 = ic_ecuaciones.get(2).getX2();
                if(f2x1 == 0){
                    r_f2 = new Recta(0, ic_ecuaciones.get(2).getSol()/f2x2);
                    rectas.add(r_f2);
                }else{
                    if(f2x2 == 0){
                        r_f2 = new Recta(ic_ecuaciones.get(2).getSol()/f2x1, 0);
                        rectas.add(r_f2);
                    }else{
                        r_f2 = new Recta(ic_ecuaciones.get(2).getSol()/f2x2, ic_ecuaciones.get(2).getSol()/f2x2);
                        rectas.add(r_f2);
                    }
                }
                
                f3x1 = ic_ecuaciones.get(3).getX1();
                f3x2 = ic_ecuaciones.get(3).getX2();
                if(f3x1 == 0){
                    r_f3 = new Recta(0, ic_ecuaciones.get(3).getSol()/f3x2);
                    rectas.add(r_f3);
                }else{
                    if(f3x2 == 0){
                        r_f3 = new Recta(ic_ecuaciones.get(3).getSol()/f3x1, 0);
                        rectas.add(r_f3);
                    }else{
                        r_f3 = new Recta(ic_ecuaciones.get(3).getSol()/f3x2, ic_ecuaciones.get(3).getSol()/f3x2);
                        rectas.add(r_f3);
                    }
                }
                f4x1 = ic_ecuaciones.get(4).getX1();
                f4x2 = ic_ecuaciones.get(4).getX2();
                if(f4x1 == 0){
                    r_f4 = new Recta(0, ic_ecuaciones.get(4).getSol()/f4x2);
                    rectas.add(r_f4);
                }else{
                    if(f4x2 == 0){
                        r_f4 = new Recta(ic_ecuaciones.get(4).getSol()/f4x1, 0);
                        rectas.add(r_f4);
                    }else{
                        r_f4 = new Recta(ic_ecuaciones.get(4).getSol()/f4x2, ic_ecuaciones.get(4).getSol()/f4x2);
                        rectas.add(r_f4);
                    }
                }
                
                f5x1 = ic_ecuaciones.get(5).getX1();
                f5x2 = ic_ecuaciones.get(5).getX2();
                if(f5x1 == 0){
                    r_f5 = new Recta(0, ic_ecuaciones.get(5).getSol()/f5x2);
                    rectas.add(r_f5);
                }else{
                    if(f5x2 == 0){
                        r_f5 = new Recta(ic_ecuaciones.get(5).getSol()/f5x1, 0);
                        rectas.add(r_f5);
                    }else{
                        r_f5 = new Recta(ic_ecuaciones.get(5).getSol()/f5x2, ic_ecuaciones.get(5).getSol()/f5x2);
                        rectas.add(r_f5);
                    }
                }
                break;
        }
        Ventana v = new Ventana(rectas);
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
