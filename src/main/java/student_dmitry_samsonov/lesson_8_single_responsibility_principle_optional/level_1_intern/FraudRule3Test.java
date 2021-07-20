package student_dmitry_samsonov.lesson_8_single_responsibility_principle_optional.level_1_intern;

class FraudRule3Test extends FraudRuleTest {
    void runTests() {
        FraudRule3Test fraudRuleTest = new FraudRule3Test();
        FraudRule3 fraudRule = new FraudRule3();

        fraudRuleTest.testRule(fraudRule, "Name", "Sidney", "Country", 1, true);
        fraudRuleTest.testRule(fraudRule, "Name", "City", "Country", 1, false);
    }
}
