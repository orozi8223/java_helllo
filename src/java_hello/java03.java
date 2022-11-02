package java_hello;

public class java03 {
	public static void main(String[] args) {
		
		System.out.println("7.0 == 7 : " + (7.0 == 7));
		System.out.println("7.0 != 7 : " + (7.0 != 7));
		
		int num1 = 11;
		int num2 = 22;
		int num3 = 77;
		boolean result;
		
		result = (1<num1) && (num1<100);
		System.out.println("1초과 100미만인가? : " + result);
		
		result = ((num2 % 2) == 0) || ((num2 % 3) == 0);
		System.out.println("2 또는 3의 배수인가? : " + result);
		
		result = !(num1 != 0);
		System.out.println("0인가? : " + result);
		
		result = ((num3 % 7) == 0) && ((num3 % 11) == 0) && ((num3 % 2) == 0);
		System.out.println("7의 배수이고, 11의 배수이고, 짝수인가? : " + result);
	}
}
