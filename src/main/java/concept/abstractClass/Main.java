
package concept.abstractClass;


public class Main {

    
    public static void main(String[] args) {
        
           //Shape s1=new Shape();[An instance of an abstract class can not be created.]
         
        Shape s1=new Circle();
        s1.draw();
        
        Shape s2=new Rectangle();
        s2.draw();
        
        Shape s;
        s=new Circle();
         s.color();
         
        s=new Rectangle();
        s.color();
        
        s.redraw();
        s.recolor();
        Triangle t1=new Triangle();
        t1.display();
        t1.color();
        t1.draw();

       
        
        
    }
    
}
