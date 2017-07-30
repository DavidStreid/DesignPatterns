package Structural.adapter;

public class Mac implements Platform{
	public Mac(){}

	public void run(String platform, String program){
		System.out.println(String.format("Running %s on %s", program, platform));
	}
}	