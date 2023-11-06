package pr15;

public class Employee<T> {
    private String name;
    private T emp_key;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getEmp_key() {
        return emp_key;
    }

    public void setEmp_key(T emp_key) {
        this.emp_key = emp_key;
    }
}
