package student_artem_khokhlov.lesson_11.level_5_middle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorImpl implements Validator{

    @Override
    public void validateName(String name) throws ValidationException {
        if (name.isEmpty() || name.isBlank()) {
            throw new ValidationException("Product name must not be empty.");
        }
        if (name.length() < 3) {
            throw  new ValidationException("Product name must be at least 3 characters.");
        }
        if (name.length() > 100) {
            throw  new ValidationException("Product name must be lower then 100 characters.");
        }
    }

    @Override
    public void validatePrice(Long price) throws ValidationException {
        if (price == null) {
            throw new ValidationException("Price must not be null.");
        }

        if (price <= 0L) {
            throw new ValidationException("Price must be greater than 0.");
        }
    }

    @Override
    public void validateDescription(String desc) throws ValidationException {
        if (desc.length() > 2000) {
            throw new ValidationException("Description must not be greater than 2000 symbols.");
        }
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(desc);
        if (! matcher.matches()) {
            throw new ValidationException("Description must be only [A-Za-z0-9_].");
        }
    }
}
