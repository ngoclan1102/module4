package com.codegym.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    @Pattern(regexp = "^[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ]{5,50}$",message = "nhập lại")
    private String name;

//    @Pattern(regexp = "^[0-9]$",message = "nhập lại")
    private String acreage;

//    @Pattern(regexp = "^[0-9]$",message = "nhập lại")
    private String population;

//    @Pattern(regexp = "^[0-9]$",message = "nhập lại")
    private String GDP;

//    @Pattern(regexp = "^[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ]$",message = "Nhập lại")
    private String description;

    @ManyToOne
    private Country country;
}
