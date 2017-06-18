import singleton.UserSession;
import factory.*;
import prototype.*;

public class DesignPatterns{
	public static void main(String[] args){
		demoSingleton();		
		demoFactory();
		demoPrototype();	
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
	private static void demoPrototype(){
		System.out.println("****************\nPROTOTYPE DESIGN\n****************");
		AvatarCache avatarCache = new AvatarCache();
		System.out.println("Retrieving Orc & Elf for the first time");
		Avatar orc = avatarCache.getAvatar("orc");
		Avatar elf = avatarCache.getAvatar("elf");
		orc.setName("Sheila");
		elf.setName("Eugene");
		System.out.println("ORC: " + orc.getName());
		System.out.println("ELF: " + elf.getName());

		System.out.println("Retrieving another Orc & Elf");	
		Avatar orc2 = avatarCache.getAvatar("orc");
		Avatar elf2 = avatarCache.getAvatar("elf");
		orc2.setName("Orky");
		elf2.setName("Elfy");
		System.out.println("ORC: " + orc2.getName());
                System.out.println("ELF: " + elf2.getName());			
	}
}
