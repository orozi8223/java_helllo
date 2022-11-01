 package Class;

public class StarPrint {

	public void printStar(int num) {

        for(int i=1; i<=num; i++) {

            for(int j=1; j<=i; j++) {

                System.out.print("*");

            }

            System.out.println();

        }	
	}
}