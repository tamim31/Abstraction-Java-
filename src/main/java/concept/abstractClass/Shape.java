
package concept.abstractClass;


abstract class Shape {
    
    Shape()//Constructors are allowed. in abstract class
    {
        System.out.println("Constructors are allowed. in abstract class");
    }
    void redraw()//We can have an abstract class without any abstract method.
    {
        
    }
    final void recolor()//Abstract classes can also have final methods 
    {
        System.out.println("Abstract classes can also have final methods ");
    }
    
    public void fun()
    {
        System.out.println("it is fun ");
    }
    
    abstract void draw();
    abstract void color();
    abstract void display();
    
    
}
