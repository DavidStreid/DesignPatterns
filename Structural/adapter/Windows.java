package Structural.adapter;

public class Windows implements Platform{
	public Windows(){}
	public void run(String platform, String program){
		System.out.println(String.format("Running %s on %s", program, platform));
	}
}