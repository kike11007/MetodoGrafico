/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodografico;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author saul
 */
public class Grafica extends Canvas {
    
    Graphics g; 
    private int f1,x1,x2,flag1,x3,x4,flag2,x5,x6,flag3,x7,x8,flag4,x9,x10,flag5;

    public Grafica(int x1, int x2, int flag1, int x3, int x4, int flag2, int x5, 
        int x6, int flag3, int x7, int x8, int flag4, int x9, int x10, int flag5) {
        this.setBackground(Color.LIGHT_GRAY);
        this.x1 = x1;
        this.x2 = x2;
        this.flag1 = flag1;
        this.x3 = x3;
        this.x4 = x4;
        this.flag2 = flag2;
        this.x5 = x5;
        this.x6 = x6;
        this.flag3 = flag3;
        this.x7 = x7;
        this.x8 = x8;
        this.flag4 = flag4;
        this.x9 = x9;
        this.x10 = x10;
        this.flag5 = flag5;
    }
    
    @Override 
    public void paint(Graphics g){
        //jPanel3
        g.setColor(Color.red);
        // eje X
        g.drawLine(0, 250, 500, 250);
        // eje Y
        g.drawLine(250, 0, 250, 500);
        // constructor para las rectas
        recta(g, x1, x2,flag1,x3,x4,flag2,x5,x6,flag3,x7,x8,flag4,x9,x10,flag5);
        // rectangulo para mostrar los datos
        g.setColor(Color.black);
        g.fillRect(0, 500, 500, 800);
   }
    
    public void recta(Graphics g, int x1, int x2, int flag1, int x3, int x4, int flag2, int x5, 
        int x6, int flag3, int x7, int x8, int flag4, int x9, int x10, int flag5){
        if(flag1 == 1){
            g.setColor(Color.BLUE);
            if(x2 == 0){
                g.drawLine(250+x1*20,0,250+x1*20,500);
            }else{
                if(x1 == 0){
                    g.drawLine(0,250-x2*20,500,250-x2*20);
                } else{
                    g.drawLine(250+x1*20,250,250,250-x2*20);
                }
            }
        }
        if(flag2 == 1){
            g.setColor(Color.BLUE);
            if(x2 == 0){
                g.drawLine(250+x1*20,0,250+x1*20,500);
            }else{
                if(x1 == 0){
                    g.drawLine(0,250-x2*20,500,250-x2*20);
                } else{
                    g.drawLine(250+x1*20,250,250,250-x2*20);
                }
            }
            g.setColor(Color.GREEN);
            if(x4 == 0){
                g.drawLine(250+x3*20,0,250+x3*20,500);
            }else{
                if(x3 == 0){
                    g.drawLine(0,250-x4*20,500,250-x4*20);
                } else{
                    g.drawLine(250+x3*20,250,250,250-x4*20);
                }
            }
        }
        if(flag3 == 1){
            g.setColor(Color.BLUE);
            if(x2 == 0){
                g.drawLine(250+x1*20,0,250+x1*20,500);
            }else{
                if(x1 == 0){
                    g.drawLine(0,250-x2*20,500,250-x2*20);
                } else{
                    g.drawLine(250+x1*20,250,250,250-x2*20);
                }
            }
            g.setColor(Color.GREEN);
            if(x4 == 0){
                g.drawLine(250+x3*20,0,250+x3*20,500);
            }else{
                if(x3 == 0){
                    g.drawLine(0,250-x4*20,500,250-x4*20);
                } else{
                    g.drawLine(250+x3*20,250,250,250-x4*20);
                }
            }
            g.setColor(Color.YELLOW);
            if(x6 == 0){
                g.drawLine(250+x5*20,0,250+x5*20,500);
            }else{
                if(x5 == 0){
                    g.drawLine(0,250-x6*20,500,250-x6*20);
                } else{
                     g.drawLine(250+x5*20,250,250,250-x6*20);
                }
            }
        }
        if(flag4 == 1){
            g.setColor(Color.BLUE);
            if(x2 == 0){
                g.drawLine(250+x1*20,0,250+x1*20,500);
            }else{
                if(x1 == 0){
                    g.drawLine(0,250-x2*20,500,250-x2*20);
                } else{
                    g.drawLine(250+x1*20,250,250,250-x2*20);
                }
            }
            g.setColor(Color.GREEN);
            if(x4 == 0){
                g.drawLine(250+x3*20,0,250+x3*20,500);
            }else{
                if(x3 == 0){
                    g.drawLine(0,250-x4*20,500,250-x4*20);
                } else{
                    g.drawLine(250+x3*20,250,250,250-x4*20);
                }
            }
            g.setColor(Color.YELLOW);
            if(x6 == 0){
                g.drawLine(250+x5*20,0,250+x5*20,500);
            }else{
                if(x5 == 0){
                    g.drawLine(0,250-x6*20,500,250-x6*20);
                } else{
                     g.drawLine(250+x5*20,250,250,250-x6*20);
                }
            }
            g.setColor(Color.MAGENTA);
            if(x8 == 0){
                g.drawLine(250+x7*20,0,250+x7*20,500);
            }else{
                if(x7 == 0){
                    g.drawLine(0,250-x8*20,500,250-x8*20);
                } else{
                     g.drawLine(250+x7*20,250,250,250-x8*20);
                }
            }
        }
        if(flag5 == 1){
            g.setColor(Color.BLUE);
            if(x2 == 0){
                g.drawLine(250+x1*20,0,250+x1*20,500);
            }else{
                if(x1 == 0){
                    g.drawLine(0,250-x2*20,500,250-x2*20);
                } else{
                    g.drawLine(250+x1*20,250,250,250-x2*20);
                }
            }
            g.setColor(Color.GREEN);
            if(x4 == 0){
                g.drawLine(250+x3*20,0,250+x3*20,500);
            }else{
                if(x3 == 0){
                    g.drawLine(0,250-x4*20,500,250-x4*20);
                } else{
                    g.drawLine(250+x3*20,250,250,250-x4*20);
                }
            }
            g.setColor(Color.YELLOW);
            if(x6 == 0){
                g.drawLine(250+x5*20,0,250+x5*20,500);
            }else{
                if(x5 == 0){
                    g.drawLine(0,250-x6*20,500,250-x6*20);
                } else{
                     g.drawLine(250+x5*20,250,250,250-x6*20);
                }
            }
            g.setColor(Color.MAGENTA);
            if(x8 == 0){
                g.drawLine(250+x7*20,0,250+x7*20,500);
            }else{
                if(x7 == 0){
                    g.drawLine(0,250-x8*20,500,250-x8*20);
                } else{
                     g.drawLine(250+x7*20,250,250,250-x8*20);
                }
            }
            g.setColor(Color.white);
            if(x10 == 0){
                g.drawLine(250+x9*20,0,250+x9*20,500);
            }else{
                if(x9 == 0){
                    g.drawLine(0,250-x10*20,500,250-x10*20);
                } else{
                     g.drawLine(250+x9*20,250,250,250-x10*20);
                }
            }
        }
    }    
}

