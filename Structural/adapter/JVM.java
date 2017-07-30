package Structural.adapter;

// Adaptor class Platforms - JRE runs
public class JVM implements Platform{
	Platform platform;
	public void setPlatform(String platform){
		if(platform.equalsIgnoreCase("windows")){
			this.platform = new Windows();
		}
		else if(platform.equalsIgnoreCase("mac")){
			this.platform = new Mac();
		}
		else if(platform.equalsIgnoreCase("linux")){
			this.platform = new Linux();
		} 
		else if(platform.equalsIgnoreCase("solaris")){
			this.platform = new Solaris();
		}
		else{
			System.out.println("Invalid Platform");
		}
	}

	public void run(String platform, String program){
		setPlatform(platform);
		this.platform.run(platform, program);		
	}
}
