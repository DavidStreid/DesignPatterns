package Structural.adapter;

public class Linux implements Platform{
	public Linux(){}
	public void run(String platform, String program){
		System.out.println(String.format("Running %s on %s", program, platform));
	}
}