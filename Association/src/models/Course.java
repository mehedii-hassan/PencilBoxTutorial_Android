 
package models;

/**
 *
 * @author MH
 */
public class Course {
    
    private String courseName;
    private double courseCredit;

    public Course(String courseName, double courseCredit) {
        this.courseName = courseName;
        this.courseCredit = courseCredit;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(double courseCredit) {
        this.courseCredit = courseCredit;
    }

    @Override
    public String toString() {
        return "Course{" + "courseName=" + courseName + ", courseCredit=" + courseCredit + '}';
    }
    
    
}
