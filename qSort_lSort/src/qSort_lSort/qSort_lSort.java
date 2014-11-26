package qSort_lSort;

import static java.lang.Math.random;
import java.util.Scanner;

public class qSort_lSort {
        public static int [] qSort(int a[], int first, int last){  
          int l = last, f = first, temp;
          int middle=a[(f+l)/2];
          do{
          while (a[f]<middle) f++;
          while (a[l]>middle) l--;               
                if(f<=l){
                temp=a[f];
                a[f]=a[l];
                a[l]=temp;
                f++;
                l--;
                }
          }while (f<l);          
                if (first<l) qSort(a, first, l);
                if(f<last) qSort(a, f, last);                 
          return a; 
      }   
    public static int[] lSort(int s[], int a){
       int buf;
       int n=a;
        for(int j=n; j>0; j--)
            for (int i=0; i<n-1; i++)
                if (s[i]>s[i+1])
                {
                   buf = s[i+1];
                   s[i+1]=s[i];
                   s[i]=buf;
                }
        return s;
    }
  
    
    public static void main(String[] args) {
         
Scanner scan = new Scanner(System.in); 
int  a = 0;
boolean f = false;

System.out.println("Please, enter the deap of massiv");
while(f!=true){
    a = scan.nextInt();
    if(a==10 || a==100 || a==1000 || a==10000)      
        f=true;
    }
int mas[] = new int[a];
int mas1[] = new int[a];
for (int i=0; i<a; i++){
    mas[i] =  (int) (100-random()*a);  
    mas1[i] = (int)(50 -random()*60);
    
    }

float startTime = System.nanoTime();

lSort(mas,a);
System.out.println("Time for LineSort is "+startTime);
System.out.println("Your massiv is");
for (int x : mas)
System.out.print ( x+" ");  

System.out.println();

int   first=0, last=a-1;
float startTime1 = System.nanoTime();
qSort(mas1, first, last);
System.out.println("Time for QvickSort is "+startTime1);
System.out.println("Your massiv is");
for (int x : mas1)
System.out.print ( x+" "); 
    
    
    
  
    
    } 
    
    
    
    
    
    
}
