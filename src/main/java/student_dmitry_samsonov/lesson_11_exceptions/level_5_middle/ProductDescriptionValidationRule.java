package student_dmitry_samsonov.lesson_11_exceptions.level_5_middle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ProductDescriptionValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        ProductValidatorRules rules = new ProductValidatorRules();

        String ruleName = "Description Rule 1";
        if (product.getDescription().length() > 100) {
            throw new ValidationException(ruleName, rules.getDescription(ruleName), rules.getFieldName(ruleName));
        }
        ruleName = "Description Rule 2";
        Pattern pattern = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(product.getDescription());
        if (matcher.find()) {
            throw new ValidationException(ruleName, rules.getDescription(ruleName), rules.getFieldName(ruleName));
        }

    }
}
