package student_alexander_zhukov.lesson_8_single_responsibility_principle_optional.level_1;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
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

        test.isFraudTest(pokemonTransaction, true);
        test.isFraudTest(antonTransaction, false);
        test.isFraudTest(ivanTransaction, true);
        test.isFraudTest(egorTransaction, true);
        test.isFraudTest(johnTransaction, true);
        test.isFraudTest(hansTransaction, true);
        test.isFraudTest(gunterTransaction, false);
    }

    public void isFraudTest(Transaction t, boolean answer) {
        FraudDetector testFraud = new FraudDetector();
        checkResults(testFraud.isFraud(t) == answer, "isFraudTest");
    }

    public void checkResults(boolean result, String name) {
        if (result) {
            System.out.println("Test " + name + " - OK");
        } else {
            System.out.println("Test " + name + " - FAIL");
        }
    }
}
