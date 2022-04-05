 
package abstraction;

/**
 *
 * @author MH
 */
public class Cat extends Animal{

    public Cat(int longivity) {
        super(longivity);
    }
    
    public void mew(){
        System.out.println("Mew Mew........");
    }

    @Override
    public void move() {
        //super.move();
        System.out.println("moving cat");
    }
    
   
}
