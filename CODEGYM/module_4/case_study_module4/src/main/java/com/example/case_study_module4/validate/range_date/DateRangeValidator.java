package com.example.case_study_module4.validate.range_date;

import com.example.case_study_module4.validate.Contract;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class DateRangeValidator implements ConstraintValidator<DateRange, Contract> {

    @Override
    public void initialize(DateRange constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Contract value, ConstraintValidatorContext context) {
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
