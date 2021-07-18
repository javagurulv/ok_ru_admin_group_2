package student_alexander_zhukov.lesson_6.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WhileLoopContinue {

    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            if (i == 5) {
                i = i + 2;
                System.out.println("pass 6");
                continue;
            }
            i++;
        }
    }
}
