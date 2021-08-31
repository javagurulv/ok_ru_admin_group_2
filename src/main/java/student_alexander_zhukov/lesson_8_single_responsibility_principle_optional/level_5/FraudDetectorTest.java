package student_alexander_zhukov.lesson_8_single_responsibility_principle_optional.level_5;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();

        FraudRule1 rule1 = new FraudRule1("rule1");
        FraudRule2 rule2 = new FraudRule2("rule2");
        FraudRule3 rule3 = new FraudRule3("rule3");
        FraudRule4 rule4 = new FraudRule4("rule4");
        FraudRule5 rule5 = new FraudRule5("rule5");

        FraudRule[] rules = {rule1, rule2, rule3, rule4, rule5};

        Trader pokemon = new Trader("Pokemon", "Japan", "" );
        Trader anton = new Trader("Anton", "Moscow", "");
        Trader ivan = new Trader("Ivan", "Moscow", "");
        Trader egor = new Trader("Egor", "Сидней", "");
        Trader john = new Trader("John", "", "Ямайка");
        Trader hans = new Trader("Hans", "", "Германия");
        Trader gunter = new Trader("Gunter", "", "Германия");

        Transaction pokemonTransaction = new Transaction(pokemon, 100);
        Transaction antonTransaction = new Transaction(anton, 500);
        Transaction ivanTransaction = new Transaction(ivan, 50000000);
        Transaction egorTransaction = new Transaction(egor, 200);
        Transaction johnTransaction = new Transaction(john, 700);
        Transaction hansTransaction = new Transaction(hans, 2000);
        Transaction gunterTransaction = new Transaction(gunter, 250);

        test.isFraudTest(rules, pokemonTransaction, true);
        test.isFraudTest(rules, antonTransaction, false);
        test.isFraudTest(rules, ivanTransaction, true);
        test.isFraudTest(rules, egorTransaction, true);
        test.isFraudTest(rules, johnTransaction, true);
        test.isFraudTest(rules, hansTransaction, true);
        test.isFraudTest(rules, gunterTransaction, false);
    }

    public void isFraudTest(FraudRule[] rules, Transaction t, boolean answer) {
        FraudDetector testFraud = new FraudDetector(rules);
        checkResults(testFraud.isFraud(rules, t) == answer, "isFraudTest");
    }

    public void checkResults(boolean result, String name) {
        if (result) {
            System.out.println("Test " + name + " - OK");
        } else {
            System.out.println("Test " + name + " - FAIL");
        }
    }
}
