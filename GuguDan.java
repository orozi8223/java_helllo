package Class;

public class GuguDan {
	
	public void printGugu(int num) {
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
		}
	}
}
