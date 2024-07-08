package parkingmng;

import java.util.Scanner;

public class ParkingMng {


	public static Scanner sc = new Scanner(System.in);

	static final int ROW = 4;
	static final int COL = 3; // 변하지 않는 상수형 변수선언
	//static final String RESULT = "성공!!";
	//static final double PIE = 3.14;

	public static void main(String[] args) {


		/*
		 * [주차관리 프로그램]
		 * 
		 * 주차장 구조
		 * 
		 *  □ □ □
		 *  □ □ □
		 *  □ □ □
		 *  □ □ □ 
		 *
		 * */

		String[][] parkingSpace = new String[ROW][COL];

		while(true) {

			System.out.println("[ 주차장 현황 ]");
			System.out.println();
			System.out.println("  1 2 3");



			for(int i=0; i<parkingSpace.length; i++) {
				System.out.print(i+1 +" " );

				for(int j=0; j<parkingSpace[i].length; j++) {
					if (parkingSpace[i][j] == null) {
						System.out.print("□ ");
					} else {
						System.out.print("■ ");
					}
				}

				System.out.println();
			}

			System.out.println();
			System.out.println("원하는 메뉴를 선택해주세요");
			System.out.println("1)주차 2)출차 3)종료 ");
			String menu = sc.next();

			switch(menu){
			case "1" : 
				System.out.println("주차 위치 선택");
				System.out.println("(예시) 세로 가로 - 2 1");

				int locationRow = sc.nextInt();
				int locationCol = sc.nextInt();

				if (locationRow > ROW || locationCol > COL) {
					System.out.println("주차 위치를 잘못 입력하셨습니다");
					System.out.println("처음부터 다시 시작하세요");

					break;
				}

				if (parkingSpace[locationRow-1][locationCol-1] != null) {
					System.out.println("이미 다른 차량이 주차되어있습니다");
					System.out.println("처음부터 다시 시작하세요");
					break;
				}

				System.out.print("차량번호를 입력하세요 (에 : 20가 1234) : ");
				String carNum = sc.next();

				System.out.print("차량번호가" +carNum + " 맞습니까?( y / n )");
				String confirm = sc.next();

				if("y".equals(confirm)) {
					parkingSpace[locationRow-1][locationCol-1] = carNum; //0부터 시작하게 되어서 -1을 설정해줘야 함
					System.out.println("주차 완료");
				} else {
					System.out.println("처음부터 다시 시작하세요");

					break;
				}

				break;

			case "2" : 
				System.out.print("차량번호를 입력하세요: ");
				String number = sc.next();

				int count =0; //

				for(int i=0; i<parkingSpace.length; i++) {
					for(int j=0; j<parkingSpace[i].length; j++) {

						if (number.equals(parkingSpace[i][j])) {
							parkingSpace[i][j] = null;
							System.out.println("출차 완료 안녕히 가세요");
							break;
						} else {
							count++;
						}	
//						System.out.println("count>> " + count);// count 되는거 확인용
					}
				}
				if(count == ROW * COL) {
					System.out.println("차량이 확인되지 않으니 다시 확인해 주세요");
					System.out.println();
				}


				break;

			case "3" : 
				System.out.println("시스템을 종료합니다.");
				System.exit(0); // 시스템 명령어 
				break;

			default :
				System.out.println("메뉴 번호를 확인 후 다시 입력해 주세요.");
				System.out.println();


			}

		}
	}
}


