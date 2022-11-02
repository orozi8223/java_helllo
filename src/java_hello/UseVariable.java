package java_hello;

public class UseVariable {

	public static void main(String[] args) {
		
		int num1; //int 데이터 타입 num1 변수  변수선언 인트+넘 데이타타입에는 크기가 반드시 있음 인트 크기 4byte=32bit / 용도 3개 정수 실수 주소
					//인트는 정수 32자리 / 그림을 그릴줄 알아야함 num1이라는 방 방이 32개 정수가 들어 갈 수 있는 4byte공간
					//공간을 만들고 num1 = 10 2진수로 변화해서 채워넣음
					//
		num1 = 10;
		
		int num2 = 20;
		int num3 = num1 + num2;
		System.out.println(num1 + " + " +num2+ " = " + num3);
	}

}
