package student_sergo_kurbanov.lesson_3.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Employee {
    private int id;
    private String hired;
    private String fired;
    private boolean active;
    private String contract;
    private int salary;

    Employee(int id, String hireDate, String contract, int salary) {
        this.id = id;
        this.hired = hireDate;
        this.contract = contract;
        this.salary = salary;
        fired = "";
        active = true;
    }

    void changeSalary(int salary) {
        setSalary(salary);
    }

    private void setSalary(int newSalary) {
        this.salary = newSalary;
    }

    void fire(String fireDate) {
        this.fired = fireDate;
        this.active = false;
    }

    void getInfo() {
        System.out.printf("\nEmployee ID: %d, Active: %b, Salary: %d$", id, active, salary);
        System.out.printf("\nContract: №%s, Hired: %s, Fired: %s", contract, hired, fired);
    }
}
