package student_alexander_zhukov.lesson_3.level_5;

class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Bobik",12, "black");

        myDog.voice();
        myDog.happyBirthday();
        myDog.voice();
        myDog.changeColor("Red");
        myDog.voice();
    }
}
