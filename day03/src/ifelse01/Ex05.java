package ifelse01;

import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자 입력 ");
//		int num = scan.nextInt();
		
//		if (num == 0)
//			System.out.println(" 0 ");
//		else if (num > 0)
//			System.out.println(" 양수 ");
//		else if (num < 0)
//			System.out.println(" 음수 ");
//		
		
		int score = 100;
		
		if (0>score || score>100)
			System.out.println("점수는 0 ~ 100 사이 입니다. 값을 다시 입력하세요.");
		
		else if (score <=100 && score >=90)
		System.out.println("A학점");
		else if (score < 90 && score >=80)
		System.out.println("B학점");
		else if (score < 80 && score >=70)
		System.out.println("C학점");
		else if (score < 70 && score >=60)
		System.out.println("D학점");
		else 
		System.out.println("F학점");
		
		
		
				
		

	}

}
