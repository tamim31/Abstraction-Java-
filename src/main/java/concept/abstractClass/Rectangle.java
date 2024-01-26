
package concept.abstractClass;

 class Rectangle extends Shape{

    @Override
    void draw() {
        System.out.println("concept.abstractClass.Rectangle.draw()");
    
    }

    @Override
    void color() {
        System.out.println("concept.abstractClass.Rectangle.color()");
    }
    void redraw()
    {
        System.out.println("concept.abstractClass.Rectangle.redraw()");
    }

    @Override
    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
