package student_alexey_krenev.lesson_3.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Laptop {
    String deviceName;
    int ramTotal;
    int yearOfIssue;

    public Laptop(String deviceName, int ramTotal, int yearOfIssue) {
        this.deviceName = deviceName;
        this.ramTotal = ramTotal;
        this.yearOfIssue = yearOfIssue;
    }
}
