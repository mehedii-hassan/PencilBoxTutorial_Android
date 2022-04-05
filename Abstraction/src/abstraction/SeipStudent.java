 
package abstraction;

/**
 *
 * @author MH
 */
public class SeipStudent extends Student{
    private  double stipend;

    public SeipStudent(String name, int id, String phone, boolean isOffLine) {
        super(name, id, phone, isOffLine);
    }

    @Override
    public void startSession() {
        System.out.println("Starting a SEIP session.....");
    }
    
    

    public double getStipend() {
        return stipend;
    }

    public void setStipend(double stipend) {
        this.stipend = stipend;
    }

    @Override
    public String toString() {
        return "SeipStudent{" + "stippend=" + stipend + '}';
    }
    
    
    
}
