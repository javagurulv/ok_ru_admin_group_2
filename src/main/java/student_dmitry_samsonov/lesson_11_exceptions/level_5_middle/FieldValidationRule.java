package student_dmitry_samsonov.lesson_11_exceptions.level_5_middle;

interface FieldValidationRule {
    void validate(Product product) throws ValidationException;
}
