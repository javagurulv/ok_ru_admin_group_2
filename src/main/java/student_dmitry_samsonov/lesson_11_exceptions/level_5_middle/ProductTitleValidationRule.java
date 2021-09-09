package student_dmitry_samsonov.lesson_11_exceptions.level_5_middle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ProductTitleValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        ProductValidatorRules rules = new ProductValidatorRules();

        String ruleName = "Title Rule 1";
        if (product.getTitle() == null || product.getTitle().equals("")) {
            throw new ValidationException(ruleName, rules.getDescription(ruleName), rules.getFieldName(ruleName));
        }
        ruleName = "Title Rule 2";
        if (product.getTitle().length() < 3) {
            throw new ValidationException(ruleName, rules.getDescription(ruleName), rules.getFieldName(ruleName));
        }
        ruleName = "Title Rule 3";
        if (product.getTitle().length() > 100) {
            throw new ValidationException(ruleName, rules.getDescription(ruleName), rules.getFieldName(ruleName));
        }
        ruleName = "Title Rule 4";
        Pattern pattern = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(product.getTitle());
        if (matcher.find()) {
            throw new ValidationException(ruleName, rules.getDescription(ruleName), rules.getFieldName(ruleName));
        }
    }
}
