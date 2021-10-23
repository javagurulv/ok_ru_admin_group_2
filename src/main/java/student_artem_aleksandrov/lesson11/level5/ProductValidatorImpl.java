package student_artem_aleksandrov.lesson11.level5;

import java.util.ArrayList;
import java.util.List;

public class ProductValidatorImpl implements ProductValidator {

    Product product;

    @Override
    public List<ValidationException> validate(Product product) {
        this.product = product;
        List<ValidationException> exceptionList = new ArrayList<>();
        return exceptionList;
        // TODO: Continue HERE
//        if (!isTitleValid()) {
//            ValidationException validationException = new ValidationException("isTitleValid", )
//            exceptionList
//        }
    }

    boolean isPriceValid() {
        /*
            - не должна быть пустой
            - должна содержать только цифры ## We use int type
            - не может быть 0
         */
        return isNotNull(product.getPrice()) & product.getPrice() > 0;
    }

    boolean isTitleValid() {
    /*
    К названию продукта выдвигаются следующие требования:
        - не должно быть пустым
        - не должно быть короче 3 символов
        - не должно быть длиннее 100 символов
        - должно содержать только английские буквы и цифры, другие символы не допустимы
     */
        return isNotEmpty(product.getTitle()) &
                isLengthSizeCorrect(product.getTitle(), 3, 100) &
                isOnlyValidCharters(product.getTitle());
    }

    boolean isDescriptionValid() {
    /*
        - не должно быть длиннее 2000 символов
        - должно содержать только английские буквы и цифры, другие символы не допустимы
     */
        return isLengthSizeCorrect(product.getDescription(), 0, 2000) &
                isOnlyValidCharters(product.getDescription());
    }

    boolean isNotNull(Object object) {
        return object != null;
    }

    boolean isNotEmpty(String string) {
        return string.length() > 1;
    }

    boolean isLengthSizeCorrect(String string, int min, int max) {
        return string.length() > min & string.length() <= max;
    }

    boolean isOnlyValidCharters(String string) {
        return true;
    }
}
