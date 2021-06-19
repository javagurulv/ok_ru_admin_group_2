package student_sergo_kurbanov.lesson_3.level_5;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("The Ball");
        dog.speak();

        Dog dogAged = new Dog("Sharik", 4);
        dogAged.voice();
    }
}
