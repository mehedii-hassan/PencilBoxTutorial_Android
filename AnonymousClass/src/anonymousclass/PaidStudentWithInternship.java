 
package anonymousclass;

/**
 *
 * @author MH
 */
public class PaidStudentWithInternship extends PaidStudent{
    private  int duration;

    public PaidStudentWithInternship(double courseFee, String name, int id, String phone, boolean isOffLine,int duration) {
        super(courseFee, name, id, phone, isOffLine);
        this.duration=duration;
    }

    @Override
    public void startSession() {
        System.out.println("Starting a paid with intern session.......");
    }
    
}
