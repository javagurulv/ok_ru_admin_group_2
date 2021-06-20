package student_sergo_kurbanov.lesson_3.level_7;

public class TicketDemo {
    public static void main(String[] args) {
        Ticket trainTicket = new Ticket("Train", (float) 5.25, "12.08.2021");

        trainTicket.getInfo();
        trainTicket.present("20.06.2021");
        trainTicket.getInfo();
    }
}
