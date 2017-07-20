package prototype;

import java.util.Hashtable;

public class AvatarCache{
	private static Hashtable<String, Avatar> avatarMap = new Hashtable<String, Avatar>();

	public static Avatar getAvatar(String warriorClass){
		if(avatarMap.containsKey(warriorClass.toUpperCase())){
			System.out.println("\t" + warriorClass + " is cached");
			Avatar cachedAvatar = avatarMap.get(warriorClass.toUpperCase());
			return (Avatar) cachedAvatar.clone();	// Return clone of Avatar
		} else {
			System.out.println("Accessing Avatar Database...");
			if(warriorClass.equalsIgnoreCase("ORC")){
				Avatar orc = new Orc();
				avatarMap.put("ORC", orc); 
				System.out.println("\tRetrieved: ORC");
				return orc;
			} else if(warriorClass.equalsIgnoreCase("ELF")){
				Avatar elf = new Elf();
				avatarMap.put("ELF", elf);
				System.out.println("\tRetrieved: ELF");
				return elf;
			}
		}
		return null;
	}
}
