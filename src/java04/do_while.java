package java04;

public class do_while {
	public static void main (String[] args) {
		
		int num = 0;
		
		do {
			System.out.println("I Like Java" + num);
			num++;
		} while (num < 5);
	}
}

//do-while문은 조건이 끝에 있기 때문에 무조건 한번은 출력한다.
//while문은 조건이 위에 있기 때문에 조건을 충족하지 않으면 출력하지 않는다.
