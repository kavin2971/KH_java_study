package calendar01;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDate05 {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalTime now = LocalTime.now();
		LocalDate day = LocalDate.ofEpochDay(19419);
		
		System.out.println(day);
		System.out.println(today);
		System.out.println(now);
		
		System.out.println(today);
		System.out.println(today.getYear()+"년");
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue()+"월");
		System.out.println(today.getDayOfMonth()+"일");
	
		System.out.println("365일 중 "+today.getDayOfYear()+"일");
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getDayOfWeek().getValue());
		System.out.println("이달은 총 "+today.lengthOfMonth()+"일까지 있다");
		System.out.println("올해는 총 "+today.lengthOfYear()+"일");
		System.out.println("올해 윤년 : "+today.isLeapYear());
		
		LocalDate endDay = LocalDate.of(2023, 7, 20);
		System.out.println(endDay);
		
	}	
	

}