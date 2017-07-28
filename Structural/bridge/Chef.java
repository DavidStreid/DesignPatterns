package Structural.bridge;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Chef implements Cook {
	private List<String> availableIngredients;
	public Chef(){
		System.out.println("HOORAY A CHEF");
		availableIngredients = new ArrayList<String>();
	}
	public void groceryShop(List<String> ingredients){
		availableIngredients.addAll(ingredients);
		System.out.println(String.format("Finding the freshest %s", listIngredients(ingredients)));
		
	}
	public void cook(){
		System.out.println("Cooking something delicious!");
	}
	public String listIngredients(List<String> ingredients){
		String list = ingredients.stream()
						.map(Object::toString)
    	                .collect(Collectors.joining(", "));
    	return list;
	}
}