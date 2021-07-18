package student_sergo_kurbanov.lesson_7.level_3;

public abstract class LoanSystem {

    abstract boolean canReceiveLoan(Human human);
}

class RealEstateLoanSystem extends LoanSystem {
    private Human borrower;

    @Override
    boolean canReceiveLoan(Human human) {
        return false;
    }
}

class Human {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}