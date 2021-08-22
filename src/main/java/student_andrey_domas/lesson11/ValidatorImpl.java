package student_andrey_domas.lesson11;

import student_andrey_domas.lesson11.validators.*;
import student_andrey_domas.lesson11.validators.annotations.ValidatorRuleIntMinMax;
import student_andrey_domas.lesson11.validators.annotations.ValidatorRuleNotEmpty;
import student_andrey_domas.lesson11.validators.annotations.ValidatorRuleStringEnglish;
import student_andrey_domas.lesson11.validators.annotations.ValidatorRuleStringLength;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ValidatorImpl<T> implements Validator<T> {
    private FieldValidator[] getValidators(Field field) {
        List<FieldValidator> lst = new ArrayList<>();
        for (Annotation annotation: field.getAnnotations()) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            FieldValidator validator = null;
            if (annotation.annotationType() == ValidatorRuleNotEmpty.class) {
                lst.add(new NotEmptyFieldValidator());
            }
            if (annotation.annotationType() == ValidatorRuleIntMinMax.class) {
                ValidatorRuleIntMinMax a = (ValidatorRuleIntMinMax) annotation;
                lst.add(new IntMinMaxFieldValidator(a.min(), a.max()));
            }
            if (annotation.annotationType() == ValidatorRuleStringLength.class) {
                ValidatorRuleStringLength a = (ValidatorRuleStringLength) annotation;
                lst.add(new StringLengthFieldValidator(a.min(), a.max()));
            }
            if (annotation.annotationType() == ValidatorRuleStringEnglish.class) {
                lst.add(new StringEnglishAlphaFieldValidator());
            }
        }
        return lst.toArray(FieldValidator[]::new);
    }

    @Override
    public List<ValidationException> validate(T instance) {
        List<ValidationException> exceptions = new ArrayList<>();
        for (Field field: instance.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            for (FieldValidator validator: getValidators(field)) {
                Object obj = null;
                try {
                    obj = field.get(instance);
                } catch (IllegalAccessException e) {
                    //no-op
                }
                try {
                    if (field.getType().equals(String.class)) {
                        String s = (String) obj;
                        validator.validate(s);
                    }
                    if (field.getType().equals(Integer.class)) {
                        Integer i = (Integer) obj;
                        validator.validate(i);
                    }
                } catch (ValidationException e) {
                    e.setFieldName(field.getName());
                    exceptions.add(e);
                }
            }
        }
        return exceptions;
    }
}
