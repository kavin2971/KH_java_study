package ifelse01;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		System.out.println("영문 대소문자 또는 숫자 (0 ~ 9) 입력 :");
		
		String str = scan.nextLine();
		char ch = str.charAt(0);
			
		if ('0'<=ch && '9'>=ch){
		System.out.println(" 숫자 입니다");
		}
		if (('a'<=ch && 'z'>=ch)||('A'<=ch && 'Z'>=ch)){
			System.out.println(" 영문자 입니다");
		}
		
		
//if (str % 2 == 0)
//System.out.println("짝수");
//if (str % 2 == 1)
//	 System.out.println("홀수");

}
}