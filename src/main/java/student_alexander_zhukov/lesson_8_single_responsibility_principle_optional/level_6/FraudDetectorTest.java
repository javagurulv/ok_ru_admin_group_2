package student_alexander_zhukov.lesson_8_single_responsibility_principle_optional.level_6;

class FraudDetectorDemo {
    public static void main(String[] args) {
        FraudDetectorDemo demo = new FraudDetectorDemo();

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

        demo.isFraudTest(rules, pokemonTransaction);
        demo.isFraudTest(rules, antonTransaction);
        demo.isFraudTest(rules, ivanTransaction);
        demo.isFraudTest(rules, egorTransaction);
        demo.isFraudTest(rules, johnTransaction);
        demo.isFraudTest(rules, hansTransaction);
        demo.isFraudTest(rules, gunterTransaction);
    }

    public void isFraudTest(FraudRule[] rules, Transaction t) {
        FraudDetector testFraud = new FraudDetector(rules);
        testFraud.isFraud(t);
    }

}
