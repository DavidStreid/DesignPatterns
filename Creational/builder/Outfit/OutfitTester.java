package Creational.builder.outfit;

public class OutfitTester{
	public static void main(String[] args){
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
	}
}