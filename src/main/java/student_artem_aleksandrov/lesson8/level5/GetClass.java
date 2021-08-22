package student_artem_aleksandrov.lesson8.level5;

public class GetClass {


    Class getByGetClass() {
        return this.getClass();
    }

    Class getByName() throws ClassNotFoundException {
        return Class.forName("student_artem_aleksandrov.lesson8.level5.GetClass");
    }

    Class getByClass() {
        return GetClass.class;
    }

    boolean isEquals() throws ClassNotFoundException {
        return getByClass() == getByName() && getByClass() == getByClass();
    }

    public static void main(String[] args) throws ClassNotFoundException {

        GetClass getClass = new GetClass();
        assert getClass.isEquals() == true;
    }
}
