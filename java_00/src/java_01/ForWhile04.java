package java_01;

public class ForWhile04 {

	public static void main(String[] args) {

		// 1~9단까지 구구단을 모두 출력해 보세요.
		
		// while 문 활용
		System.out.println("====== [ while문 ] 구구단 ==========");
		
		int dan =1;
		while(dan <= 9) {
			System.out.println("while " + dan + "단");
			
			int hang= 1;
			
			while (hang <= 9) {
				int result = 0;
				result = dan*hang;
				System.out.println(dan+ " * " + hang + " = " + result);
				
				hang++;
			}
			dan++;
			System.out.println();
			
		}
		
	
		
		
		// for 문 활용
		System.out.println("====== [ for문 ] 구구단 ==========");
		
		for (int dan1=1; dan1<=9;dan1++) {
			System.out.println("for " + dan1 + "단");
			for (int hang=1; hang<=9; hang++) {
				int result = 0;
				result = dan1 * hang;
				System.out.println(dan1+ " * " + hang + " = " + result);
			
		}
		
		
		
//		int dan =1;
//		if(dan >= 1 && dan <10) {
//		for (int i=1; i<=9; i++) {
//			int result = 0;
//			result = dan * i;
//			System.out.println(dan+ " * " + i + " = " + result);
		}
		
		}
		

		
	}

