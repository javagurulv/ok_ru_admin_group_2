package student_andrey_domas.lesson_8_single_responsibility_principle_optional;

import java.util.Objects;

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public boolean isFraud() {
        return fraud;
    }

    public String getRuleName() {
        return ruleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FraudDetectionResult that = (FraudDetectionResult) o;
        return fraud == that.fraud && Objects.equals(ruleName, that.ruleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fraud, ruleName);
    }
}