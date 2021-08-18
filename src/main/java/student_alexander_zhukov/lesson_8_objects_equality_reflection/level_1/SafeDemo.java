package student_alexander_zhukov.lesson_8_objects_equality_reflection.level_1;

class SafeDemo {
    public static void main(String[] args) {
        Safe newSafe = new Safe();
        newSafe.password = "newpassword";
        newSafe.balance = 100;
    }
}
