package com.example.productmanagement_pfe.model;

import javax.persistence.*;

@Entity
@Table(name = "manufacturer")
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_manufacturer")
    private int idManufacturer;
    @Column(name = "name_manufacturer")
    private String nameManufacturer;
    @Column(name = "country")
    private String country;

    public Manufacturer() {
    }

    public Manufacturer(int idManufacturer, String nameManufacturer, String country) {
        this.idManufacturer = idManufacturer;
        this.nameManufacturer = nameManufacturer;
        this.country = country;
    }

    public int getIdManufacturer() {
        return idManufacturer;
    }

    public void setIdManufacturer(int idManufacturer) {
        this.idManufacturer = idManufacturer;
    }

    public String getNameManufacturer() {
        return nameManufacturer;
    }

    public void setNameManufacturer(String nameManufacturer) {
        this.nameManufacturer = nameManufacturer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
