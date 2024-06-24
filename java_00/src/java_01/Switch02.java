package java_01;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// -----------------------------------------------------
		// Scanner를 통해 1~12 사이의 정수를 입력 받아 해당 월의 마지막 일자를 출력
		// 
		// [ 출력 결과 예시 ] 6월의 마지막 날짜는 30일 입니다.
		// -----------------------------------------------------

		System.out.println("해당 월을 입력하세요.");

		String month = sc.next();
		String result = "";

		switch (month) {

		case ("1") : case ("3") : case ("5") : case("7") : case ("8") : case ("10") : case ("12") :
			result = "마지막 날짜는 31일 입니다.";
		break;

		case ("2") : 
			result = "마지막 날짜는 28일 입니다.";
		break;

		case ("4") : case ("6") : case ("9") : case("11") :
			result = "마지막 날짜는 30일입니다";
		break;

		default :
			System.out.println("잘못된 입력입니다");
			break;	
		}
		System.out.println(month + "월은 " + result);


		// 동일한 조건식을 if문으로 작성해보기

		System.out.println("if문으로 해당 월을 입력하세요.");	

		int month1 = sc.nextInt();

		String result1 = "";

		if( month1 == 1 || month1 == 3 || month1 == 5 || month1 == 7 || month1 == 8 || month1 == 10 || month1 ==12){
			System.out.println("마지막 날짜는 31일 입니다.");

		} else if (month1 == 2) {
			System.out.println("마지막 날짜는 28일 입니다.");

		} else if (month1==4|| month1==6 || month1==8|| month1==9||month1==11) {
			result1 = "마지막 날짜는 30일 입니다.";
		} else {
			result1 = "잘못된 입력입니다";
		}

		System.out.println(result1);

	}

}
