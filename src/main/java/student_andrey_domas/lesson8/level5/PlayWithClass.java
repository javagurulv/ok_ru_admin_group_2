package student_andrey_domas.lesson8.level5;

public class PlayWithClass {
    public static void main(String[] args) {
        Class klass1 = (new Object()).getClass();
        Class klass2 = Object.class;
        Class klass3;
        try {
            klass3 = Class.forName("Object");
        } catch (ClassNotFoundException e) {
            klass3 = null;
        }

        assert klass1 == klass2;
        assert klass1 == klass3;
    }
}
