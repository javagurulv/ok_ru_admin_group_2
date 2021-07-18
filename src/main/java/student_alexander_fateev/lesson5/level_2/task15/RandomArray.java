package student_alexander_fateev.lesson5.level_2.task15;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RandomArray {
    public static void main(String[] args) {
        int [] numbers = new int[3];

        for (int i=0; i<=2; i++) {
            numbers[i] = (int) (Math.random()*100);
            System.out.println("Element " + i + " = " + numbers[i]);
        }

        for (int i=0; i<=2; i++) {
            numbers[i] = numbers[i] + 2;
            System.out.println("Element " + i + " = " + numbers[i]);
        }
    }
}
