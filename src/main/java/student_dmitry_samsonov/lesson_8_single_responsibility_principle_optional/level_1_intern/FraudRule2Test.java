package student_dmitry_samsonov.lesson_8_single_responsibility_principle_optional.level_1_intern;

class FraudRule2Test extends FraudRuleTest {
    void runTests() {
        FraudRule2Test fraudRuleTest = new FraudRule2Test();
        FraudRule2 fraudRule = new FraudRule2();

        fraudRuleTest.testRule(fraudRule, "Name", "City", "Country", 1000001, true);
        fraudRuleTest.testRule(fraudRule, "Name", "City", "Country", 1000000, false);
    }
}
