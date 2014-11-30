package com.luxoft.training.lab2.employees;
import com.luxoft.training.utils.Date;
import com.luxoft.training.utils.Utils;

public class PaymentCalcDemo {
    public static void main(String[] args) {
        int low=0;
        int number = 3;
        int high=number;
        Employers mas[] = new Employers[number];        
        mas[0] = new Employers("Ivan", "Cvanov", "director in departament IT Departament", new typeOfPayment("monthPayment"), new Date(1,1,1900) );           
        mas[1] = new Employers("Adam", "Biski", "engenier", new typeOfPayment("HorleyPayment"), new Date(10,10,1812) );           
        mas[2] = new Employers("Nick", "Aail", "programmer", new typeOfPayment("month_persentOfSailPayment"), new Date(23,9,1995));           
      
       Utils.sort(mas,low,high-1);
       for(int i=0; i<number; i++){
            System.out.println(mas[i].print());
            System.out.println("_________________________________________________________________________________________________________________________");
     
       }
        
    }
    
}
