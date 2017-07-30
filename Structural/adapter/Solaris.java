package Structural.adapter;

public class Solaris implements Platform{
	public Solaris(){}
	public void run(String platform, String program){
		System.out.println(String.format("Running %s on %s", program, platform));
	}
}