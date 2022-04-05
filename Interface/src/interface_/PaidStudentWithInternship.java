 
package interface_;

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
    
    //extra feature using interface-------------
    @Override
    public void giveAllowance() {
        System.out.println("Can take Tea and Snacks at break time");
    }
    
}
