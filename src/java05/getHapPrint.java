package java05;

public class getHapPrint {
	public static void main (String[] args) {
		
		getHapPrint(10);
	
	}
	
	public static void getHapPrint (int num1) {
		
		int sum = 0;
		for (int i = 1; i <= num1; i++) {
			if(i != num1) {
				System.out.print(i + "+");
			} else {
				System.out.print(i + "=");
			}
			
			sum += i;
		}
		
		System.out.println(sum);
		
	}
}
