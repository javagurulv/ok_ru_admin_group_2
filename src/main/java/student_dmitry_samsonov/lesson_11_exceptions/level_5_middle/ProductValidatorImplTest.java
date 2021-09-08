package student_dmitry_samsonov.lesson_11_exceptions.level_5_middle;

import java.util.List;

class ProductValidatorImplTest {
    public static ProductValidatorRules rules = new ProductValidatorRules();

    public static void main(String[] args) {
        Product product = new Product("title1", 1, "description1");
        ProductTitleValidationRule productTitleValidationRule = new ProductTitleValidationRule();

        String ruleName = "Title Rule 1";
        product.setTitle("");
        printValidateTestException(ruleName, productTitleValidationRule, product);
        product.setTitle("title1");
        printValidateTestPass(ruleName, productTitleValidationRule, product);

        ruleName = "Title Rule 2";
        product.setTitle("t1");
        printValidateTestException(ruleName, productTitleValidationRule, product);
        product.setTitle("title1");
        printValidateTestPass(ruleName, productTitleValidationRule, product);

        ruleName = "Title Rule 3";
        product.setTitle("t".repeat(101));
        printValidateTestException(ruleName, productTitleValidationRule, product);
        product.setTitle("title1");
        printValidateTestPass(ruleName, productTitleValidationRule, product);

        ruleName = "Title Rule 4";
        product.setTitle("тайтл!");
        printValidateTestException(ruleName, productTitleValidationRule, product);
        product.setTitle("title1");
        printValidateTestPass(ruleName, productTitleValidationRule, product);

        ProductPriceValidationRule productPriceValidationRule = new ProductPriceValidationRule();

        ruleName = "Price Rule 1";
        product.setPrice(null);
        printValidateTestException(ruleName, productPriceValidationRule, product);
        product.setPrice(1);
        printValidateTestPass(ruleName, productPriceValidationRule, product);

//        Невозможно записать в цену не цифры, т.к. это аттрибут типа integer.
//        ruleName = "Price Rule 2";
//        product.setPrice(1);
//        printValidateTestException(ruleName, productPriceValidationRule, product);
//        product.setPrice(1);
//        printValidateTestPass(ruleName, productPriceValidationRule, product);

        ruleName = "Price Rule 3";
        product.setPrice(0);
        printValidateTestException(ruleName, productPriceValidationRule, product);
        product.setPrice(1);
        printValidateTestPass(ruleName, productPriceValidationRule, product);

        ProductDescriptionValidationRule productDescriptionValidationRule = new ProductDescriptionValidationRule();

        ruleName = "Description Rule 1";
        product.setDescription("D".repeat(2001));
        printValidateTestException(ruleName, productDescriptionValidationRule, product);
        product.setDescription("description1");
        printValidateTestPass(ruleName, productDescriptionValidationRule, product);

        ruleName = "Description Rule 2";
        product.setDescription("Дескрипшен");
        printValidateTestException(ruleName, productDescriptionValidationRule, product);
        product.setDescription("description1");
        printValidateTestPass(ruleName, productDescriptionValidationRule, product);

        ProductValidatorImpl productValidator = new ProductValidatorImpl(productTitleValidationRule,
                productPriceValidationRule, productDescriptionValidationRule);
        product.setTitle(null);
        product.setPrice(0);
        product.setDescription("#");
        List<ValidationException> validationExceptionList = productValidator.validate(product);
        boolean passed = false;
        for (ProductValidatorFields field: ProductValidatorFields.values()) {
            for (ValidationException e: validationExceptionList) {
                if (e.getFieldName().equals(field.toString())) {
                    printTestResult("ProductValidatorImpl " + field.toString(), true);
                    passed = true;
                    break;
                }
            }
            if (!passed) {
                printTestResult("ProductValidatorImpl " + field.toString(), false);
            }
            passed = false;
        }
    }

    static void printTestResult(String name, boolean result) {
        String reportName = name + " test = ";
        String reportResult;
        if (result) {
            reportResult = "OK";
        } else {
            reportResult = "FAIL";
        }
        System.out.println(reportName + reportResult);
    }

    static void printValidateTestException(String ruleName, FieldValidationRule productValidationRule,
                                           Product product) {
        String ruleLongName = ruleName + " (" + rules.getDescription(ruleName) + ")";
        try {
            productValidationRule.validate(product);
            printTestResult(ruleLongName + " False Positive", false);
        } catch (ValidationException validationException) {
            printTestResult(ruleLongName  + " Negative",
                    validationException.getFieldName().equals(rules.getFieldName(ruleName)) &&
                            validationException.getRuleName().equals(ruleName));
        }
    }

    static void printValidateTestPass(String ruleName, FieldValidationRule productValidationRule,
                                      Product product) {
        String ruleLongName = ruleName + " (" + rules.getDescription(ruleName) + ")";
        try {
            productValidationRule.validate(product);
            printTestResult(ruleLongName + " Positive", true);
        } catch (ValidationException validationException) {
            printTestResult(ruleLongName + " False Negative", false);
        }
    }
}