package student_dmitry_drozdetsky.lesson_3.level_5.Task_21;

class Dog {
    String dogName;
    int dogAge;
    String dogColor;

    Dog(String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }
    void voice() {
        System.out.println(this.dogName);
        System.out.println(this.dogAge);
        System.out.println(this.dogColor);
    }
}

class DogDemo {

    public static void main(String[] args) {

        Dog dog = new Dog("Sharik", 11, "Red");
        dog.voice();
    }
}