package lamdaandexception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LamdaAndException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int a = 10;
        int b = 0;

        try {
            int result = division(a, b);
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());        }

    }

    public static int division(int x, int y) throws Exception {
        return x / y;
    }

}
