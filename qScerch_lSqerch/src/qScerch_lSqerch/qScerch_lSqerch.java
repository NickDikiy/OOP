package qScerch_lSqerch;

import java.util.Arrays;
import java.util.Scanner;

public class qScerch_lSqerch {
 private static int step;   
  private static int step1;      
      public static  int   findElement(int al[], int n){
        int i=0;
       while(al[i]!=n){
           i++;
           step=i+1;
            }
       if(i==0 && al[i]==n) step=i+1;
            return al[i];
        }    
     private static int binarySearth(int all[], int left,  int right, int n){
       
       int middle=(left+right)/2;
        if (all[middle]==n){   
            step1++;
            return all[middle];
        }  
        if(left>=right)           
            return left;
        if (all[middle]<=n){     
            step1++;
            return binarySearth(all, middle, right, n);
        }
        else{
            step1++;
            return binarySearth(all, left, middle, n);
        }
            
        
    }
   
     public static void main(String[] args) {
        
         int element, element1;
    Scanner scan = new Scanner(System.in);
    System.out.println("Please, enter the deap of masiv");
    int a = scan.nextInt(); 
    int mas[] = new int[a];
    int mas1[] = new int[a];
    for(int i = 0; i<mas.length; i++){
        mas[i] = (int)(30*Math.random()-100);
        mas1[i] = (int) (-30+Math.random()*5);
    }
    
    
     for(int i = 0; i < mas.length; i++)
    System.out.print(mas[i]+" ");
     System.out.println();
     System.out.println("Please, enter the find element 1");
    System.out.println();
    
    element = scan.nextInt();
    
    
    int find = findElement(mas, element);
    System.out.println("Find element is " + find);
    System.out.println("Step for found = " + step);
    
    

    Arrays.sort(mas1);
    
    for(int i = 0; i<mas1.length; i++)
        System.out.print(mas1[i]+" ");
     System.out.println();
    System.out.println("Please, enter the find element 2");
    System.out.println();
    element1 = scan.nextInt();
    
    System.out.println("Find element is " + binarySearth(mas1, 0, mas1.length, element1));
    System.out.println("Step for found = " + step1);
    }
        
        
        
}
    
