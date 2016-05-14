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
public class Ecuacion {
    private String name_restriccion;
    private int x1, x2, equal, sol;

    public Ecuacion(String name, int x1, int x2, int equal, int sol){
        this.name_restriccion = name;
        this.x1 = x1;
        this.x2 = x2;
        this.equal = equal;
        this.sol = sol;
    }
    public String getName_restriccion() {
        return name_restriccion;
    }

    public void setName_restriccion(String name_restriccion) {
        this.name_restriccion = name_restriccion;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getEqual() {
        return equal;
    }

    public void setEqual(int equal) {
        this.equal = equal;
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        this.sol = sol;
    }     
}
