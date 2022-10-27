package java04.test;

public class gugudan {
	public static void main (String[] args) {
		
		for (int i = 2; i < 10; i++) {
			/*
			 * if (i % 2 == 1) { continue; } for (int j = 1; j < 10; j++) {
			 * System.out.println(i + " x " + j + " = " + (i*j)); }
			 */
			
			if (i % 3 == 0) {
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " x " + j + " = " + (i*j));
				}
			}
		}
	}
}
