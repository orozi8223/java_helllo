package java_hello;

class Consutants {

	public static void main(String[] args) {
		//반지름이 10인 원의 넓이를 구하는 프로그램을 짜시오.
		
		/*
		 * double PI = 3.14; //Math를 사용하면 얘는 쓸모가 없어짐
		 */		double radius = 10.0;
				
		System.out.println(Math.PI * radius * radius);
		
		
		float fl = 0.1f;
		long l = 10L;
		
		float result = fl + l;
		System.out.println(result);
		
		/*
		 * short sh1 = 10; 
		 * short sh2 = 20;
		 * 
		 * short sh3 = (short) (sh1 + sh2); //형 변환
		 */		
		
		char sh1 = 'A';
		short sh2 = 1;
		
		char sh3 = (char) (sh1 + sh2);
						// 65     1
		System.out.println(sh3);
		
		
		int a=3;
		int b=4;
		
		
		/*
		 * double c = a/(double)b; //명시적 형변환
		 */		
		double c = (double)(a/b); //연산을 먼저하기 때문에 안됨
		System.out.println(c);
		/*
		 * a 방에 3 b방에 4 c방에 연산 3/4가 cpu에 오는데 실질적으로 값은 0.75를 내뱉지만 내부적으로 형변환 법칙에 의해 0이 리턴됨
		 * int/int니까 정수부분인 0이 리턴 거기서 더블이니까 정수가 실수로 형변환 되어서 0.0이 리턴
		 */
		
	}
	
		

}
