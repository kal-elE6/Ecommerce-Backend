package com.mycode.ecommerce.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "product")
@Data //this is lombok to have get/set runnning behind the scenes automatically - reduce boiler plate code
public class Product {

    private Long id;

    private String sku;

    private String name;

    private String description;

    private BigDecimal unitPrice;

    private  String imageUrl;

    private boolean active;

    private int unitsInStock;

    private Date dateCreated;

    private Date lastUpdated;

}