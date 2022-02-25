
/*
HackerRank's 30 Days of code
Day 12: Inheritance and Super keyword - Easy
*/

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
}

class Student extends Person{
	private int[] testScores;
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }
    
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public void calculate() {
        int sum = 0;
        for (int i : testScores) {
            sum += i;
        }
        sum /= testScores.length;

        // char grade = 
        //     sum >= 90 && sum <= 100 ? 'O' :
        //     sum >= 80 && sum < 90 ? 'E' :
        //     sum >= 70 && sum < 80 ? 'A' :
        //     sum >= 55 && sum < 70 ? 'P' :
        //     sum >= 40 && sum < 55 ? 'D' : 'T';
        
        System.out.println(
            sum >= 90 && sum <= 100 ? "O" :
            sum >= 80 && sum < 90 ? "E" :
            sum >= 70 && sum < 80 ? "A" :
            sum >= 55 && sum < 70 ? "P" :
            sum >= 40 && sum < 55 ? "D" : "T");
            
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = "Heraldo";
		String lastName = "Memelli";
		int id = 8135627;
		int[] testScores = new int[]{100, 80};
		
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
        System.out.print("Grade: ");
        s.calculate();
    }
}

/*

# test_case:

Input:
    Heraldo Memelli 8135627
    2
    100 80
Output: 
    Name: Memelli, Heraldo
    ID: 8135627
    Grade: O

*/