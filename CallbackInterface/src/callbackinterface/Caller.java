package callbackinterface;

/**
 *
 * @author MH
 */
public class Caller implements CallbackInterface {

    Callee callee = new Callee(this);

    @Override
    public void notifyCaller() {
        System.out.println("Thank you callee for doing the task...");
    }

    public void giveTasktoCallee() {
        callee.doWorkInBackground();
    }
    public void callerOwnTask(){
        for (int i = 0; i < 200; i++) {
            System.out.println("Caller is doing own task "+i);
        }
    }

}
