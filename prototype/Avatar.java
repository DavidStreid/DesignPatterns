package prototype;

public abstract class Avatar implements Cloneable {
	String name;
	String warriorClass;
	String lengthyBackStory;
	String weapon;
	int age;
	String attack;
	int attackDamage;
	int id;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
    public void attack(){
            System.out.println("Used " + weapon + " " + attack + ". Dealt " + Integer.toString(attackDamage) + " damage");
    }
    public void monologue(){
            System.out.println(lengthyBackStory);
    }
    // Override - Returns a clone of Avatar
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone(); 
	 	} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
		return clone;
	}
}

