package for01;

public class For01 {

	public static void main(String[] args) {
//반복문 : 여러번 반복하여 수행하고자 할때
		String str = "안녕하세요 KH정보교육원 입니다";
		System.out.println("안녕하세요 KH정보교육원 입니다");
		System.out.println("안녕하세요 KH정보교육원 입니다");
		System.out.println("안녕하세요 KH정보교육원 입니다");
		System.out.println("안녕하세요 KH정보교육원 입니다");
		System.out.println("=======================");
	// for (초기식; 조건식; 증감식)
    //     (int a =1; a<10; a+-1씩실행 10까지(9회 반복됨))
		for (int i = 1; i < 5; ++i ) {
			System.out.println("안녕하세요 KH정보교육원 입니다");
			System.out.println("=======================");
		}
		//한줄 이상의 경우 대괄호를 반드시 넣어준다
		
		for (int j=1; j<=5; j++)System.out.println(str);
		System.out.println("=======================");
		
		for (int i=1; i<=100; i++)
			
			System.out.println(i+". 안녕하세요 KH정보교육원 입니다");

	}

}
