package student_alexander_zhukov.lesson_8_objects_equality_reflection.level_2;

class ClassX {
    public ClassX(int i) {
        System.out.println(1);
    }
}

class ClassY extends ClassX {
    public ClassY() {
        super(1);
        System.out.println(2);
    }
}
