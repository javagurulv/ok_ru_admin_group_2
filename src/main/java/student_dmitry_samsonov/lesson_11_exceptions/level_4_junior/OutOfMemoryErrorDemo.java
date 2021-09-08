package student_dmitry_samsonov.lesson_11_exceptions.level_4_junior;

class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        Integer[] integers = new Integer[Integer.MAX_VALUE-2];
        for (int i: integers) {
            integers[i] = Integer.MAX_VALUE;
        }
    }
}
