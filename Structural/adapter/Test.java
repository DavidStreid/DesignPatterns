public class Test {
	public Test(){}
	public static void main(String[] args){
		JVM jvm = new JVM();
		String program = "DesignPatterns.java";

		jvm.run("windows", program);
		jvm.run("mac", program);
		jvm.run("solaris", program);
		jvm.run("linux", program);
	}

}
