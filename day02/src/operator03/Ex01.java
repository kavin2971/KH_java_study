package operator03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 사용자로 부터 숫자 2개를 입력받아
		//사칙연산과 몫, 나머지를 출력하시오.
		
		Scanner scan = new Scanner(System.in);
//		// 외워야한다
//		
//		
//      System.out.println("1번째 숫자를 입력하세요.");
//      int num1 = scan.nextInt();
//              
//                  // 외워야한다
//      System.out.println("2번째 숫자를 입력하세요.");
//      int num2 = scan.nextInt();
//      
//      System.out.println(num1+"+"+num2+"="+(num1+num2));
//      System.out.println(num1+"-"+num2+"="+(num1-num2));
//      System.out.println(num1+"*"+num2+"="+(num1*num2));
//      System.out.println(num1+"/"+num2+"="+((double)num1/num2));
//      System.out.println(num1+"/"+num2+"의 몫은 "+num1/num2);
//      System.out.println(num1+"/"+num2+"의 나머지는 "+num1%num2);
//      
//    		  Scanner scan1 = new Scanner(System.in);
//    		  System.out.println("알파벳 a를 누르세요");
//    		  String str = scan1.nextLine(); 
//    		  char ch = str.charAt(0);
//    		  
//    		  if (ch == 'a')
//    			  System.out.println(" 올바르게 입력하셨습니다.");
//    		  else 
//    			  System.out.println(" 잘못 입력하셨습니다. 다시 입력하세요.");
		
		int score= 49;			;
		
		if (score>=90)
		System.out.println("Great!");
		else if (score >= 70)
		System.out.println("Nice!");
		else if (score >= 50)
	    System.out.println("Good");
		else 
			System.out.println("fail");
		
	}

}
