package exam;

public class Ex02_PrintExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intVal1 = 12;
		int intVal2 = 25;
		String strVal1 = "크리스마스";
		System.out.println(intVal1 + "월 " + intVal2 + "일은 " + strVal1 + " 입니다");
		
		int curYear = 2023;		
		float intf1 =72.893f;
		System.out.print("작년" + curYear + "년도 대학 합격룰은 ");
		System.out.println( intf1 + " 퍼센트 였습니다");
		
		int intVal3 = 100;
		int intVal4 = 10;
		int intResult = intVal3 + intVal4;
		System.out.print(intVal3 + "이라는 숫자에 " + intVal4 + "을 더하면 ");
		System.out.println(intResult + "이 됩니다");
		
		
		double intd1 = 3.141592653589793d;
		int intVal5 = 5;
		System.out.println("원주율은 " + intd1 + "이고, 반지름이 " + intVal5 + "인 원의 둘레는 " +(intd1*intVal5*2) + "입니다");
	    System.out.println("반지름이 " + intVal5 + "인 원의 넓이는 " + (intd1*intVal5*intVal5) +" 입니다");
	    
	 
	    char chard1 = '뷁';
	    int intstr7 =chard1;
	    System.out.println(chard1 +"의 문자번호는 " + intstr7);
		
	    float intf2 = 58.78945f;
	    int intssd1 = (int) intf2;
		System.out.println(intf2 + "를 버림 하면 " + intssd1 + " 입니다");
				
		/*
		 	int i = 72;
		char c = (char) i;
		System.out.println("72의 문자값: "+c);
		*/
		

	}

}
