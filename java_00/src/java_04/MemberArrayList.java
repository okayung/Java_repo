package java_04;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberArrayList {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		ArrayList<String> memberArr = memberInsert();
		memberSelect(memberArr);
		/**
		 * [ 요구사항 ]
		 * 
		 *  1. 회원명을 입력받아 ArrayList를 생성하시오.
		 *  2. "그만" 이라고 입력하면 프로그램 종료
		 */

	}

	// 다섯명의 회원명을 입력받아 ArrayList 생성할 method
	public static ArrayList<String> memberInsert() {
		ArrayList<String> memberArr = new ArrayList<String>();
		String name = " ";
		
		while(true) {
			System.out.println("이름 : ");
			name = sc.next();
			
			if("그만".equals(name)) {
				break;
			} else {
				memberArr.add(name);
			}
		}
	
		System.out.println(" <<  회원 이름 입력 완료 >> ");

		return memberArr;
	}


	// 생성된 회원정보를 출력하는 method
	public static void memberSelect(ArrayList<String> args) {

		for(int i=0;i<args.size(); i++) {
			System.out.println("[ 회원 " + (i+1) + " ] 이름"+ args.get(i));
		}

	}
}