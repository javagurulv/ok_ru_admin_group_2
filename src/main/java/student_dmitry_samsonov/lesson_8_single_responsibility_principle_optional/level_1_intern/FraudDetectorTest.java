package student_dmitry_samsonov.lesson_8_single_responsibility_principle_optional.level_1_intern;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudRule1Test fraudRule1Test = new FraudRule1Test();
        fraudRule1Test.runTests();
        FraudRule2Test fraudRule2Test = new FraudRule2Test();
        fraudRule2Test.runTests();
        FraudRule3Test fraudRule3Test = new FraudRule3Test();
        fraudRule3Test.runTests();
        FraudRule4Test fraudRule4Test = new FraudRule4Test();
        fraudRule4Test.runTests();
        FraudRule5Test fraudRule5Test = new FraudRule5Test();
        fraudRule5Test.runTests();
    }
}
