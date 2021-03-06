package com.addressbooksystem.utils;

import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] args) {
		
			int option;
			Hashtable<String, List<Person>> addressBooks = new Hashtable<String, List<Person>>(); 
			do {
			System.out.println(" Enter 1 to Add AddressBook\n Enter 2 to Edit AddressBook\n Enter 3 to SearchInAddressBook ForCity\n Enter 4 to SearchInAddressBook ForState\n Enter 5 to Exit\n");
			option=s.nextInt();
			switch(option) {
			   case 1:
			 		 AddressBookOperations.addAddressBook(addressBooks);
			    	 break;
			   case 2:
			    	 AddressBookOperations.editAddressBook(addressBooks); 
			         break;
			   case 3:
			    	 AddressBookOperations.searchInAddressBookCity(addressBooks); 
			         break; 
			   case 4:
			    	 AddressBookOperations.searchInAddressBookState(addressBooks); 
			         break;       
			   case 5:
				     System.exit(0);
				     break;
		    }
			}
		    while(option != 0); 	    
	}
		     
}	

	
