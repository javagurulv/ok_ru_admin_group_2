package student_dmitry_samsonov.lesson_8_single_responsibility_principle_optional.level_1_intern;

class FraudRule1Test extends FraudRuleTest {
    void runTests() {
        FraudRule1Test fraudRuleTest = new FraudRule1Test();
        FraudRule1 fraudRule = new FraudRule1();

        fraudRuleTest.testRule(fraudRule, "Pokemon", "City", "Country", 1, true);
        fraudRuleTest.testRule(fraudRule, "Name", "City", "Country", 1, false);
    }
}
