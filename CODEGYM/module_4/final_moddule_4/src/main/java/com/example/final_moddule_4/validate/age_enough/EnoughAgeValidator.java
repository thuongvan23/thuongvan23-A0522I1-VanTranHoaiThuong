package com.example.final_moddule_4.validate.age_enough;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class EnoughAgeValidator implements ConstraintValidator<EnoughAge, LocalDate> {
    public Integer age;

    @Override
    public void initialize(EnoughAge constraintAnnotation) {
        this.age = Integer.valueOf(constraintAnnotation.value());
    }

    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        int yearNow = LocalDate.now().getYear();
        return (yearNow - value.getYear()) > age;
    }


}
