package student_alexander_fateev.lesson5.level_2.task13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RandomArraySum {
    public static void main(String[] args) {
        int [] numbers = new int[3];

        for (int i=0; i<=2; i++) {
            numbers[i] = (int) (Math.random()*100);
        }

        int sum = numbers[0] + numbers[1] + numbers[2];
        System.out.println("Sum = " + sum);
    }
}
