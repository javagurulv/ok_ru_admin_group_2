package student_dmitry_samsonov.lesson_8_single_responsibility_principle_optional.level_1_intern;

class FraudRule5Test extends FraudRuleTest {
    void runTests() {
        FraudRule5Test fraudRuleTest = new FraudRule5Test();
        FraudRule5 fraudRule = new FraudRule5();

        fraudRuleTest.testRule(fraudRule, "Name", "City", "Germany", 1001, true);
        fraudRuleTest.testRule(fraudRule, "Name", "City", "Germany", 1, false);
    }
}
