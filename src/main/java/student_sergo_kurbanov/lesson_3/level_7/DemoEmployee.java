package student_sergo_kurbanov.lesson_3.level_7;

public class DemoEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(493, "15.04.2020", "8765/39", 250);
        emp.getInfo();
        emp.changeSalary(300);
        emp.fire("20.06.2021");
        emp.getInfo();
    }
}
