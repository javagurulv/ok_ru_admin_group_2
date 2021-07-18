package student_alexander_zhukov.lesson_6.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ForLoopContinue {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                System.out.println("pass 5");
                continue;
            }
            System.out.println(i);
        }
    }
}
