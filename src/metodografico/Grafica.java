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
        setBackground(Color.WHITE);
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
}
