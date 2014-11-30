package date;
public class Date {
    private int day;
    private int month;
    private int year;
	
        public Date(){
            day=1;
            month=1;
            year=1900;
        }

        public Date(int day,int month,int year){
            this.day=day;
            this.month=month;
            this.year=year;
        }
        
        public Date(Date copy){
            day=copy.day;
            month=copy.month;
            year=copy.year;
        }
	
        public void setDate(int day,int month, int year){
            this.day=day;
            this.month=month;
            this.year=year;
        }	
        
        public void incDay(int inc){
            while (inc >= 365) {inc = inc-365 ; year++;}
            
            if(month == 12){month=0; year++;};
            if(inc < 31){day += inc; return;} else if(inc >= 31){month++; inc -= 31;}
            if(inc < 28){day += inc; return;} else if(inc >= 28){month++; inc -= 28;}
            if(inc < 31){day += inc; return;} else if(inc >= 31){month++; inc -= 31;}
            if(inc < 30){day += inc; return;} else if(inc >= 30){month++; inc -= 30;}            
            if(inc < 31){day += inc; return;} else if(inc >= 31){month++; inc -= 31;}            
            if(inc < 30){day += inc; return;} else if(inc >  30){month++; inc -= 30;}            
            if(inc < 31){day += inc; return;} else if(inc >= 31){month++; inc -= 31;}            
            if(inc < 31){day += inc; return;} else if(inc >= 31){month++; inc -= 31;}
            if(inc < 30){day += inc; return;} else if(inc >= 30){month++; inc -= 30;}
            if(inc < 31){day += inc; return;} else if(inc >= 31){month++; inc -= 31;}
            if(inc < 30){day += inc; return;} else if(inc >= 30){month++; inc -= 30;}
            if(inc < 31){day += inc; return;} else if(inc >= 31){month++; inc -= 31;}
            }
        
        public void decDay(int inc){
            while (inc >= 365){inc = inc-365; year--; }

           if (month==0){month=12; year--;} 
           
           
          if(day==0){day=30; month--; }
            if(inc < 31){day -= inc; return;} else if(inc >= 31){month--; inc -= 31;}
            if(inc < 28){day -= inc; return;} else if(inc >= 28){month--; inc -= 28;}
            if(inc < 31){day -= inc; return;} else if(inc >= 31){month--; inc -= 31;}
            if(inc < 30){day -= inc; return;} else if(inc >= 30){month--; inc -= 30;}
            if(inc < 31){day -= inc; return;} else if(inc >= 31){month--; inc -= 31;}
            if(inc < 30){day -= inc; return;} else if(inc >  30){month--; inc -= 30;}
            if(inc < 31){day -= inc; return;} else if(inc >= 31){month--; inc -= 31;}
            if(inc < 31){day -= inc; return;} else if(inc >= 31){month--; inc -= 31;}
            if(inc < 30){day -= inc; return;} else if(inc >= 30){month--; inc -= 30;}
            if(inc < 31){day -= inc; return;} else if(inc >= 31){month--; inc -= 31;}
            if(inc < 30){day -= inc; return;} else if(inc >= 30){month--; inc -= 30;}
            if(inc < 31){day -= inc; return;} else if(inc >= 31){month--; inc -= 31;}

            }    

        public static int monthsCount(int d, int m, int y,int d2,int m2,int y2){
            return ((y2-y)*12)-(m)+m2;
        }

        public String printDate(){
            return String.valueOf(day+"."+month+"."+year); 
        }	
}