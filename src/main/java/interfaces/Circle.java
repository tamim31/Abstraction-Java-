
package interfaces;


 class Circle implements Shape{
      private double r;
      public Circle(double r){
          this.r =r;
      }
      

    @Override
    public double area() {
        System.out.println("interfaces.Circle.area()");
       return Math.PI *r *r;
        
    }
    
}
