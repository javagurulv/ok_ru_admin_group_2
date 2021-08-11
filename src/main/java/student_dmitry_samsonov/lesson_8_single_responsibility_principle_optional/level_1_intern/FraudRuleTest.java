package student_dmitry_samsonov.lesson_8_single_responsibility_principle_optional.level_1_intern;

class FraudRuleTest {
    public void printTestResult(String name, boolean result) {
        String reportName = name + " test = ";
        String reportResult;
        if (result) {
            reportResult = "OK";
        } else {
            reportResult = "FAIL";
        }
        System.out.println(reportName + reportResult);
    }

    public void testRule(FraudRule rule, String fullName, String city, String country, int amount, boolean expectedResult) {
        Trader trader = new Trader.Builder(fullName)
                .withCity(city)
                .withCountry(country)
                .build();
        Transaction transaction = new Transaction(trader, amount);
        printTestResult(rule.getRuleName(), rule.isFraud(transaction).isFraud() == expectedResult);
    }
}
