package student_alexander_fateev.lesson8.level_5_6.task19_24;

public class DemoClassPublic {
    public String color;
    private String name;

    private DemoClassPublic() {}

    public DemoClassPublic(String color) {}

    public void display() {
        System.out.println("I am a dog.");
    }

    private void makeSound() {
        System.out.println("Bark Bark");
    }
}
