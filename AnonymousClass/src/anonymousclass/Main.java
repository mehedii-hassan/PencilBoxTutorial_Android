package anonymousclass;

public class Main {

    public static void main(String[] args) {

        //PaidStudent paidStudent = new PaidStudent(5000, "xyz", 951, "75685365", true);
        PaidStudent paidStudent = new PaidStudentWithInternship(5000, "xyz", 951, "75685365", true, 6);
        SeipStudent seipStudent = new SeipStudent("abc", 851, "48755452", false);

        Student[] students = {paidStudent, seipStudent};

        callStartSession(students);
        //new StudentImpl().startSession();
        //anonymous class--------------------------
        Student s = new Student() {
            @Override
            public void startSession() {
                System.out.println("Default session.....");
            }
        };
        
        s.startSession();
       

    }

    public static void callStartSession(Student[] students) {
        for (Student student : students) {
            student.startSession();
        }
    }

}



//class StudentImpl extends  Student{
//
//    @Override
//    public void startSession() {
//         System.out.println("Default implementation......");
//    }
//}
