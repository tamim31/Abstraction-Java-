/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circle c= new Circle(5.0);
        System.out.println("Area of circle is " + c.area());
        
        Rectangle r=new Rectangle(4.0, 5.0);
        System.out.println("Area of Rectangle is " + r.area());
        
    }
    
}
