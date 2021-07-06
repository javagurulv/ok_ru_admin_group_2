package student_alexander_zhukov.lesson_6.level_1;

class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.isEvenTest(6, true);
        test.isEvenTest(13, false);
        test.isEvenTest(98, true);
    }

    public void isEvenTest(int number, boolean answer) {
        NumberUtils myNumUtil = new NumberUtils();
        if (myNumUtil.isEven(number) == answer) {
            System.out.println("Test isEven " + number + " - OK");
        }
        else {
            System.out.println("Test isEven " + number + " - FAIL");
        }
    }

}
