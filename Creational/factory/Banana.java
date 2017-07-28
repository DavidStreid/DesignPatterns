package Creational.factory;

public class Banana extends Food{
	public Banana(){
		foodGroup = "Fruit";
		name = "Banana";
		daysToExpire = 3;
		System.out.println("BANANA");
	}
	public void getEaten(){
		System.out.println("\tCHEW");
	}
}
