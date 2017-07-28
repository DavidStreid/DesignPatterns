package Creational.builder.outfit;

public class OutfitDirector{
	private OutfitBuilder outfitbuilder;
	public OutfitDirector(OutfitBuilder outfitBuilder){
		this.outfitbuilder = outfitBuilder;
	}

	public void build(){
		outfitbuilder.buildBottoms();
		outfitbuilder.buildShirt();
		outfitbuilder.buildJacket();
		outfitbuilder.buildShoes();
		outfitbuilder.buildAccessory();
	}
}