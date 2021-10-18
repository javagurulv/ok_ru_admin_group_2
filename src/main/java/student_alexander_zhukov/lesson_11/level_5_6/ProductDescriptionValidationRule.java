package student_alexander_zhukov.lesson_11.level_5_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ProductDescriptionValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {

        if (product.getDescription().length() > 2000) {
            throw new ValidationException("RULE-7", "Description can not be more then 2000 symbols", "description");
        }

        Pattern pattern = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(product.getDescription());
        if (matcher.find()) {
            throw new ValidationException("RULE-8", "Description must contain only English letters and numbers", "description");
        }

    }
}
