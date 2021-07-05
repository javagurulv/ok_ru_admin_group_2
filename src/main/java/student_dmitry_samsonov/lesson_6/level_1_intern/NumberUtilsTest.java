package student_dmitry_samsonov.lesson_6.level_1_intern;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtils numberUtils = new NumberUtils();
        if (numberUtils.isEven(6) == true){
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
    }
}
