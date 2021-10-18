package student_alexander_zhukov.lesson_11.level_5_6;

class ProductPriceValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {

        if (product.getPrice() == null) {
            throw new ValidationException("RULE-5", "Price can not be empty", "price");
        }

        if (product.getPrice() == 0) {
            throw new ValidationException("RULE-6", "Price can not be zero", "price");
        }

    }
}
