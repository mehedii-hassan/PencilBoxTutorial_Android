package callbackinterface;

/**
 *
 * @author MH
 */
public class Callee {

    private CallbackInterface callbackInterface;

    public Callee(CallbackInterface callbackInterface) {
        this.callbackInterface = callbackInterface;
    }

    public void doWorkInBackground() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("The callee has started");
                for (int i = 0; i < 100; i++) {
                    System.out.println("The callee is doing the task...." + i);

                }

                System.out.println("The callee has finished the work!");
                callbackInterface.notifyCaller();
            }
        });

        thread.start();

    }

}
