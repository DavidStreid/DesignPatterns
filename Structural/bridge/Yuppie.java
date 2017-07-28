package Structural.bridge;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Yuppie implements Cook {
	private List<String> fridgeFood;

	public Yuppie(){
		System.out.println("WARNING: YUPPIE");
		fridgeFood = new ArrayList<String>();
	}
	public void groceryShop(List<String> ingredients){
		System.out.println("Yelping nearest Whole Foods");
		System.out.println(String.format("Found %s in the same aisle", listIngredients(ingredients)));
		fridgeFood.addAll(ingredients);
	}
	public void cook(){
		System.out.println("Ordering DoorDash");
	}
	public String listIngredients(List<String> ingredients){
		String list = ingredients.stream()
						.map(Object::toString)
    	                .collect(Collectors.joining(", "));
    	return list;
	}
}