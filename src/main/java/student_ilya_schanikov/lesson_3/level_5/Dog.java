package student_ilya_schanikov.lesson_3.level_5;

import java.util.Scanner;

class Dog {
    String name;
    int age;
    String color;

    public void voice() {

        System.out.println(this.name + " " + this.age + " " + this.color);
    }

    public Dog(String dogName) {
        this.name = dogName;
        System.out.println("Please, enter " + this.name + " age:");
        Scanner dogAge = new Scanner(System.in);
        this.age = dogAge.nextInt();
        System.out.println("Please, enter " + this.name + " color:");
        Scanner dogColor = new Scanner(System.in);
        this.color = dogColor.nextLine();
    }

    void happyBirthday() {
        this.age = this.age + 1;
    }

    void happyColoring() {
        this.color = "black"; //All dogs must be black, indeed!
    }
}

class DogDemo {
    public static void main(String[] args) {
        Dog Dog1 = new Dog("Black");
        Dog1.voice();
        Dog1.happyBirthday();
        Dog1.happyColoring();
        Dog1.voice();

        Dog Dog2 = new Dog("Tiger");
        Dog2.voice();
        Dog2.happyBirthday();
        Dog2.happyColoring();
        Dog2.voice();

        Dog Dog3 = new Dog("Cat");
        Dog3.voice();
        Dog3.happyBirthday();
        Dog3.happyColoring();
        Dog3.voice();
        }
    }