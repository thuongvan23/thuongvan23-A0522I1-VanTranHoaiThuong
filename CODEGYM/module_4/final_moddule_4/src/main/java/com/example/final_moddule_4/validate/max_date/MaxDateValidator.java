package com.example.final_moddule_4.validate.max_date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class MaxDateValidator implements ConstraintValidator<MaxDate, LocalDate> {
    public String maxDate;
    @Override
    public void initialize(MaxDate constraintAnnotation) {
        this.maxDate = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        LocalDate max = LocalDate.parse(maxDate);
        return !value.isAfter(max);
    }
}
