package com.elsevier.education;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**

TODO: Make this class immutable.
Added final in class so that class can not be extended 
*/
public final class Exercise1 {

	public static class Person {
		
		//Set is mutable so need to make final & deep copy in constructor 
		//so that nothing can be changed externally 
		private final Set<String> phoneNumbers;
		//String is already immutable do not need to do anything below
		private String firstName;
		private String lastName;
		
		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			
			this.firstName = firstName;
			this.lastName = lastName;
			//Deep copy
			this.phoneNumbers = phoneNumbers.stream().collect(Collectors.toSet());

		}
		//Removed all the setters method so that nothing can be set externally
		public Set<String> getPhoneNumbers() {
			return phoneNumbers.stream().collect(Collectors.toSet());
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
	}
}