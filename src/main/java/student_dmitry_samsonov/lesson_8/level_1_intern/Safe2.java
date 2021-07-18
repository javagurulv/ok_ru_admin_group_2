package student_dmitry_samsonov.lesson_8.level_1_intern;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Safe2 {
    private int password;
    private double sum;
    Safe2(int password, int sum) {
        this.password = password;
        this.sum = sum;
    }
    boolean getMoney(int password, double sum){
        if (this.password == password && this.sum >= sum) {
            this.sum -= sum;
            return true;
        }
        return false;
    }
    boolean putMoney(int password, double sum){
        if (this.password == password) {
            this.sum += sum;
            return true;
        }
        return false;
    }
}
