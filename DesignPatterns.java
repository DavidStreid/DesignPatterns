import singleton.UserSession;
import factory.Fridge;
import factory.Food;

public class DesignPatterns{
	public static void main(String[] args){
		demoSingleton();		
		demoFactory();	
	}
	private static void demoSingleton(){
		System.out.println("****************\nSINGLETON DESIGN\n****************");
		// Initializes instance - Calls constructor
		UserSession userSession = UserSession.getInstance();
		userSession.editName("Jacob");
		userSession.editRole("Frontend Engineer");
		// Constructor is not called
		userSession.getInstance();	
	}
	private static void demoFactory(){
		System.out.println("**************\nFACTORY DESIGN\n**************");
		Fridge fridge = new Fridge();
		Food food = fridge.grabSomethingToEat("fruit");
		food.getEaten();
		food = fridge.grabSomethingToEat("takeout");
		food.checkExpirationDate();
		food.getEaten();
	}
}
