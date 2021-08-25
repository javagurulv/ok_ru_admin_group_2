package student_alexander_fateev.lesson6.level_4.task19;

class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        int counter = 0;

        while (true) {
            System.out.println(counter);
            counter++;
            if (counter == 100) {
                break;
            }
        }
    }
}
