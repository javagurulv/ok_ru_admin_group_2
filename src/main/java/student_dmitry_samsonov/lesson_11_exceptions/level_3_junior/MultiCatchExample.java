package student_dmitry_samsonov.lesson_11_exceptions.level_3_junior;

class MultiCatchExample {
    public static void main(String[] args) {
        //  Более специфичный exception должен следовать раньше, чем менее специфичный, т.к. обработка
        //  останавливается на первом совпадении.
        try {
        } catch (ArithmeticException a) {
        } catch (Exception e) {
        }
    }
}
