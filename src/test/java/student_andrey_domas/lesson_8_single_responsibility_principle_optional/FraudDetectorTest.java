package student_andrey_domas.lesson_8_single_responsibility_principle_optional;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import student_andrey_domas.lesson_8_single_responsibility_principle_optional.*;

public class FraudDetectorTest {

    private FraudDetector fd;
    private FraudDetectionResult notFraudDetectionResult;

    @Before
    public void setup() {
        FraudRule[] rules = {
                new FraudRule1("Pokemon"),
                new FraudRule2("ge 1000000"),
                new FraudRule3("Sidney"),
                new FraudRule4("Jamaica"),
                new FraudRule5("Germany & ge 1000"),
        };
        fd = new FraudDetector(rules);

        notFraudDetectionResult = new FraudDetectionResult(false, null);
    }

    @Test
    public void fraudPokemon() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction t = new Transaction(trader, 10);
        FraudDetectionResult fdr = new FraudDetectionResult(true, "Pokemon");
        assertEquals(fdr, fd.isFraud(t));
    }

    @Test
    public void fraudNotPokemon() {
        Trader trader = new Trader("Putin", "Moscow", "Russia");
        Transaction t = new Transaction(trader, 10);
        assertEquals(notFraudDetectionResult, fd.isFraud(t));
    }

    @Test
    public void fraud1000000() {
        Trader trader = new Trader("X", "Y", "Z");
        for (int i = 0; i < 2; i++) {
            Transaction t = new Transaction(trader, 1000000 + i);
            FraudDetectionResult fdr = new FraudDetectionResult(true, "ge 1000000");
            assertEquals(fdr, fd.isFraud(t));
        }
    }

    @Test
    public void fraudNot1000000() {
        Trader trader = new Trader("X", "Y", "Z");
        for (int i = 1; i < 2; i++) {
            Transaction t = new Transaction(trader, 1000000 - i);
            assertEquals(notFraudDetectionResult, fd.isFraud(t));
        }
    }

    @Test
    public void fraudSidney() {
        Trader trader = new Trader("Putin", "Sidney", "Australia");
        Transaction t = new Transaction(trader, 10);
        FraudDetectionResult fdr = new FraudDetectionResult(true, "Sidney");
        assertEquals(fdr, fd.isFraud(t));
    }

    @Test
    public void fraudJamaica() {
        Trader trader = new Trader("XXX", "Kingston", "Jamaica");
        Transaction t = new Transaction(trader, 10);
        FraudDetectionResult fdr = new FraudDetectionResult(true, "Jamaica");
        assertEquals(fdr, fd.isFraud(t));
    }

    @Test
    public void fraudGermany1000() {
        Trader trader = new Trader("XXX", "Berlin", "Germany");
        for (int i = 0; i < 2; i++) {
            Transaction t = new Transaction(trader, 1000 + i);
            FraudDetectionResult fdr = new FraudDetectionResult(true, "Germany & ge 1000");
            assertEquals(fdr, fd.isFraud(t));
        }
    }

    @Test
    public void fraudNotGermany1000() {
        Trader trader = new Trader("XXX", "Berlin", "Germany");
        for (int i = 1; i < 2; i++) {
            Transaction t = new Transaction(trader, 1000 - i);
            assertEquals(notFraudDetectionResult, fd.isFraud(t));
        }
    }
}
