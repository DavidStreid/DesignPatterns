package builder.outfit;

public class FormalOutfitBuilder implements OutfitBuilder {
	public FormalOutfitBuilder(){}

	private Outfit formalOutfit = new Outfit("FORMAL OUTFIT");
	@Override
	public void buildBottoms(){
		formalOutfit.setBottoms("Slacks");
	}
	@Override
	public void buildShirt(){
		formalOutfit.setShirt("Dress Shirt");
	}
	@Override
	public void buildJacket(){
		formalOutfit.setJacket("Blazer");
	}
	@Override
	public void buildShoes(){
		formalOutfit.setShoes("Loafer");
	}
	@Override
	public void buildAccessory(){
		formalOutfit.setAccessory("Tie");
	}

	@Override
	public Outfit getOutfit(){
		return formalOutfit;
	}
}