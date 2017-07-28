package Creational.factory;

public class TakeOut extends Food{
	public TakeOut(){
		foodGroup = "???";
		name = "TakeOut";
		daysToExpire = 2;	
		System.out.println("TAKEOUT");
	}	
	public void getEaten(){
		System.out.println("\tCHOMPF");
	}
}
