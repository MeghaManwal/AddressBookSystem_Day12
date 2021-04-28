package com.addressbooksystem.utils;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class AddressBookOperations {
	
	static Scanner s=new Scanner(System.in);
	
	public static void addAddressBook(Hashtable<String, List<Person>> addressBooks) {
		 System.out.println("Add new AddressBook");
    	 String bookName = s.nextLine();
 		 addressBooks.put(bookName, new ArrayList<Person>());
	}
	
	public static void editAddressBook(Hashtable<String, List<Person>> addressBooks) {
		    System.out.println("Enter the name of the AddressBook you want to Edit");
   	        String bookName1 = s.nextLine();
   	        
   	        if(addressBooks.containsKey(bookName1)) {
		    List<Person> persons = addressBooks.get(bookName1);
		    int choice;
		    do{
			    System.out.println(" Enter 1 to Add Contact\n Enter 2 to Edit Contact\n Enter 3 to Delete Contact\n Enter 4 to Exit\n");
			    choice=s.nextInt();
			    switch (choice)
				{
					case 1:
						System.out.println("Enter the Number of Contacts you would like to add");
						int n=s.nextInt();
						for(int i=0;i<n;i++) {
						PersonInfoOperations.addContact(persons);
						}
						break;
					case 2:			
						PersonInfoOperations.EditContact(persons);
						break;
					case 3:
						PersonInfoOperations.DeleteContact(persons);
						break;
					case 4:
						System.exit(0);
						break;
						
				 }
		       }
		       while(choice != 0);
   	           }
   	           else {
   	        	   System.out.println("Invalid AddressBook Name!Not exist");
		       }
	}
}
