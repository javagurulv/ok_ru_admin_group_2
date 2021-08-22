package student_andrey_domas.lesson11.validators.annotations;

import java.lang.annotation.*;

/**
 * Test if null.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Inherited
public @interface ValidatorRuleNotEmpty {
}
