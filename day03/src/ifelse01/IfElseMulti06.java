package ifelse01;

public class IfElseMulti06 {

	public static void main(String[] args) {
		//
		
		int score = 90;
				
				if (score <=100) { // 100 ~ 마이너스까지
					if (score >=60) { // 100~60
						if (score >=90)
							System.out.println("A학점");
						else if (score >=80)
							System.out.println("B학점");
						else if (score >=70)
							System.out.println("C학점");
						else if (score >=60)
							System.out.println("D학점");
					
				}else if (score >= 0) {//0~59
					
						System.out.println("F학점");
				}else
						System.out.println("점수는 0점 미만이 될수없습니다.");


	} else {
		System.out.println("점수는 100점 이상이 될수 없습니다.");
	}

 }
}