package student_alexander_fateev.lesson3.level_5.task20;

class Dog {
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

    void happyBirthday() {
        this.dogAge++;
    }
}
