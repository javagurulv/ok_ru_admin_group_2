package student_sergo_kurbanov.lesson_8.level_1;

public class Safe2 {
    private float money;
    private String password;

    public Safe2(float money, String password) {
        this.money = money;
        this.password = password;
    }

    private boolean authenticate(String password) {
        return this.password.equals(password);
    }

    private void haventRights() {
        // TODO something
    }

    public float getMoney(String password) {
        if (!authenticate(password)) {
            haventRights();
            return -1;
        }
        return money;
    }

    public void putMoney(float money, String password) {
        if (!authenticate(password)) {
            haventRights();
            return;
        }
        this.money = money;
    }

    public void changePassword(String password, String newPassword) {
        if (!authenticate(password)) {
            haventRights();
            return;
        }
        this.password = newPassword;
    }
}
