package pr15;

public class EmployeeContoller<T> {
    private Employee<T> people;
    private EmployeeView<T> view;

    public EmployeeContoller(Employee<T> people, EmployeeView<T> view) {
        this.people = people;
        this.view = view;
    }

    private void setPeople(Employee<T> people) {
        this.people = people;
    }

    private void setView(EmployeeView<T> view) {
        this.view = view;
    }

    public String getEmpName() {
        return people.getName();
    }

    public T getEmpVal() {
        return people.getEmp_key();
    }

    public void setEmpName(String name) {
        people.setName(name);
    }

    public void setEmpVal(T val) {
        people.setEmp_key(val);
    }

    private Employee<T> getPeople() {
        return people;
    }

    public void updateView() {
        view.setName(getPeople().getName());
        view.setEmp_key(getPeople().getEmp_key());
    }
}
