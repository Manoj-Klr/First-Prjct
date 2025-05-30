package practice.concepts;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter number");
		int num = sc.nextInt();
		int b = 20;
		sc.close();
		
		
		
		if (num < b) {
			System.out.println("smaller value is:"+num);
		}
		
		else {
			System.out.println("smaller value is:" +b);
		}

	}

}
