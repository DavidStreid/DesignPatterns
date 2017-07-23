package builder.outfit;

public class Outfit{
	private String type;
	private String bottoms;
	private String shirt;
	private String jacket;
	private String shoes;
	private String accessory;

	public Outfit(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}

	public String getBottoms(){
		return bottoms;
	}
	public void setBottoms(String bottoms){
		this.bottoms = bottoms;
	}
	public String getShirt(){
		return shirt;
	}
	public void setShirt(String shirt){
		this.shirt = shirt;
	}
	public String getJacket(){
		return jacket;
	}
	public void setJacket(String jacket){
		this.jacket = jacket;
	}
	public String getShoes(){
		return shoes;
	}
	public void setShoes(String shoes){
		this.shoes = shoes;
	}
	public String getAccessory(){
		return accessory;
	}
	public void setAccessory(String accessory){
		this.accessory = accessory;
	}

	public String toString(){
		return type + "\n\tBottoms: " + bottoms 
					+ "\n\tShirt: " + shirt 
					+ "\n\tJacket: " + jacket 
					+ "\n\tShoes: " + shoes
					+ "\n\tAccessory: " + accessory;
	}
}