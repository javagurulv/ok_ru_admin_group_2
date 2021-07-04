package student_alexey_gorbov.lesson_3;

public class Task18DogDemo {
    public static void main(String[] args) {
        Task18Dog dog = new Task18Dog("T100");
        dog.voice();

        Task18Dog dog1 = new Task18Dog("T101", 23);
        dog1.voiceAge();
        dog1.happyBirthday();
        dog1.voiceAge();

        Task18Dog dog2 = new Task18Dog("T101", 23, "Red");
        dog2.voiceAge();
        dog2.happyBirthday();
        dog2.changeColor("Black");
        dog2.voiceAge();

    }
}
