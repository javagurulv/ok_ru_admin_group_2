package student_alexander_zhukov.lesson_11.level_5_6;

import java.util.List;

interface ProductValidator {

    List<ValidationException> validate(Product product);

}