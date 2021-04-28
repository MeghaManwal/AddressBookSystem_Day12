package com.addressbooksystem.utils;

  public class Person {
	
		   private String firstname;
		   private String lastname;
		   private String address;
		   private String phoneNumber;
		   private String emailId;
		    
			public String getFirstname() {
		        return firstname;
		    }
		    public void setFirstname(String name) {
		        this.firstname = name;
		    }
		    
		    public String getLastname() {
		        return lastname;
		    }
		    public void setLastname(String lastname) {
		        this.lastname = lastname;
		    }

		    public String getAddress() {
		        return address;
		    }
		    public void setAddress(String Address) {
		        this.address = Address;
		    }
		    public String getphoneNumber() {
		        return phoneNumber;
		    }
		    public void setphoneNumber(String phoneNumber) {
		        this.phoneNumber = phoneNumber;
		    }

		    public String getemail() {
		        return emailId;
		    }
		    public void setemail(String email) {
		        this.emailId = email;
		    }

		    @Override
		    public String toString() {
		       return " " + firstname + " " + lastname +" "+ address + " " + phoneNumber + " " + emailId +"";
		   }
		  
  }
