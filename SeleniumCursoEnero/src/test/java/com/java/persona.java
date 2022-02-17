package com.java;

public class persona {

	private String firstName;
	private String lastName;
	private int edad;
	private boolean age;
	private String fullName;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean isTeen () {
	
		if (edad>12 && edad<20) {
			age=true;
		}else {
			age=false;
		}		
		return age;
	}
	public String getFullName() {
		 
		if(firstName.isEmpty()|| lastName.isEmpty()) {		    
			if (lastName.isEmpty()) {
		    	fullName= firstName;
		    }else {
		    	fullName= lastName;
		    }
			
		}else if(firstName.isEmpty()&& lastName.isEmpty()) {
			fullName = "Cadena Vacia";
		}else {
			fullName = firstName+" "+lastName;
		}
		
		return fullName;
	}
	
}
