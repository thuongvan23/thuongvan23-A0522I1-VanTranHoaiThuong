package com.example.case_study_module4.validate.min_date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class MinDateValidator implements ConstraintValidator<MinDate, LocalDate> {
    public String minDate;

    @Override
    public void initialize(MinDate constraintAnnotation) {
        this.minDate = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        LocalDate min = LocalDate.parse(minDate);
        return !value.isBefore(min);
    }
}
