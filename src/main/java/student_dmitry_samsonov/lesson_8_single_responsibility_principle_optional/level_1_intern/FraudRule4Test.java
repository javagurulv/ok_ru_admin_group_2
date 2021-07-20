package student_dmitry_samsonov.lesson_8_single_responsibility_principle_optional.level_1_intern;

class FraudRule4Test extends FraudRuleTest {
    void runTests() {
        FraudRule4Test fraudRuleTest = new FraudRule4Test();
        FraudRule4 fraudRule = new FraudRule4();

        fraudRuleTest.testRule(fraudRule, "Name", "City", "Jamaica", 1, true);
        fraudRuleTest.testRule(fraudRule, "Name", "City", "Country", 1, false);
    }
}
