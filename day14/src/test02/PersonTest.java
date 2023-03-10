package test02;

class Person {
	
	private String name;
	private int age;
	
	Person() {}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : "+ age;
	}
	
}

public class PersonTest {
    public static void main (String[] args ) {
    	Person p1 = new Person();
    	Person p2 = new Person("홍길동", 25);
    	System.out.println(p2.getName());
    	
    	p1.setName("아무개");
    	
    	System.out.println("이름 : "+p2.getName()+", 나이 : "+p2.getAge());
    	System.out.println(p1.getName());
    	
    	
    	Person p3 = new Person("김지원", 23);
    	Person p4 = new Person("박성철", 31);
    	System.out.println("이름 : "+p3.getName()+", 나이 : "+p3.getAge());
    	System.out.println("이름 : "+p4.getName()+", 나이 : "+p4.getAge());
    	
    	System.out.println("--------------------");
    	System.out.println(p1);
    	System.out.println(p2);
    	System.out.println(p3);
    	System.out.println(p4);
    }
}