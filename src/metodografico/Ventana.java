/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodografico;

import javax.swing.JFrame;

/**
 *
 * @author saul
 */
public class Ventana extends JFrame{
    public Ventana(){
        this.setLocation(401, 0);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Grafica g = new Grafica();
        this.add(g);
        this.setVisible(true);
    }
    
}
