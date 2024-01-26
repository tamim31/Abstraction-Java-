
package interfaces;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Circle c= new Circle(5.0);
        System.out.println("Area of circle is " + c.area());
        
        Rectangle r=new Rectangle(4.0, 5.0);
        System.out.println("Area of Rectangle is " + r.area());
        
    }
    
}
