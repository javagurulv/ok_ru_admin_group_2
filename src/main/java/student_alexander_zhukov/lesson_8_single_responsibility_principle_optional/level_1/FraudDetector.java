package student_alexander_zhukov.lesson_8_single_responsibility_principle_optional.level_1;

class FraudDetector {

    boolean isFraud(Transaction t) {
        if (rule1(t) || rule2(t) ||  rule3(t) || rule4(t) || rule5(t)) {
            return true;
        }
        return false;
    }

    boolean rule1(Transaction t) {
        if (t.getTrader().getFullName().equals("Pokemon")) {
            return true;
        }
        return false;
    }

    boolean rule2(Transaction t) {
        if (t.getAmount() > 1000000) {
            return true;
        }
        return false;
    }

    boolean rule3(Transaction t) {
        if (t.getTrader().getCity().equals("Сидней")) {
            return true;
        }
        return false;
    }

    boolean rule4(Transaction t) {
        if (t.getTrader().getCountry().equals("Ямайка")) {
            return true;
        }
        return false;
    }

    boolean rule5(Transaction t) {
        if (t.getTrader().getCountry().equals("Германия") && t.getAmount() > 1000) {
            return true;
        }
        return false;
    }

}
