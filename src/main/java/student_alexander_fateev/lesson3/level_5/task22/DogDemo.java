package student_alexander_fateev.lesson3.level_5.task22;

public class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Dobby", "Blue", 7);
        myDog.voice();
        myDog.changeColor("red");
        myDog.voice();
    }
}
