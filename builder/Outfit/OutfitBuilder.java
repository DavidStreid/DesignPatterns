package builder.outfit;

public interface OutfitBuilder{
	public void buildBottoms();
	public void buildShirt();
	public void buildJacket();
	public void buildShoes();
	public void buildAccessory();
	public Outfit getOutfit();
}