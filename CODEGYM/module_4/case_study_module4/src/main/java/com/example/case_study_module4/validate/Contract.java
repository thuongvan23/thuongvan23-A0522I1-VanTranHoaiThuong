package com.example.case_study_module4.validate;

import com.example.case_study_module4.validate.range_date.DateRange;

import java.time.LocalDate;

@DateRange
public class Contract {

    private LocalDate beginDate;

    private LocalDate endDate;

    public Contract() {
    }

    public Contract(LocalDate beginDate, LocalDate endDate) {
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    // getters and setters
}