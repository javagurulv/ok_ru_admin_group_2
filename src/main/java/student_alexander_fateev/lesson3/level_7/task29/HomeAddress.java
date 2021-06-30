package student_alexander_fateev.lesson3.level_7.task29;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class HomeAddress {
    String streetName;
    int homeNumber;
    int flatNumber;

    HomeAddress(String streetName, int homeNumber, int flatNumber) {
        this.streetName = streetName;
        this.homeNumber = homeNumber;
        this.flatNumber = flatNumber;
    }

    void printAddress() {
        System.out.println("Street: " + this.streetName);
        System.out.println("Home number:" + this.homeNumber);
        System.out.println("Flat number:" + this.flatNumber);
    }
}
