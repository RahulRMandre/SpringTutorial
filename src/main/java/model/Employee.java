package model;

public class Employee {
    int eId;
    String eName;
    int eSalary;
    Address address;

    public Employee(int eId, String eName, int eSalary) {
        this.eId = eId;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    public Employee(Address address) {
    	this.address=address;
    }

    public int getEId() {
        return eId;
    }

    public void setEId(int eiId) {
        this.eId = eiId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteSalary() {
        return eSalary;
    }

    public void seteSalary(int eSalary) {
        this.eSalary = eSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eiId=" + eId +
                ", eName='" + eName + '\'' +
                ", eSalary=" + eSalary +
                ", address=" + address +
                '}';
    }
    
    public void init() {
    	System.out.println("init");
    }
    
    public void destroy() {
    	System.out.println("destroy");
    }

    
    
}
