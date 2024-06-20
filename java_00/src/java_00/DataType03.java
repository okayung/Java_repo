package java_00; 

public class DataType03 {

	public static void main(String[] args) {

		/*
		[ 강제형변환 ]
		 크기가 큰 데이터 타입의 자료를 작은 데이터 타입으로 변환할 때는
		 직접 변환할 자료형을 지정해 주어야 한다.
	 */
		
		
		// int -> char 강제형변환
		int i = 72;
		char c = (char) i;
		System.out.println("72의 문자값: "+c);

		// double -> int 강제형변환
		// 값의 손실이 발생할 수 있는 예시
		double d = 4.98765;
		int j = (int) d;
		j = j * 100;
		System.out.println("어떤 값이 나올까? : " + j); // 이 경우 소숫점이 전부 누락되어 4로 대입됨(값의 손실 발생)

		
		/*
         크기가 큰 데이터 타입의 값을 작은 데이터 타입으로 변환하려면
         반드시 형 변환 연산자(type casting operator): (type)를 사용하여 명시적으로
         형 변환을 진행해야 한다. (DownCasting)

         명시적으로 형 변환을 해야 하는 이유는, DownCasting의 경우
         저장 공간이 줄어들어 데이터 손실 및 전혀 다른 결과값을 도출할 가능성이 항상 존재하기 때문입니다.
         (overflow(양수쪽으로 터지는 것), underflow(음수쪽으로 터지는 것))
		 */
		
		
		// 자료형 기본인 int 끼리의 합
		int intVal1 = 100;
		int intVal2 = 200;
		
		System.out.println("두 숫자의 합은 ? " + intVal1 + intVal2); //괄호를 넣어서 먼저 계산할것을 지정해준다
		System.out.println("두 숫자의 합은 ? " + (intVal1 + intVal2));
		
		int intResult = 0;//숫자형의 기본값은 0부터 시작
		intResult = intVal1 + intVal2;
		
		System.out.println("두 숫자의 합은 ? " + intResult);
		
		
		// 문자와 문자의 결합
		String strVal1 = "2";
		String strVal2 = "2";
		
		System.out.println("문자 결합 : : " + strVal1 + strVal2);
		
		int intStr1 = 1;
		int intStr2 = 2;
		
		//strVal1 = (String) insStr1;
		strVal1 = String.valueOf(intStr1);
		strVal2 = String.valueOf(intStr2);
		
		System.out.println("문자 결합 : : " + intStr1 + intStr2);
		System.out.println("문자 결합 : : " + strVal1 + strVal2);
		
		
		// java String 을 int 로 변환
		String str1 = "1";
		Integer.parseInt(str1);
		System.out.println(Integer.parseInt(str1));
		
		int strint1 = Integer.parseInt(str1);
		int strint2 = 500;
		System.out.println("String int1 = " + strint1);
		System.out.println("int2 = " + strint2);
		System.out.println("String int1 + int2 = " + (strint1 + strint2));
		
		
		// java String 을 float 로 변환
		String str2 = "2.0";
		Float.parseFloat(str2);
		System.out.println(Float.parseFloat(str2));
		
		float strint3 = Float.parseFloat(str2);
		float strint4 = 0.456f;
		System.out.println("String int3 = " + strint3);
		System.out.println("int4 = " + strint4);
		System.out.println("String int3 + int4 = " + (strint3 + strint4));
		
		
		
		// java String 을 Double 로 변환
		String str3 = "3.0";
		Double.parseDouble(str3);
		System.out.println(Double.parseDouble(str3));
		
		double strint5 = Double.parseDouble(str3);
		double strint6 = 0.54d;
		System.out.println("String int5 = " + strint5);
		System.out.println("int6 = " + strint6);
		System.out.println("String int5 + int6 = " + (strint5 + strint6));
		
		
	}
}
