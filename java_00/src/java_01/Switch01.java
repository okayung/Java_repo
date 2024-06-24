package java_01;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// -----------------------------------------------------
		// Scanner를 통해 1부터 5까지의 숫자를 입력 받아 영문으로 변환
		// 
		// [ 결과 예시 ] 1 은 one 입니다.
		// -----------------------------------------------------

		System.out.print("숫자를 입력해 주세요. (1부터 5까지만 가능) : ");
		int num = sc.nextInt();

		String engNum = "";

		switch (num) {
		case 1 :
			engNum = "one";
			break;
		case 2 :
			engNum = "two";
			break;
		case 3 :
			engNum = "three";
			break;
		case 4 :
			engNum = "four";
			break;
		case 5 :
			engNum = "five";
			break;
		default : //case를 설정하지 않은 값들은 모두 default로 빠짐.
			engNum = "변환 범위 X";
			break;
		}

		System.out.println(num + " 은(는) " + engNum + " 입니다.");
		System.out.println();

		
		// -----------------------------------------------------
		// Scanner를 통해 성별 정보를 입력 받아 남성 / 여성을 출력
		// 
		// 입력값은 대문자 또는 소문자 또는 기호(+, -)
		// -----------------------------------------------------
		
		System.out.println("성별을 입력하세요. (m / M / f / F / + / - )");
		System.out.print(" >> ");

		String gerder = sc.next();
		
		switch (gerder) {
			
		case "m" : case "M ": case "+" :
			System.out.println(" 남성입니다");
			break;
	
		case "f" : case "F" : case "-" :
			System.out.println(" 여성입니다");
			break;
		default :
			System.out.println("잘못된 입력입ㄴ다");
			break;
	}
		
		
		// -----------------------------------------------------
		// 1~12의 정수를 입력 받아 해당 월의 계절을 출력
		// 
		// 3, 4, 5 : 봄
		// 6, 7, 8 : 여름
		// 9, 10, 11 : 가을
		// 12, 1, 2 : 겨울
		// -----------------------------------------------------

		System.out.println("해당 월을 입력하세요.");
		
		String season = sc.next();
		
		switch (season) {
		
		case ("12") : case ("1") : case ("2") :
			System.out.println("겨울");
			break;
		
		case ("3") : case ("4") : case ("5") :
			System.out.println("봄");
			break;
		
		case ("6") : case ("7") : case ("8") :
			System.out.println("여름");
			break;
			
		case ("9") : case ("10") : case ("11") :
			System.out.println("가을");
			break;
		default :
			System.out.println("잘못된 입력입ㄴ다");
			break;
			
		}

		sc.close();

	}

}