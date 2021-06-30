package student_dmitry_samsonov.lesson_3.level_7_senior;

import student_dmitry_samsonov.lesson_3.level_5_middle.Dog;

class ElephantDogDemo {
    public static void main(String[] args) {
        Elephant elephant = new Elephant(5.9, 100);
        Dog dog = new Dog("Mosyka", 1, "Black");
        System.out.println("Dog " + dog.getName() + " says: " + dog.bark());
        System.out.println("Elephant answers: " + elephant.reactionOnBarking());
    }
}
