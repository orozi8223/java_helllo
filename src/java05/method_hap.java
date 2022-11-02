package java05;

public class method_hap {
	public static void main(String[] args) {
		
		System.out.println(getHap(100));
		
	}
	
	public static int getHap(int num1) {
		
		int sum = 0;
		for (int i = 1; i <= num1; i++) {
			sum += i;
		}
		return sum;
	}	
}
