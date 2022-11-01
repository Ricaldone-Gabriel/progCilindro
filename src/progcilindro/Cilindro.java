/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progcilindro;

/**
 *
 * @author gigga
 */
public class Cilindro extends Cerchio{
    protected double altezza;
    
    Cilindro(double altezza, double raggio){
        super(raggio);
        this.altezza = altezza;
    }
   
    public double getAltezza(){
        return raggio;
    }
    
    public void setAltezza(double altezza){
        this.altezza = altezza;
    }
    
    public double volume(){
       return area()*altezza;
    }
}
