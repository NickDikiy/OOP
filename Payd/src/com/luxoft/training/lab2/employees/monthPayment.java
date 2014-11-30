package com.luxoft.training.lab2.employees;

public class monthPayment extends typeOfPayment {
    private  int d=1200;
    private String a="month Payment";
    public monthPayment(String a) {
        super(a);
    }
    public String printMonthPayment(){
    return a+"\nSalary:"+d;
    }
}
