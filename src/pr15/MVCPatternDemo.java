package pr15;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveCourseFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        view.printStudentsDetails();
        System.out.println("After update");
        controller.setStudentName("StudNew");
        controller.setStudentRollNo("02");
        controller.updateView();
        view.printStudentsDetails();
    }

    private static Student retriveCourseFromDatabase() {
        Student people = new Student();
        people.setName("StudOld");
        people.setRollNo("01");
        return people;
    }
}
