package student_ilya_schanikov.lesson_4.level_7;

class LeapYear {
    int year;

    public boolean detect(int newYear) {
        this.year = newYear;
        if ((this.year % 400) == 0) {
            return true;
        } else if ((this.year % 100) == 0) {
            return false;
        } else if ((this.year % 4) == 0) {
            return true;
        } else {
            return false;
        }
    }
}

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest ly1 = new LeapYearTest();
        ly1.isNotLeapSimple();
        ly1.isLeapSimple();
        ly1.isNotLeapCentury();
        ly1.isLeapCentury();

    }

    public void isNotLeapSimple() {
        int newYear = 2021;
        boolean expectedResult = false;
        LeapYear detector = new LeapYear();
        boolean realResult = detector.detect(newYear);
        if (realResult == expectedResult) {
            System.out.println("Not leap simple test = PASS");
        } else {
            System.out.println("Not leap simple test = FAIL");
        }
    }

    public void isLeapSimple() {
        int newYear = 2020;
        boolean expectedResult = true;
        LeapYear detector = new LeapYear();
        boolean realResult = detector.detect(newYear);
        if (realResult == expectedResult) {
            System.out.println("Is Leap simple test = PASS");
        } else {
            System.out.println("IS Leap simple test = FAIL");
        }
    }

    public void isNotLeapCentury() {
        int newYear = 1900;
        boolean expectedResult = false;
        LeapYear detector = new LeapYear();
        boolean realResult = detector.detect(newYear);
        if (realResult == expectedResult) {
            System.out.println("Not leap century test = PASS");
        } else {
            System.out.println("Not leap century test = FAIL");
        }
    }

    public void isLeapCentury() {
        int newYear = 2000;
        boolean expectedResult = true;
        LeapYear detector = new LeapYear();
        boolean realResult = detector.detect(newYear);
        if (realResult == expectedResult) {
            System.out.println("Leap century test = PASS");
        } else {
            System.out.println("Leap century test = FAIL");
        }
    }
}