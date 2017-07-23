import java.lang.Math;

import singleton.UserSession;
import factory.*;
import prototype.*;
import objectPool.*;
import builder.outfit.*;
import builder.phone.*;

public class DesignPatterns{
	public static void main(String[] args) throws InterruptedException{
		demoSingleton();		
		demoFactory();
		demoPrototype();
		demoObjectPool();	
		demoBuilder();
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
	/*  Creates 10 "threads" made available in an object pool. 
		When used, they are placed in another set and made unavailable for future jobs. 
		When no threads are available, a new thread is created */
	private static void demoObjectPool() throws InterruptedException{
		System.out.println("*****************\nOBJECTPOOL DESIGN\n*****************");
		ThreadPool threadPool = ThreadPool.getPool();
		int threadLength;
		for(int i = 25; i>=0; i--){
			threadLength = 1 + (int) (Math.random()*2);
			threadPool.getThread(threadLength);	
		}
	}

	private static void demoBuilder() throws InterruptedException{
		System.out.println("**************\nBUILDER DESIGN\n**************");
		// STANDARD BUILDER METHOD
		System.out.println("STANDARD METHOD");
		// Formal Wear
		OutfitBuilder builder = new FormalOutfitBuilder();
		OutfitDirector director = new OutfitDirector(builder);
		director.build();
		Outfit formalOutfit = builder.getOutfit();
		System.out.println(formalOutfit.toString());

		// Casual Wear
		builder = new CasualOutfitBuilder();
		director = new OutfitDirector(builder);
		director.build();
		Outfit casualOutfit = builder.getOutfit();
		System.out.println(casualOutfit.toString());

		// Telescoping Method
		System.out.println("TELESCOPING METHOD");
		String[] apps = {"YikYak"};
		Phone.PhoneBuilder phoneBuilder = new Phone.PhoneBuilder("Tyler Droll", "123-456-7890", "Apple").canText(true).hasGPS(true).supportsApps(true).apps(apps);
		Phone phone = phoneBuilder.build();
		System.out.println(phone.toString());

		phoneBuilder = new Phone.PhoneBuilder("Mike", "012-345-6789", "Apple");
		phone = phoneBuilder.build();
		System.out.println(phone.toString());

		phoneBuilder = new Phone.PhoneBuilder("Pi", "314-159-2653", "Android").canText(true).hasGPS(true);
		phone = phoneBuilder.build();
		System.out.println(phone.toString());

	
	}
}
