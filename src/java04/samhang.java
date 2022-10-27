package java04;

public class samhang {
	public static void main (String[] args) {
		
		int num1 = 50;
		int num2 = 100;
		
		int big;
		int diff;
		
		big = (num1 > num2) ? num1 : num2;
		System.out.println("큰 수" + big);
		
		diff = ((num1 - num2) < 0) ? -(num1 - num2) : (num1 - num2);
		System.out.println("두 수의 차" + diff);
		diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		System.out.println("두 수의 차" + diff);
		
		
		if (num1 > num2) {
			System.out.println("큰 수" + num1);
		} else {
			System.out.println("큰 수" + num2);
		}
		
		if ((num1 - num2) < 0) {
			System.out.println("두 수의 차" + -(num1 - num2));
		} else {
			System.out.println("두 수의 차" + (num1 - num2));
		}
	}
}
