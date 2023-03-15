package com.example.final_moddule_4.validate.range_date;

import com.example.final_moddule_4.model.InfoSale;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class DateRangeValidator implements ConstraintValidator<DateRange, InfoSale> {

    @Override
    public void initialize(DateRange constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(InfoSale value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        LocalDate beginDate = value.getBeginDate();
        LocalDate endDate = value.getEndDate();
        if (beginDate == null || endDate == null) {
            return true;
        }
        return !endDate.isBefore(beginDate);
    }
}
