package java_hello;

public class Av {
//커밋테스트
	public static void main(String[] args) {
		
		int kor=94;
		int eng=72;
		int math=81;
		
		int hap = kor+eng+math;
		double avg = hap/(double)3;
		
				
		System.out.println("총점 " +hap+ "평균 " +avg+ "입니다.");
		
		int num1 = 7;
		int num2 = 3;
		
		/* int num3 = num1 + num2 */
		
		System.out.println("num1 + num2 = " +num1 + num2); // 앞에 있는 +부터 연산하기 때문에 두개의 타입이 다름 문자열과 숫자
															// 문자열이 앞에 오기 떄문에 앞에 있는 문자열에 맞춘것!!
															// 괄호를 치게되면 괄호가 우선순위가 높기때문에 괄호 안부터 연산
	}
}
