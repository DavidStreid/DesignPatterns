package Creational.builder.phone;

import java.util.Arrays;
import java.util.ArrayList;

/* 	
	Telescoping Constructor Method of creating instances
	Mandatory Fields are passed in by constructor and additional fields are set in methods
*/
public class Phone{
	// Mandatory
	private String owner;
	private String number;
	private String brand;
	// Optional
	private Boolean canText;
	private Boolean hasGPS;
	private Boolean supportsApps;
	private String[] apps;

	// Constructor based on phoneBuilder instance
	private Phone(PhoneBuilder phoneBuilder){
		this.owner = phoneBuilder.owner;
		this.number = phoneBuilder.number;
		this.brand = phoneBuilder.brand;
		this.canText = phoneBuilder.canText;
		this.hasGPS = phoneBuilder.hasGPS;
		this.supportsApps = phoneBuilder.supportsApps;
		this.apps = phoneBuilder.apps;
	}

	public String toString(){
		ArrayList<String> features = new ArrayList<String>();
		if(canText != null){
			String texting = ("Texting: " + (canText? "Yes" : "No"));
			features.add(texting);
		}
		if(hasGPS != null){
			String gps = "GPS: " + (hasGPS? "Yes" : "No");
			features.add(gps);
		}
		if(supportsApps != null){
			String appList = "Apps: " + (supportsApps? String.join(", ",Arrays.asList(apps)) : "None");
			features.add(appList);
		}
		return owner + "\n\tBrand: " + brand + ", Number: " + number + ". " + String.join(", ", features);
	}

	// API for Setting fields of phone
	public static class PhoneBuilder{
		private String owner;
		private String number;
		private String brand;
		private Boolean canText;
		private Boolean hasGPS;
		private Boolean supportsApps;
		private String[] apps;

		// Sets mandatory fields
		public PhoneBuilder(String owner, String number, String brand){
			this.owner = owner;
			this.number = number;
			this.brand = brand;
		}

		// Methods to set optional fields
		public PhoneBuilder canText(Boolean canText){
			this.canText = canText;
			return this;
		}
		public PhoneBuilder hasGPS(Boolean hasGPS){
			this.hasGPS = hasGPS;
			return this;
		}
		public PhoneBuilder supportsApps(Boolean supportsApps){
			this.supportsApps = supportsApps;
			return this;
		}
		public PhoneBuilder apps(String[] apps){
			Boolean addApps = canText!=null? canText : false;
			if(addApps){
				this.apps = apps;
			} 
			return this;
		}

		public Phone build(){
			return new Phone(this);
		}
	}
}