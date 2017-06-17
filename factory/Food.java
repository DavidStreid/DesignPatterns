package factory;

import java.util.Calendar;
import java.util.Date;

public abstract class Food{
	String name;
	String foodGroup;
	int daysToExpire;
	
	public abstract void getEaten();

        public void checkExpirationDate(){
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.DAY_OF_YEAR, daysToExpire);
                Date date = calendar.getTime();

                System.out.println("\tEXPIRATION: " + date);
        }	
}
