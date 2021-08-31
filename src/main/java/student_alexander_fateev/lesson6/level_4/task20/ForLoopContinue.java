package student_alexander_fateev.lesson6.level_4.task20;

class ForLoopContinue {
    public static void main(String[] args) {
        for (int i=0; i<20; i++) {
            if (i ==5) {
                System.out.println("Skipping loop cycle");
                continue;
            }
            System.out.println(i);
        }
    }

}
