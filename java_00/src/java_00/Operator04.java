package java_00; 

public class Operator04 {
	public static void main(String[] args) {

		/*
		 * [ 당신의 선택은? 치킨 vs 소 ]
		 * 
		 * 입력받을 변수는 1 또는 2
		 * 1번은 닭 vs 2번은 소
		 * 닭은 치킨 vs 소는 스테이크
		 * 
		 * 결과물 예시 : 가져오신 동물은 닭이므로, 치킨을(를) 요리하겠습니다.
		 * 결과물 예시 : 가져오신 동물은 소이므로, 스테이크을(를) 요리하겠습니다.
		 * 
		 */
		
		int i = 1;
		
		boolean flag = true;
		
		String str1 = " ";
		String str2 = " ";
		
		str1 = (i == 1  && i < 2 ) ? "닭" : "소";
		str2 = (i == 1 && i < 2 ) ? "치킨" : "스테이크";
		
		System.out.println("가져오신 동물은 " + str1 + "이므로, " + str2 + "을 요리하겠습니다");
		
		
		
		
		/*
		 * [ 홀짝 감별기 ]
		 * 
		 * 입력받은 변수의 값이 홀이냐 짝이냐를 구분
		 *  
		 * 결과물 예시 : 입력하신 숫자 3은(는) 홀수입니다.
		 * 결과물 예시 : 입력하신 숫자 8은(는) 짝수입니다.
		 * 
		 */

		int num1 = 3;
		int numResult;
		String num2 ="";
		numResult = num1 % 2;
	
		
		num2 = (numResult == 1) ? "홀수" : "짝수";
	
		
		System.out.println("입력하신 숫자 "+ num1 + "는" +num2 +" 입니다");
		
		
		float f = 10.11123f;
		System.out.println(f);
		
		/*
		 * 평균값구하기
		 * 
		 *  입력값 : 국어,영어, 수학
		 *  조건1) : 국어,영어, 수학 점수의 평균을 구하여 85점 이상이면 합격/미만이면 불합격
		 *  조건2) 평균 점수는 소수점까지 표시
		 *  
		 *  결과물 예시
		 *  당신의 국어점수는 85점입니다
		 *  당신의 영어점수는 90점입니다
		 *  당신의 수학점수는 61점입니다
		 *  
		 *  당신의 평균점수는 78.33이고, 불합격입니다
		 *   
		 */
		
		String stre1 = "국어";
		String stre2 = "영어";
		String stre3 = "수학";
		
		float inte1 = 85;
		float inte2 = 90;
		float inte3 = 61;
		float intResult;
		intResult = (inte1 + inte2 + inte3)/3;
		
		String intResult2;
		intResult2 = (intResult > 85) ? "합격" : "불합격";
		
		
		System.out.println("당신의" + stre1 +"점수는 " + inte1 +"점입니다");
		System.out.println("당신의" + stre2 +"점수는 " + inte2 +"점입니다");
		System.out.println("당신의" + stre3 +"점수는 " + inte3 +"점입니다");
		
		
		System.out.println("당신의 평균점수는 " + intResult+" 이고, " + intResult2 +" 입니다");
		
		
		
		
		int p1 = 85;
		int p2 = 90;
		int p3 = 61;
		String p5 = "";
		
		float p4 = (float)(p1+p2+p3)/3;
		//float p4 = (p1+p2+p3/3.0f;
		//double p4 = (p1+p2+p3)/3.0;
		
		p5 = ( p4 > 85 ) ? "합격" : "불합격";		
		
		System.out.println("당신의 평균점수는 " + p4+" 이고, " + p5 +" 입니다");
		
		
		
		
		
	


	}
}
