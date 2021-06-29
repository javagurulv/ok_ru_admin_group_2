package student_artem_aleksandrov.lesson2.level2;

public class HelloUser {
    public static void main(String[] args) {
        String userName = System.getProperty("user.name");
        System.out.println("Hello user %s".formatted(userName));
    }
}
