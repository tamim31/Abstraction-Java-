/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concept.abstractClass;

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
        
        Shape s1=new Circle();
        s1.draw();
        
        Shape s2=new Rectangle();
        s2.draw();
        
        Shape s;
        s=new Circle();
         s.color();
         
        s=new Rectangle();
        s.color();
        
        
    }
    
}
