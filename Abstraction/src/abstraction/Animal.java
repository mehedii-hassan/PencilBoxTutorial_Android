 
package abstraction;

/**
 *
 * @author MH
 */
public class Animal {
    private  int longivity;


    public Animal(int longivity) {
        this.longivity = longivity;
    }
    
    
    
    public void move(){
        System.out.println("Moving on....");
    }

    public int getLongivity() {
        return longivity;
    }

    public void setLongivity(int longivity) {
        this.longivity = longivity;
    }

    @Override
    public String toString() {
        return "Animal{" + "longivity=" + longivity + '}';
    }
    
    
    
    
}
