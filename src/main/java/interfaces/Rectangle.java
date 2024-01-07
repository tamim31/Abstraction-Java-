
package interfaces;

/**
 *
 * @author USER
 */
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
        
        return w* l;
    }
    
    
    
}
