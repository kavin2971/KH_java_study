package staticVari02;

public class Product {
	
	static int count;
	int proNo = 20230000;
	
//	{
//		++count;     λμΌνλ€
//		proNo = count;
//	}
	Product(){
		++count;
		proNo += count;
	}

}
