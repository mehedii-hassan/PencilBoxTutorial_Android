 
package abstraction;

/**
 *
 * @author MH
 */
public class Dog extends Animal{

    public Dog(int longivity) {
        super(longivity);
    }
    
     public void bark(){
        System.out.println("Barking........");
    }

    @Override
    public void move() {
        System.out.println("moving dog");
    }
     
     
    
}
