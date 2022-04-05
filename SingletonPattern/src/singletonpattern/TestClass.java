 
package singletonpattern;

/**
 *
 * @author MH
 */
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MySingletonClass ob = MySingletonClass.getInstance();
        MySingletonClass ob1 = MySingletonClass.getInstance();
        MySingletonClass ob2 = MySingletonClass.getInstance();
        MySingletonClass ob3 = MySingletonClass.getInstance();
        
        System.out.println(ob);
        System.out.println(ob1);
        System.out.println(ob2);
        System.out.println(ob3);
    }
    
}
