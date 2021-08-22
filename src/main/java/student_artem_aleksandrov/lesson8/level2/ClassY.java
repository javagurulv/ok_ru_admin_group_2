package student_artem_aleksandrov.lesson8.level2;


class ClassX {
    public ClassX(int i) {
        System.out.println(i);
    }
}

class ClassY extends ClassX {
    public ClassY() {
        super(0);
        System.out.println(2);
    }
}
