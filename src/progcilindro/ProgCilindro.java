/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progcilindro;

/**
 *
 * @author gigga
 */
public class ProgCilindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Cerchio Cerchione = new Cerchio(10);
      Cilindro Cilindrone = new Cilindro(10d,10d);
      
      System.out.println(Cerchione.circonferenza() + " Circonferenza");
      System.out.println(Cerchione.area()+ " Area");
      System.out.println(Cilindrone.volume() + " Volume");
      
      System.out.println(Cerchione.getRaggio() + " Raggio");
      System.out.println(Cilindrone.getAltezza()+ " Altezza");
      System.out.println(Cilindrone.getRaggio() + " Raggio");
      
      Cilindrone.setAltezza(20);
      Cilindrone.setRaggio(5);
      Cerchione.setRaggio(2);
      
      System.out.println(Cerchione.circonferenza() + " Circonferenza");
      System.out.println(Cerchione.area()+ " Area");
      System.out.println(Cilindrone.volume() + " Volume");
      
      System.out.println(Cerchione.getRaggio() + " Raggio");
      System.out.println(Cilindrone.getAltezza()+ " Altezza");
      System.out.println(Cilindrone.getRaggio() + " Raggio");
    }
    
}
