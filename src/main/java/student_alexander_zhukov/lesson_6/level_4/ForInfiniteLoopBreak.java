package student_alexander_zhukov.lesson_6.level_4;

class ForInfiniteLoopBreak {

    public static void main(String[] args) {
        int j = 0;
        for (int i = 1; i < 10; i = 1) {
            System.out.println(j);
            if (j == 10) {
                break;
            }
            j++;
        }
    }
}
