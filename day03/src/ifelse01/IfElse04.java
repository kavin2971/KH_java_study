package ifelse01;

public class IfElse04 {

	public static void main(String[] args) {
		int  score = 20;
		
		if (score >= 90)
		System.out.println("A학점");
		else if (score >= 80)
			System.out.println("B학점");
		else if (score >= 70)
			System.out.println("C학점");
		else if (score >= 60)
			System.out.println("D학점");
		else if (score >= 40)
			System.out.println("F학점");
		else
			System.out.println("....");
		
		int mon = 12;
		if (mon >= 3 && mon <=5)
			System.out.println("봄");
		else if (mon >= 6 && mon<=8)
			System.out.println("여름");
		else if (mon >=9 && mon <=11)
			System.out.println("가을");
		else //if (mon ==1 || mon ==2 || mon ==12)
			System.out.println("겨울");

	
	}

}
