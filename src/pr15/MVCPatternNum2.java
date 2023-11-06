package pr15;

public class MVCPatternNum2 {
    public static void main(String[] args) {
        Employee<Integer> obj = setPattern();
        EmployeeView<Integer> view = new EmployeeView<>();
        EmployeeContoller<Integer> controller = new EmployeeContoller<>(obj, view);
        controller.updateView();
        view.printEmpDetails();
        System.out.println("After update");
        obj.setName("Test2");
        obj.setEmp_key(2);
        controller.updateView();
        view.printEmpDetails();
    }

    private static Employee<Integer> setPattern() {
        Employee<Integer> obj = new Employee<>();
        obj.setName("Test1");
        obj.setEmp_key(1);
        return obj;
    }
}
