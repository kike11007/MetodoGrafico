/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodografico;

/**
 *
 * @author saul
 */
public class Recta {
    private float x1, x2;

    public Recta(float x1, String x) {
        if(x.equals("x1")){
            
        }else{
            
        }
    }
    
    public Recta(float x1, float x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    
    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }    
}
