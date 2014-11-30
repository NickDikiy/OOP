package com.luxoft.training.lab2.employees;
import com.luxoft.training.utils.Date;

public class Employers {
    private String name;
    private String surName;
    private String position;
    private typeOfPayment paymentType; 
    private Date  date;

    public Employers(String name, String surName, String position, typeOfPayment pT, Date  d ){
        this.name = name;
        this.surName = surName;
        this.position = position;   
        this.paymentType = pT;
        this.date = d;
    }
    public String getSurName(){
        return surName;
    }
    public String print(){
    return "\nName: " + name + "\nsurName: " + surName + "\nPosition: " + position+ "\n" + paymentType.printTypeOfPayment()+ "\nDate: " + date.printDate(); 
    }   
}
