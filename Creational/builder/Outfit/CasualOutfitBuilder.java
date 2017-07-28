package Creational.builder.outfit;

public class CasualOutfitBuilder implements OutfitBuilder{
	public CasualOutfitBuilder(){}

	private Outfit casualOutfit = new Outfit("CASUAL OUTFIT");

	public void buildBottoms(){
		casualOutfit.setBottoms("Jeans");
	}
	public void buildShirt(){
		casualOutfit.setShirt("Graphic-Tee");
	}
	public void buildJacket(){
		casualOutfit.setJacket("Hoodie");
	}
	public void buildShoes(){
		casualOutfit.setShoes("Sneakers");
	}
	public void buildAccessory(){
		casualOutfit.setAccessory("Baseball Cap");
	}
	public Outfit getOutfit(){
		return casualOutfit;
	}
}