 
package abstraction;

/**
 *
 * @author MH
 */
public abstract class Student {
    private String name;
    private int id;
    private String phone;
    private boolean isOffLine;

    public Student(String name, int id, String phone, boolean isOffLine) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.isOffLine = isOffLine;
    }
    
    abstract public void startSession();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isIsOffLine() {
        return isOffLine;
    }

    public void setIsOffLine(boolean isOffLine) {
        this.isOffLine = isOffLine;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", phone=" + phone + ", isOffLine=" + isOffLine + '}';
    }
    
    
    
    
}
