package student_alexander_fateev.lesson3.level_7.task29;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class HomeAddressDemo {
    public static void main(String[] args) {
        HomeAddress myAddr = new HomeAddress("Lenina", 2, 67);
        myAddr.printAddress();
    }
}