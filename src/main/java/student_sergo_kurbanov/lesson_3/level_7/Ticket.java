package student_sergo_kurbanov.lesson_3.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Ticket {
    private String type;
    private float price;
    private String term;
    private boolean active;
    private String dateOfUse;
    private int seat;

    Ticket(String type, float price, String term) {
        this.type = type;
        this.price = price;
        this.term = term;
        this.active = true;
        this.dateOfUse = "not used yet";
    }

    void getInfo() {
        System.out.printf("Your \"%s\" ticket for %.2f$ is valid until %s", type, price, term);
        System.out.printf("\nActive = %b, Used=%s", active, dateOfUse);
    }

    boolean isActive() {
        return this.active;
    }

    void present(String data) {
        this.active = false;
        this.dateOfUse = data;
    }
}
