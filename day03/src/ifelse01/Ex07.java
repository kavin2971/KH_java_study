package ifelse01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		

		int month = 6;
		int temp  = -10;
				
		if (month >= 3 && month <=5) {
			System.out.println("봄");
			
		} else if (month >= 6 && month<=8) {
			System.out.println("여름");
		
			if(temp >= 40) {
				System.out.println("폭염경보");
				
			} else if(temp >= 35) {
					System.out.println("폭염주의보");
				
			} 
		
		}
		
		else if (month >=9 && month <=11) {
			System.out.println("가을");
		}
		
		else if (month ==1 || month ==2 || month ==12) {
			System.out.println("겨울");
		 
		  if(temp <= -20 ) {
				System.out.println("한파경보");
		  }	else if(temp <= -10) {
				System.out.println("한파주의보");
		  }
		}
		
	}
}
