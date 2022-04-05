package association;

import java.util.ArrayList;
import java.util.Scanner;
import models.Course;
import models.Department;
import models.Student;

/**
 *
 * @author MH
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student s1 = new Student("Mehedi", 123456789, "01759732706");
        Student s2 = new Student("dkjsfhk", 87657828, "01759732706");

        s1.setDepartment(new Department("CSE", "CS1"));

        s1.setCourseList(new ArrayList<Course>());
        s1.getCourseList().add(new Course("Algorithm", 3.0));
        s1.getCourseList().add(new Course("Java", 3.0));

        System.out.println(s1.getDepartment());
        System.out.println(s1.getDepartment().getDepartmentName());
        System.out.println(s1.getCourseList().get(0).getCourseName());
        System.out.println(s1.getCourseList().get(1));

        for (Course c : s1.getCourseList()) {
            //System.out.println(c);
            System.out.println(c.getCourseName());
        }

        System.out.println("How many Students?");
        int noOfSt = scanner.nextInt();
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 1; i <= noOfSt; i++) {
            System.out.println("Student" + i + "info");
            System.out.println("-----------------");
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.print("Enter NID: ");
            long nid = scanner.nextLong();
            System.out.print("Enter Phone: ");
            String pnone = scanner.next();

            Student student = new Student(name, nid, pnone);

            System.err.println("Department");
            System.out.println("-------------------");
            System.out.println("1.CSE");
            System.out.println("2.BBA");
            System.out.println("3.EEE");
            System.out.println("Select One:");
            
            int selection = scanner.nextInt();
            
            switch(selection){
            case 1:
                student.setDepartment(CourseGenerator.departmentList.get(0));
                student.setCourseList(CourseGenerator.cseCourseList);
                break;
            case 2:
                student.setDepartment(CourseGenerator.departmentList.get(1));
                student.setCourseList(CourseGenerator.bbaCourseList);
                break;
            case 3:
                student.setDepartment(CourseGenerator.departmentList.get(2));
                student.setCourseList(CourseGenerator.eeeCourseList);
                break;
            }
            students.add(student);

        }
        System.out.println("-------------------------");
        System.out.println("Total Students");
        for (Student student : students) {
            System.out.println(student);
        }

    }

}
