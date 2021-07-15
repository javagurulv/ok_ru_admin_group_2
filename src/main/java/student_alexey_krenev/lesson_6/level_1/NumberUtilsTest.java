package student_alexey_krenev.lesson_6.level_1;

class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.isEvenTest(6, true);
        test.isEvenTest(1, false);
        test.isEvenTest(3,false);
        test.isEvenTest(4, true);
    }

    public void isEvenTest(int num, boolean answer) {

        NumberUtils myNumUtil = new NumberUtils();

        if (myNumUtil.isEven(num) == answer) {
            System.out.println("Test isEven " + num + " success");
        }

        else {
            System.out.println("Test isEven " + num + " error");
        }
    }

}