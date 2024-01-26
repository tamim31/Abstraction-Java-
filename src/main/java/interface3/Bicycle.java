
package interface3;

public class Bicycle implements Vehicle {
    int speed;
    int gear;
    
    
    @Override
    public void changeGear(int newGear){
         
        gear = newGear;
    }
 
    @Override
    public void speedUp(int increment){
         
        speed = speed + increment;
    }
 
    @Override
    public void applyBrakes(int decrement){
         
        speed = speed - decrement;
    }
     public void display()
    {
        System.out.println("interface3.Bicycle.display()speed "+ speed);
        System.out.println("interface3.Bicycle.display() gear "+ gear);
        
    }
    
}
