package student_andrey_domas.lesson11.validators.annotations;

import java.lang.annotation.*;

/**
 * Test if a String contains only Latin symbols or numbers,
 * Skip validation if null.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Inherited
public @interface ValidatorRuleStringEnglish {
}
