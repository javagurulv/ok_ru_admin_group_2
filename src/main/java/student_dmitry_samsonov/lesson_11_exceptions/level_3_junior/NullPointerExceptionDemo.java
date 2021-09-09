package student_dmitry_samsonov.lesson_11_exceptions.level_3_junior;

class NullPointerExceptionDemo {
    public static void main(String[] args) {
        int[] i = null;
        System.out.println(i[2]);
        // Обращание к объекту, ссылающемуся на null
    }
}
