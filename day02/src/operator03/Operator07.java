package operator03;

import java.util.Scanner;

public class Operator07 {

	public static void main(String[] args) {
		int x, y, z;
		int absX, absY, absZ;
		// int signX, signY, signZ;
//정답		
		x=40;
		y=-9;
		z=0;
//		
//		absX = x >= 0 ? x:-x;
//		System.out.println(absX);
//		absY = y >= 0 ? y:-y;
//		System.out.println(absY);
//		absZ = z >= 0 ? z:-z;
//		System.out.println(absZ);
		
//		String signX = x>0 ? "+" + x : ""+x;
//		System.out.println(signX);
//		String signY = y>0 ? "+" + y : ""+y;
//		System.out.println(signY);
//		String signZ = z>0 ? "+"+z : (z==0 ? ""+z : ""+z); 
//		System.out.println(signZ);
//		

		
		
 //char 로 외따옴표를 사용해도 된다. 단, 3개의 식이 동일해야한다.
		String strX = (x > 0) ? "+"+x : ""+x;
		String strY = (y > 0) ? "+"+y : ""+y;
		String strZ = (z > 0) ? "+"+z : ""+z;

		System.out.println(strX);
		System.out.println(strY);
		System.out.println(strZ);
		
		// 비트연산자

        //  00000011 ->  3     00000011 ->  3     00000011 ->  3 
		// &00001010 -> 10    |00001010 -> 10    ^00001010 -> 10    ~00000011 ->  3
		//  00000010 ->  2     00001011 -> 11     00001001 ->  9     11111100 ->
		
		// 비트이동 시프트 연산자
		//     <<
        //  00001111 -> 15
        //	   <<
        //  00011110 -> 30
        //	   <<
        //  00111100 -> 60
		
		//     >>
        //  00011110 -> 30
        //	   >>
        //  00001111 -> 15
        //	   >>
        //  00000111 ->  7   마지막 1은 사라진다.
		
	    // 부호비트는 시프트 되지 않는다
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("글자를 입력하세요 " );
				String Str = scan.nextLine();
				
				System.out.println("소수점을 입력하세요");
				Double dou = (double) scan.nextInt();
				
				System.out.println(dou);
				
				
	}

}
