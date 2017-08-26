package com.example.alphabat69.lenden;

/**
 * Created by AlphaBAT69 on 05-08-2017.
 */

public class Product
{
    String id,name,detail,condition,price,number;
    public Product()
    {

    }
    public Product(String id,String name,String detail,String condition,String price,String number)
    {
        this.id=id;
        this.name=name;
        this.detail=detail;
        this.condition=condition;
        this.price=price;
        this.number=number;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public String getCondition() {
        return condition;
    }

    public String getPrice() {
        return price;
    }

    public String getNumber() {
        return number;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
