package java05;

public class method_grade {
	public static void main (String[] args) {
		
		System.out.println( grade(avg(100,70,30)) );
		
	}
	
	public static double avg (int kor, int eng, int math) {
		return (kor + eng + math) / 3.0;
	}
	
	public static char grade (double avg) {
		
		char ch = ' ';
		
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
		
		return ch;
	}
}
