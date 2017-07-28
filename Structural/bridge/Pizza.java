package Structural.bridge;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Pizza extends Meal {
	List<String> ingredients;
	public Pizza(Cook cook){
		super(cook);
		ingredients = new ArrayList<String>(Arrays.asList("Dough", "Cheese", "tomato sauce"));
	}
	public void prepare(){
		cook.groceryShop(ingredients);
		cook.cook();
	}
}