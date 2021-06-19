package student_sergo_kurbanov.lesson_3.level_5;

public class Dog {
    String nickname;
    int age;

    Dog(String nickname) {
        setNickname(nickname);
    }

    Dog(int age) {
        setAge(age);
    }

    Dog(String nickname, int age) {
        setNickname(nickname);
        setAge(age);
    }

    private void setNickname(String nickname) {
        this.nickname = nickname;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public void speak() {
        System.out.printf("%s! %s! %s!", nickname, nickname, nickname);
    }

    public void voice() {
        System.out.printf("\nnickname = %s, Age = %d", nickname, age);
    }
}
