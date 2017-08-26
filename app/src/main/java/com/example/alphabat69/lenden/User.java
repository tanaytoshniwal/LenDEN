package com.example.alphabat69.lenden;

/**
 * Created by AlphaBAT69 on 05-08-2017.
 */

public class User
{
    public static String ID,UNIVERSITY;
    String id,name,institution,roll,phone,email;
    public User()
    {

    }
    public User(String id,String name,String institution,String roll,String phone,String email)
    {
        this.id=id;
        this.ID=id;
        this.UNIVERSITY=institution;
        this.name=name;
        this.institution=institution;
        this.roll=roll;
        this.phone=phone;
        this.email=email;
    }
    public String getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getInstitution()
    {
        return institution;
    }
    public String getRoll()
    {
        return roll;
    }
    public String getPhone()
    {
        return roll;
    }
    public String getEmail()
    {
        return email;
    }
}
