package student_andrey_domas.lesson11.validators.annotations;

import java.lang.annotation.*;

/**
 * Test if Integer > min && < max.
 * Skip validation if null.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Inherited
public @interface ValidatorRuleIntMinMax {
    int min() default -1;
    int max() default -1;
}
