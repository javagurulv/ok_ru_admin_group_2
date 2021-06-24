package student_alexander_fateev.lesson3.level_5.task19;

public class Dog {
    String dogName;
    int dogAge;

    Dog (String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

   void voice() {
        System.out.println("Dog name is " + this.dogName);
        System.out.println("Dog age is " + this.dogAge);
    }
}
