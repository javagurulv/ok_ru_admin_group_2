package student_dmitry_samsonov.lesson_11_exceptions.level_3_junior;

class Main {
    public static void main(String args[]) {
        // 1. Got the Test Exception
        //    Inside finally block
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}