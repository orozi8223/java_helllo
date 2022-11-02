package java05;

public class method_star {
	public static void main (String[] args) {
		
		countingStar(3);
		countingStar(7);
		
	}
	
	
	
	public static void countingStar(int num1) {
	
		for (int i = 1; i <= num1; i++) {
		
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}
