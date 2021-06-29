package student_alexey_krenev.lesson_3.level_5.task_19;


import javax.sound.midi.Soundbank;

class Dog {
    String dogName;
    int dogAge;

    public Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }


    void voice(){
        System.out.println("Dog name " + this.dogName);
        System.out.println("Dog age " + this.dogAge);

    }


}
