package student_artem_aleksandrov.lesson3;

public class DogDemo {
    public static void main(String[] args) {
        Dog dogFoo = new Dog("Foo");
        Dog dogBar = new Dog("Bar", 3);

        dogFoo.voice();
        dogBar.voice();

        dogBar.happyBirthday();
        dogBar.changeColor("Red");
        dogBar.voice();


    }
}
