package casting02;

public class Opercasting03 {

	public static void main(String[] args) {
		// 
		byte b1 = 10;
		byte b2 = 30;
		
		 //int 형보다 작은 자료형을 연산하면 int로 자동형 변환
		int int1 = b1 + b2;
		byte b3 = (byte)(b1 +b2); //명시적 형변환
		
	    short s1 = 34;
	    short s2 = 54;
	    
	    int int2 = s2 - s1;
	    int int3 = s1 * b1;
	    
	    char c1 = '&';
	    char c2 = 'a' + 3;
	    
	    int c3 = c1+c2;
	    
	    System.out.println(int1);
	    System.out.println(int2);
	    System.out.println(int3);
	    System.out.println(c3);
	    
	    long long1 = 1234345345345L;	   
	    long c4 = long1 * c3;
	    
	    System.out.println(c4);
	    
	    
	    float f1 = 3.15f; //f를 붙이지 않으면 double로 인식해서 오류
	  //float f1 = (float)3.15;
	    
	    float f2 = f1 + c3;
	    
	    System.out.println(f2);
	    

	}

}
