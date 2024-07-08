package parkingmng;

import java.util.Scanner;

public class ParkingService {

	public static ParkingDAO parkingDAO;

	public static Scanner sc = new Scanner(System.in);
	public ParkingService() {
		parkingDAO = new ParkingDAO();
	}
	public void startProgem() {

		while(true) {

			int menu = printMenu();

			switch(menu){
			case 1 : 
				inParking();
				break;

			case 2 : 
				outParking();
				break;

			case 3 : 
				System.out.println("시스템을 종료합니다.");
				System.exit(0); // 시스템 명령어 
				break;

			default :
				System.out.println("메뉴 번호를 확인 후 다시 입력해 주세요.");
				break;
			}
		}
	}

	public int printMenu() {
		System.out.println("[ 주차장 현황 ]");
		System.out.println();

		String[][] parkingSpace = parkingDAO.selectParking();

		for(int i=0; i<parkingSpace.length; i++) {

			for(int j=0; j<parkingSpace[i].length; j++) {
				if (parkingSpace[i][j] == null) {
					System.out.print(" □ " + parkingDAO.parkingNum[i][j]+" : "+parkingSpace[i][j]+"\t\t");
				} else {
					System.out.print(" ■ " + parkingDAO.parkingNum[i][j]+" : "+parkingSpace[i][j]+"\t\t");
				}
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("원하는 메뉴를 선택해주세요");
		System.out.println("1)주차 2)출차 3)종료 ");
		int menu = sc.nextInt();

		return menu;

	}

	public void inParking() {

		String[][] parkingSpace = parkingDAO.selectParking();

		System.out.println("주차 위치 선택");
		System.out.println("(예시) 주차공간선택 - 1");

		int location = sc.nextInt();
		String locationStr = String.valueOf(location);

		if (location < 1 || location > parkingDAO.ROW * parkingDAO.COL) {
			System.out.println("주차 위치를 잘못 입력하셨습니다");
			System.out.println("처음부터 다시 시작하세요");


		} else if (parkingDAO.selectParkingSpace(locationStr) != null) {
			System.out.println("이미 다른 차량이 주차되어있습니다");
			System.out.println("처음부터 다시 시작하세요");

		} else {

			System.out.print("차량번호를 입력하세요 (에 : 20가 1234) : ");
			String carNum = sc.next();

			System.out.print("차량번호가" +carNum + " 맞습니까?( y / n )");
			String confirm = sc.next();

			if("y".equals(confirm)) {
				//parkingSpace[locationRow-1][locationCol-1] = carNum; //0부터 시작하게 되어서 -1을 설정해줘야 함
				parkingDAO.insertParking(locationStr, carNum);
				System.out.println("주차 완료");
			} else {
				System.out.println("처음부터 다시 시작하세요");
			}
		}
	}
	public void outParking() {

		//String[][] parkingSpace = parkingDAO.selectParking();

		System.out.print("주차위치를 입력하세요: ");
		String locationStr = sc.next();

		boolean flag =parkingDAO.deleteParking(locationStr);
		//System.out.println(">>>>>>>>>>>" + flag);
		
		if(flag) {
			System.out.println("출차 완료 안녕히 가세요");
		} else {}
		//parkingDAO.deleteParking(locationStr);
		System.out.println("주차된 차량이 없습니다 안녕히가세요");

	}	

}
	// 차량번호 출차
	//String[][] parkingSpace = parkingDAO.selectParking();
	//
	//System.out.print("차량 번호를 입력해 주세요. : ");
	//String number = sc.next();
	//
	//int count = 0;
	//
	//for (int i=0; i<parkingSpace.length; i++) {
	//	for (int j=0; j<parkingSpace[i].length; j++) {
	//
	//		if (number.equals(parkingSpace[i][j])) {
	////			parkingSpace[i][j] = null;
	//			parkingDAO.deleteParking(i, j);
	//			System.out.println("출차 완료!! 안녕히 가세요.");
	//			break;
	//		} else {
	//			count++;
	//		}
	//
	//	}
	//}
	//
	//if (count == parkingDAO.ROW * parkingDAO.COL) {
	//	System.out.println("차량이 존재하지 않습니다.");
	//	System.out.println("차량 번호 확인 후 다시 시도해 주세요.");
	//}
	//}



