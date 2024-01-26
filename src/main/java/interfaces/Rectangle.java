
package interfaces;


 class Rectangle implements Shape{

     private double w;
      private double l;
      public  Rectangle(double w,double l)
      {
          this.w=w;
          this.l=l;
      }
     
    @Override
    public double area() {
        System.out.println("interfaces.Rectangle.area()");
        return w* l;
    }
    
    
    
}
