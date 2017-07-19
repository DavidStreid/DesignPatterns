package singleton;

import java.util.Date;

public class UserSession{
	private static int userId;
	private static int count;
	private static String name;
	private static String role;
	
	// Creates new instance of UserSession on class load
	private static UserSession instance;

	// Constructor - can't be publically instantiated
	private UserSession(){
		System.out.println("Inside constructor");

		userId = (int)(new Date().getTime()/1000);
		name = "David";
		role = "Backend Engineer";
		
		System.out.println("\tNew User Created: " + Integer.toString(userId) +
			"\n\tName: " + name +
			"\n\tRole: " + role);
		count = 1;
	}

	public static UserSession getInstance(){
		System.out.println("Inside getInstance()");

		// Double-Checked locking of Singleton Constructor
		// Alternative is to synchronize constructor method, but will reduce throughput
		if(instance == null){
			synchronized(UserSession.class){
				if(instance == null){
					instance = new UserSession();
				}
			}
		}

		count++;
		System.out.println("\tRetrieving User Instance: " + Integer.toString(userId) +
			"\n\tName: " + name + "\tRole: " + role);

		return instance;
	}

	public static void editName(String newName){
		count++;
		name = newName;
		System.out.println("New Name: " + newName);
	}

	public static void editRole(String newRole){
		count++;
		role = newRole;
		System.out.println("New Role: " + newRole);
	}
}
