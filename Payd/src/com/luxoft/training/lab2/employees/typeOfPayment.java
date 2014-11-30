package com.luxoft.training.lab2.employees;

public class typeOfPayment {
    private String payment;

    public typeOfPayment(String a){
        switch(a){
            case "monthPayment": {
                                
                                monthPayment mp = new monthPayment("dfsd");              
                                payment = mp.printMonthPayment();
                                break;
                                  }
                case "HorleyPayment": {
                                 //новый клас почас опл                                  break;
                                  break;
                                  }
                    case "month_persentOfSailPayment": {
                                  //новый класс опл
                                  break;
                                  }
                        case "persetOfSailPayment": {
                                  // новый клас опл
                                  break;
                                  }
                        default: System.out.println("Error!");
                        
        }    
    }
    public String printTypeOfPayment(){
        return  "\nPeyment: " + payment;
    }
}