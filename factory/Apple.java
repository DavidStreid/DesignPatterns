package factory;

public class Apple extends Food{
	public Apple(){
		name = "Apple";
		foodGroup = "Fruit";
		daysToExpire = 7;
		System.out.println("APPLE");
	}
	public void getEaten(){
		System.out.println("\tCRUNCH");
	}
}
