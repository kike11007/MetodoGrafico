/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodografico;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author saul
 */
public class Ventana extends JFrame{
    
    private ArrayList <Recta> rectas = new ArrayList <Recta> ();
    Grafica g;

    public final ArrayList<Recta> getRectas() {
        return rectas;
    }

    public void setRectas(ArrayList<Recta> rectas) {
        this.rectas = rectas;
    }
    
    public Ventana(ArrayList <Recta> rectas){
        this.setLocation(401, 0);
        this.setSize(500,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int x1, x2, x3, x4, x5, x6, x7, x8, x9, x10;
        if(rectas.size() == 1){
            x1 = (int) rectas.get(0).getX1();
            x2 = (int) rectas.get(0).getX2();
            g = new Grafica(x1,x2,1,0,0,0,0,0,0,0,0,0,0,0,0);
        }
        if(rectas.size() == 2){
            x1 = (int) rectas.get(0).getX1();
            x2 = (int) rectas.get(0).getX2();
            x3 = (int) rectas.get(1).getX1();
            x4 = (int) rectas.get(1).getX2();
            g = new Grafica(x1,x2,1,x3,x4,1,0,0,0,0,0,0,0,0,0);
        }
        if(rectas.size() == 3){
            x1 = (int) rectas.get(0).getX1();
            x2 = (int) rectas.get(0).getX2();
            x3 = (int) rectas.get(1).getX1();
            x4 = (int) rectas.get(1).getX2();
            x5 = (int) rectas.get(2).getX1();
            x6 = (int) rectas.get(2).getX2();
            g = new Grafica(x1,x2,1,x3,x4,1,x5,x6,1,0,0,0,0,0,0);
        }
        if(rectas.size() == 4){
            x1 = (int) rectas.get(0).getX1();
            x2 = (int) rectas.get(0).getX2();
            x3 = (int) rectas.get(1).getX1();
            x4 = (int) rectas.get(1).getX2();
            x5 = (int) rectas.get(2).getX1();
            x6 = (int) rectas.get(2).getX2();
            x7 = (int) rectas.get(3).getX1();
            x8 = (int) rectas.get(3).getX2();
            
            g = new Grafica(x1,x2,1,x3,x4,1,x5,x6,1,x7,x8,1,0,0,0);
        }
        if(rectas.size() == 5){
            x1 = (int) rectas.get(0).getX1();
            x2 = (int) rectas.get(0).getX2();
            x3 = (int) rectas.get(1).getX1();
            x4 = (int) rectas.get(1).getX2();
            x5 = (int) rectas.get(2).getX1();
            x6 = (int) rectas.get(2).getX2();
            x7 = (int) rectas.get(3).getX1();
            x8 = (int) rectas.get(3).getX2();
            x9 = (int) rectas.get(4).getX1();
            x10 = (int) rectas.get(4).getX2();
            g = new Grafica(x1,x2,1,x3,x4,1,x5,x6,1,x7,x8,1,x9,x10,1);
        }
        this.add(g);
        this.setVisible(true);
    }
}
