package student_dmitry_samsonov.lesson_11_exceptions.level_5_middle;

class ProductPriceValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        ProductValidatorRules rules = new ProductValidatorRules();

        String ruleName = "Price Rule 1";
        if (product.getPrice() == null) {
            throw new ValidationException(ruleName, rules.getDescription(ruleName), rules.getFieldName(ruleName));
        }

//        Невозможно записать в цену не цифры, т.к. это аттрибут типа integer.
//        ruleName = "Price Rule 2";

        ruleName = "Price Rule 3";
        if (product.getPrice() == 0) {
            throw new ValidationException(ruleName, rules.getDescription(ruleName), rules.getFieldName(ruleName));
        }
    }
}
