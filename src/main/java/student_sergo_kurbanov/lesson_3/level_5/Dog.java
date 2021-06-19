package student_sergo_kurbanov.lesson_3.level_5;

public class Dog {
    private String nickname;
    private int age;
    private String color;

    Dog() {
        setNickname("nobody");
        setAge(0);
        setColor("nocolor");
    }

    Dog(String nickname) {
        setNickname(nickname);
        setAge(0);
        setColor("nocolor");
    }

    Dog(int age) {
        setAge(age);
    }

    Dog(String nickname, int age) {
        setNickname(nickname);
        setAge(age);
        setColor("nocolor");
    }

    Dog(String nickname, int age, String color) {
        setNickname(nickname);
        setAge(age);
        setColor(color);
    }

    private void setNickname(String nickname) {
        this.nickname = nickname;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setColor(String color) {
        this.color = color;
    }

    private void aging() {
        this.age += 1;
    }

    void happyBirthday() {
        aging();
        System.out.printf("\nHappy Birthday, %s!", nickname);
    }

    public void speak() {
        System.out.printf("%s! %s! %s!", nickname, nickname, nickname);
    }

     void voice() {
         System.out.printf("\nnickname = %s, Age = %d, color = %s", nickname, age, color);
     }

    void changeColor(String color) {
        setColor(color);
    }
}
