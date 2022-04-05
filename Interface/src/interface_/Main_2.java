package interface_;

public class Main_2 {

    public static void main(String[] args) {

        //PaidStudent paidStudent = new PaidStudent(5000, "xyz", 951, "75685365", true);
//        PaidStudent paidStudent = new PaidStudentWithInternship(5000, "xyz", 951, "75685365", true, 6);
//        SeipStudent seipStudent = new SeipStudent("abc", 851, "48755452", false);
//
//        Student[] students = {paidStudent, seipStudent};
//
//        callStartSession(students);
//
//        TestInterface t1 = new TestImpl();
//        t1.test();

         

    }

//    public static void callStartSession(Student[] students) {
//        for (Student student : students) {
//            student.startSession();
//        }
//    }
    public static void callStartSession(Student[] students) {
        for (Student student : students) {
            if (student instanceof Allowance) {
                //student.startSession();
                ((Allowance) student).giveAllowance();
            }
        }
    }

}
