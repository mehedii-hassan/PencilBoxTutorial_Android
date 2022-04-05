 
package inheritance;
 
import java.util.ArrayList;
import java.util.List;

public class Main {
 
    public static void main(String[] args) {
        // TODO code application logic here
        Dog d = new Dog(10);
        Cat c = new Cat(5);
        d.bark();
        c.mew();
//        System.err.println(c.getLongivity());
//        System.err.println(c.getLongivity());
//        d.move();
//        c.move();
//        
//        callMove(c);
//        callMove(d);
//          
        Animal[] animals = {d,c};
        
        List<Animal> list = new ArrayList<>();
        list.add(c);
        list.add(d);
        
        
        for (Animal animal : animals) {
            animal.move();
        }
        for (Animal animal : list) {
            animal.move();
        }
        
        
        callMove(animals);
        
        
    }
    
    public static void callMove(Animal animal){
        animal.move();
    }
    //2nd way
    public static void callMove(Animal[] animals){
        //animal.move();
        System.out.println("Another way:");
        for (Animal animal : animals) {
            animal.move();
        }
    }
    
}
