package student_andrey_domas.lesson8.level5;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class ReflectionUtilTest {

    private ReflectionUtil ru;

    @Before
    public void setup() {
        ru = new ReflectionUtil();
    }

    @Test
    public void getClassAccessModifierTest_public() throws ClassNotFoundException {
        assertEquals("public", ru.getClassAccessModifier(
                "student_andrey_domas.lesson8.level5.PublicClass"));
    }

    @Test
    public void getClassAccessModifierTest_default() throws ClassNotFoundException {
        assertNull(ru.getClassAccessModifier("student_andrey_domas.lesson8.level5.DefaultClass"));
    }

    @Test(expected = ClassNotFoundException.class)
    public void getClassAccessModifierTest_ClassNotFound() throws ClassNotFoundException {
        ru.getClassAccessModifier("unexists_class");
    }

    @Test
    public void getSuperClassNameTest() throws ClassNotFoundException {
        assertEquals("student_andrey_domas.lesson8.level5.Parent",
                ru.getSuperClassName("student_andrey_domas.lesson8.level5.Child"));
    }

    @Test(expected = ClassNotFoundException.class)
    public void getSuperClassNameTest_ClassNotFound() throws ClassNotFoundException {
       ru.getSuperClassName("unexists_class");
    }

    @Test
    public void createClassInstanceUsingDefaultConstructorTest() throws ClassNotFoundException,
            InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Object o = ru.createClassInstanceUsingDefaultConstructor("student_andrey_domas.lesson8.level5.DefaultClass");
        assertTrue(o instanceof student_andrey_domas.lesson8.level5.DefaultClass);
    }
}
