
package interface2;

/**
 *
 * @author USER
 */
public class Input implements Math {

    private final int a;
    private final int b;

    Input(int a, int b) {
        this.a=a;
        this.b=b;
        
    }

    @Override
    public int add() {
        return a+b;
    }
    @Override
    public int mul(){
        return a*b;
    }
    
}
