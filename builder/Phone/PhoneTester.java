package builder.phone;

import java.util.Arrays;

public class PhoneTester{
	public static void main(String[] args){
		String[] apps = {"YikYak"};
		Phone.PhoneBuilder phoneBuilder = new Phone.PhoneBuilder("Tyler Droll", "123-456-7890", "Apple").canText(true).hasGPS(true).supportsApps(true).apps(apps);
		Phone phone = phoneBuilder.build();
		System.out.println(phone.toString());

		phoneBuilder = new Phone.PhoneBuilder("Mike", "012-345-6789", "Apple");
		phone = phoneBuilder.build();
		System.out.println(phone.toString());

		phoneBuilder = new Phone.PhoneBuilder("Pi", "314-159-2653", "Android").canText(true).hasGPS(true);
		phone = phoneBuilder.build();
		System.out.println(phone.toString());
	}
}