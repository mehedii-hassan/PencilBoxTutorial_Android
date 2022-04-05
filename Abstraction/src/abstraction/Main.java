 
package abstraction;
 
 

public class Main {
 
    public static void main(String[] args) {
        // TODO code application logic here
        Dog d = new Dog(10);
        Cat c = new Cat(5);
        
        //PaidStudent paidStudent = new PaidStudent(5000, "xyz", 951, "75685365", true);
        PaidStudent paidStudent = new PaidStudentWithInternship(5000, "xyz", 951, "75685365", true,6);
        SeipStudent seipStudent = new SeipStudent("abc", 851, "48755452", false);
        
        
        Animal[] animals = {d,c};
        Student[] students = {paidStudent,seipStudent};
        
    
        callStartSession(students);
        callMove(animals);
         
        
        
    }
    
    public static  void callStartSession(Student[] students){
        for (Student student : students) {
            student.startSession();
        }
    } 
    
    
    public static  void callMove(Animal[] animals){
        for (Animal a : animals) {
            a.move();
        }
    } 
    
    
    
    
    
}
