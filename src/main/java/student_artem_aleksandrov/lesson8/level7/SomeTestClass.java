package student_artem_aleksandrov.lesson8.level7;

import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class SomeTestClass {

    String var = "Value";

    public SomeTestClass() {
        this.var = "var";
    }

    @Test
    boolean Test1() {
        System.out.println("All OK");
        return true;
    }

    @Test
    boolean Test2() {
        System.out.println("All OK");
        return true;
    }

    boolean Test3() {
        System.out.println("All OK");
        return true;
    }

    @Test
    boolean Test4() {
        System.out.println("Failed");
        return false;
    }
}
