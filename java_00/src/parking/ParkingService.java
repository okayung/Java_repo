package parking;

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
		System.out.println("  1 2 3");

		String[][] parkingSpace = parkingDAO.parkingSpace;

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
		int menu = sc.nextInt();

		return menu;

	}

	public void inParking() {

		String[][] parkingSpace = parkingDAO.selectParking();

		System.out.println("주차 위치 선택");
		System.out.println("(예시) 세로 가로 - 2 1");

		int locationRow = sc.nextInt();
		int locationCol = sc.nextInt();

		if (locationRow > parkingDAO.ROW || locationCol > parkingDAO.COL) {
			System.out.println("주차 위치를 잘못 입력하셨습니다");
			System.out.println("처음부터 다시 시작하세요");


		} else if (parkingSpace[locationRow-1][locationCol-1] != null) {
			System.out.println("이미 다른 차량이 주차되어있습니다");
			System.out.println("처음부터 다시 시작하세요");

		} else {

			System.out.print("차량번호를 입력하세요 (에 : 20가 1234) : ");
			String carNum = sc.next();

			System.out.print("차량번호가" +carNum + " 맞습니까?( y / n )");
			String confirm = sc.next();

			if("y".equals(confirm)) {
				//parkingSpace[locationRow-1][locationCol-1] = carNum; //0부터 시작하게 되어서 -1을 설정해줘야 함
				parkingDAO.insertParking(locationRow,locationCol, carNum);
				System.out.println("주차 완료");
			} else {
				System.out.println("처음부터 다시 시작하세요");
			}
		}
	}
	public void outParking() {

		String[][] parkingSpace = parkingDAO.selectParking();

		System.out.print("차량번호를 입력하세요: ");
		String number = sc.next();

		int count =0; //

		for(int i=0; i<parkingSpace.length; i++) {
			for(int j=0; j<parkingSpace[i].length; j++) {

				if (number.equals(parkingSpace[i][j])) {
					//parkingSpace[i][j] = null;
					parkingDAO.deleteParking(i, j);
					System.out.println("출차 완료 안녕히 가세요");
					break;
				} else {
					count++;
				}	
			}
		}
		if(count == parkingDAO.ROW * parkingDAO.COL) {
			System.out.println("차량이 확인되지 않으니 다시 확인해 주세요");
			System.out.println();
		}


	}
}


