package student_alexander_zhukov.lesson_8_objects_equality_reflection.level_1;

class Safe2Demo {
    public static void main(String[] args) {
        Safe2 newSafe2 = new Safe2("secret", 0);
        System.out.println(newSafe2.putMoney("secret", 55));
        System.out.println(newSafe2.putMoney("wrongsecret", 5));
        System.out.println(newSafe2.getMoney("secret", 50));
        System.out.println(newSafe2.getMoney("wrongsecret", 5));
        System.out.println(newSafe2.getMoney("secret", 50));
    }
}
