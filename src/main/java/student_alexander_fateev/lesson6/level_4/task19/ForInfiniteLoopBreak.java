package student_alexander_fateev.lesson6.level_4.task19;

class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        for (int i=0; i<1; i--) {
            System.out.println(i);
            if (i==-100) {
                break;
            }
        }
    }
}
