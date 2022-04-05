 
package models;

/**
 *
 * @author MH
 */
public class Department {
    private String departmentName;
    private String departmentBuilding;

    public Department(String departmentName, String departmentBuilding) {
        this.departmentName = departmentName;
        this.departmentBuilding = departmentBuilding;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentBuilding() {
        return departmentBuilding;
    }

    public void setDepartmentBuilding(String departmentBuilding) {
        this.departmentBuilding = departmentBuilding;
    }

    @Override
    public String toString() {
        return "Department{" + "departmentName=" + departmentName + ", departmentBuilding=" + departmentBuilding + '}';
    }
    
    
    
}
