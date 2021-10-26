package student_artem_khokhlov.lesson_11.level_5_middle;

public interface Validator {
    void validateName(String name) throws ValidationException;
    void validatePrice(Long price) throws ValidationException;
    void validateDescription(String desc) throws ValidationException;
}
