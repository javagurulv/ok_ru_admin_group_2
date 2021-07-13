package student_andrey_domas.lesson6.level1;

import org.junit.Test;
import student_sergo_kurbanov.lesson_6.level_1.NumberUtils;

public class NumberUtilsTest {

    @Test
    public void testIsEventTrue() {
        var nu = new NumberUtils();
        assert nu.isEven(6);
    }

    @Test
    public void testIsEventFalse() {
        var nu = new NumberUtils();
        assert !nu.isEven(7);
    }

}
