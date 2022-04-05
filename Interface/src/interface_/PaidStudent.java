package interface_;

/**
 *
 * @author MH
 */
public abstract class PaidStudent extends Student implements Allowance{

    private double courseFee;

    public PaidStudent(double courseFee, String name, int id, String phone, boolean isOffLine) {
        super(name, id, phone, isOffLine);
        this.courseFee = courseFee;
    }

//    @Override
//    public void startSession() {
//        System.out.println("Starting a Paid session.....");
//    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    @Override
    public String toString() {
        return "PaidStudent{" + "courseFee=" + courseFee + '}';
    }

}
