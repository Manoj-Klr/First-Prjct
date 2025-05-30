package practice.concepts;

public class NestedIfDemo {

	public static void main(String[] args) {
		
		int a = 40;
		int b = 20;
		int c = 30;
		
		if ((a<b) && (a<c)) {
			System.out.println("Smaller value is " +a);
		}
		else if (b<c) {
			System.out.println("Smaller value " +b);
		}
		
		else {
			System.out.println("Smaller value is " +c);
		}

	}

}
