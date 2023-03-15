package com.example.final_moddule_4.model;

import com.example.final_moddule_4.validate.range_date.DateRange;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
@Entity
@DateRange
public class InfoSale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sale")
    private int idSale;
    @Column(name = "name_sale")
    @NotNull
    private String nameSale;
    @Column(name = "begin_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Future(message = "date must after ")
    @NotNull
    private LocalDate beginDate;
    @Column(name = "end_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private LocalDate endDate;
    @Column(name = "rate_sale")
    @NotNull
    @Min(value = 10000)
    private int rateSale;
    @Column(name = "detail")
    @NotNull
    private String detail;

    public InfoSale() {
    }

    public InfoSale(String nameSale, LocalDate beginDate, LocalDate endDate, int rateSale, String detail) {
        this.nameSale = nameSale;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.rateSale = rateSale;
        this.detail = detail;
    }

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public String getNameSale() {
        return nameSale;
    }

    public void setNameSale(String nameSale) {
        this.nameSale = nameSale;
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

    public int getRateSale() {
        return rateSale;
    }

    public void setRateSale(int rateSale) {
        this.rateSale = rateSale;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
