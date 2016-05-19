/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodografico;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author saul
 */
public class Grafica extends Canvas {
    
    public Grafica(){
        this.setBackground(Color.WHITE);
    }
    
   @Override 
   public void paint(Graphics g){
        //jPanel3
        g.setColor(Color.red);
        // eje X
        g.drawLine(0, 250, 500, 250);
        // eje Y
        g.drawLine(250, 0, 250, 500);
   }
   
   public void pintarLinea(Graphics g, String color, float x1, float x2, float y1, float y2){
       g.setColor(asignarColor(color));
       g.drawLine(WIDTH, WIDTH, WIDTH, WIDTH);
   }

    private Color asignarColor(String color) {
        
        if(color.equals("azul")){
            return Color.BLUE;    
        }
        if(color.equals("verde")){
            return Color.GREEN;
        }
        if(color.equals("morado")){
            return Color.magenta;
        }
        if(color.equals("negro")){
            return Color.BLACK;
        }else{
            return Color.ORANGE;
        }
    }
   
   
      
}
