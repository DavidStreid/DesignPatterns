package Structural.bridge;

public abstract class Meal{
	Cook cook;
	public Meal(Cook cook){
		this.cook = cook;
	}
	public abstract void prepare();
}