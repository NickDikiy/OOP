package com.luxoft.training.utils;
import com.luxoft.training.lab2.employees.Employers;

public class Utils {
    static public void sort(Employers a[],int right,int high){
    int i = right;
    int j = high;
    int x = a[(right+high)/2].getSurName().hashCode();
    
        do {     
            while(a[i].getSurName().hashCode()< x) ++i;
            while(a[j].getSurName().hashCode() > x) --j;
                if(i <= j){
                    Employers temp= a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    i ++ ; 
                    j --;
                }
        }while(i <= j);
        if(right < j) sort(a, right, high);
        if(i < high) sort(a, i, high); 
        }
}
