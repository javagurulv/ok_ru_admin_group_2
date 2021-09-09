package student_dmitry_samsonov.lesson_11_exceptions.level_4_junior;

class StackOverflowErrorDemo {
    public static void main(String[] args) {
        recursion();
    }
    public static void recursion(){
        while (true) {
            recursion();
        }
    }
}
