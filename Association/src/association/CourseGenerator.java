package association;

import java.util.ArrayList;
import models.Course;
import models.Department;

/**
 *
 * @author MH
 */
public class CourseGenerator {

    static ArrayList<Course> cseCourseList;
    static ArrayList<Course> bbaCourseList;
    static ArrayList<Course> eeeCourseList;
    static ArrayList<Department> departmentList;

    //initialize static members----------
    static {
        cseCourseList = new ArrayList<>();
        eeeCourseList = new ArrayList<>();
        bbaCourseList = new ArrayList<>();
        departmentList = new ArrayList<>();

        departmentList.add(new Department("CSE", "NUB1"));
        departmentList.add(new Department("BBA", "NUB2"));
        departmentList.add(new Department("EEE", "NUB3"));

        cseCourseList.add(new Course("Computer Fundamental", 3.0));
        cseCourseList.add(new Course("Algorithm", 3.0));
        cseCourseList.add(new Course("Java", 3.0));

        cseCourseList.add(new Course("Marketing", 3.0));
        cseCourseList.add(new Course("Finance", 1.5));
        cseCourseList.add(new Course("Management", 3.0));

        cseCourseList.add(new Course("EMF", 3.0));
        cseCourseList.add(new Course("Control System", 3.0));
        cseCourseList.add(new Course("Microcontroller", 3.0));

    }

}
