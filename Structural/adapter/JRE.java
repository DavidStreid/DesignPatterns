package Structural.adapter;

// Concrete class implementing instance of Adaptor class, JVM
public class JRE implements Platform {
	JVM jvm;

	@Override 
	public void run(String platform, String program){
		jvm.run(platform, program);
	}
}