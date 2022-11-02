package Class;

public class Grade {
	
	int sub1;
	int sub2;
	int sub3;
	
	public Grade (int sub1, int sub2, int sub3) {
		
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}	
	
	public void show() {
		
		int avg;
		avg = (sub1 + sub2 + sub3) / 3;
		
		System.out.println("평균은 "+ avg);
	}
}
