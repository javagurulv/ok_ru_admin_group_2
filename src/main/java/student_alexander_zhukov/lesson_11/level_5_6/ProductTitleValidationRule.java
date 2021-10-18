package student_alexander_zhukov.lesson_11.level_5_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ProductTitleValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {

        if (product.getTitle() == null || product.getTitle().equals("")) {
            throw new ValidationException("RULE-1", "Title can not be empty", "title");
        }

        if (product.getTitle().length() < 3) {
            throw new ValidationException("RULE-2", "Title can not be less then 3 symbols", "title");
        }

        if (product.getTitle().length() > 100) {
            throw new ValidationException("RULE-3", "Title can not be more then 100 symbols", "title");
        }

        Pattern pattern = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(product.getTitle());
        if (matcher.find()) {
            throw new ValidationException("RULE-4", "Title must contain only English letters and numbers", "title");
        }

    }
}
