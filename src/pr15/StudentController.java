package pr15;

public class StudentController {
    protected Student model;
    protected StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void setStudentRollNo(String o) {
        model.setRollNo(o);
    }

    public void updateView() {
        view.setName(getStudentName());
        view.setRollNo(getStudentRollNo());
    }

}
