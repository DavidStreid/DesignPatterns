package factory;

import java.util.Random;

public class Fridge{
	public Food grabSomethingToEat(String foodGroup){
		if(foodGroup==null) return null;
		Random rand = new Random();
		int randInt;
		if(foodGroup.equalsIgnoreCase("FRUIT")){
			randInt = rand.nextInt(2);
			switch(randInt){
				case 0: return new Apple();
				case 1: return new Banana();
				default: return null;
			}
		}
		return new TakeOut();
	}
}
