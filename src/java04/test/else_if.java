package java04.test;

public class else_if {
	public static void main (String[] args) {
		
		int kor = 63;
		int eng = 88;
		int math = 70;
		
		int sum = kor + eng + math;
		double avg = sum / 3;
		
		if (avg >= 90) {
			System.out.println("수");
		}
		else if (avg >= 80) {
			System.out.println("우");
		}
		else if (avg >= 70) {
			System.out.println("미");
		}
		else if (avg >= 60) {
			System.out.println("양");
		}
		else {
			System.out.println("가");
		}
	}
}
