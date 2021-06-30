package student_alexander_zhukov.lesson_3.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Dog {
    String nickName;
    String color;
    int age;

    public Dog(String nickName, int age, String color) {
        this.nickName = nickName;
        this.age = age;
        this.color = color;
    }
    public void voice() {
        System.out.println("NickName: " + this.nickName);
        System.out.println("Color: " + this.color);
        System.out.println("Age: " + this.age);
        System.out.println(" ");
    }
    void happyBirthday() {
        this.age = this.age + 1;
    }
    void changeColor(String newColor) {
        this.color = newColor;
    }
}
