package student_dmitry_drozdetsky.lesson_3.level_5.Task_18;

class Dog {
    String dogName;

    Dog(String dogName) {
        this.dogName = dogName;
    }
    void voice() {
        for (int i = 0; i < 3; i++) {
            System.out.println(this.dogName);
        }
    }
}

class DogDemo {

    public static void main(String[] args) {

        Dog dog = new Dog("Sharik");

        dog.voice();
    }
}