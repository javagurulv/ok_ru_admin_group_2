package student_alexander_zhukov.lesson_6.level_4;

class WhileInfiniteLoopBreak {

    public static void main(String[] args) {
        int i = 0;
        while (true) {
            System.out.println(i);
            if (i == 10) {
                break;
            }
            i++;
        }
    }
}
