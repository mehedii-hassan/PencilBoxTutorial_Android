 
package callbackinterface;

/**
 *
 * @author MH
 */
public class TestClass {
    public static void main(String[] args) {
        Caller caller = new Caller();
        caller.giveTasktoCallee();
        caller.callerOwnTask();
    }
     
    
}
