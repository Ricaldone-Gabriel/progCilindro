/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progcilindro;

/**
 *
 * @author gigga
 */
public class Cerchio {
    protected double raggio;

    Cerchio(double raggio){
        this.raggio = raggio;
    }
    public double getRaggio(){
        return raggio;
    }
    
    public void setRaggio(double raggio){
        this.raggio = raggio;
    }
    
    public double circonferenza(){
        return Math.PI*(raggio*2);
    }
    
    public double area(){
        return Math.PI*(raggio*raggio);
    }
    
}
