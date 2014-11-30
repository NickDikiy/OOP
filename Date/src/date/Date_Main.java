package date;

public class Date_Main {

	public static void main(String[] args) {
	Date date = new Date();
	Date date1 = new Date(1,10,1991);
	Date date2 = new Date(date1);
	
        System.out.println(date.printDate());
	System.out.println(date1.printDate());
	System.out.println(date2.printDate());
	
	date1.setDate(1,1,1900);
	System.out.println(date.printDate());
	
        date1.incDay(100);
	System.out.println("incDate: " + date1.printDate());
        
	date1.decDay(1);
        System.out.println("decDate: " + date1.printDate());
                
        System.out.println("Month late: " + date.monthsCount(23, 9, 1995, 23, 9, 1996));
	}

}