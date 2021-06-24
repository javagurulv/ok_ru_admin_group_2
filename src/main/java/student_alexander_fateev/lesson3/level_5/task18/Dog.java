package student_alexander_fateev.lesson3.level_5.task18;

class Dog {
    String dogName;

    Dog(String dogName) {
        this.dogName = dogName;
    }

    void voice() {
        for(int i=0;i<3;i++){
            System.out.println(this.dogName);
        }
    }
}
