package pr15;

public class EmployeeView<T> extends Employee<T> {
    public void printEmpDetails() {
        System.out.println("Emp:");
        System.out.println("Name: " + getName());
        System.out.println("Value: " + getEmp_key());
    }
}
