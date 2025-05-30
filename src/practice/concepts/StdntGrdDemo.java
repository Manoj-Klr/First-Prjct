package practice.concepts;

import java.util.Scanner;

public class StdntGrdDemo {

	public static void main(String[] args) {
		
		int stdntmrks;
		String stdntgrd = "";
		System.out.println("Enter Student Marks");
		
		// To read stdnt marks from console
		
		Scanner sc = new Scanner(System.in);
		stdntmrks = sc.nextInt();
		
		if(stdntmrks >=90) {
		stdntgrd = "A";
		}
		
		else if(stdntmrks >=80) {
			stdntgrd = "B";
		}
		else if(stdntmrks >=70) {
			stdntgrd = "C";
		}
		
		else {
			stdntgrd = "D";
		}
		System.out.println("Student Marks are" +stdntmrks);
		System.out.println("Student Grade is " +stdntgrd);

	}

}
