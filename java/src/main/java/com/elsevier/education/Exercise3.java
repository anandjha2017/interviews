package com.elsevier.education;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	public static class Person {
	
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		//HashCode should not return random number for the same state of the object
		//This can break equals & hashcode contracts
		public int hashCode() {
			return id;
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}