package java_05;

public class ExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 부모 클래스 생성자
//		Point point = new Point();
		
		Point point = new Point(1, 2);
		
		System.out.println("Point x값 : "+ point.getX());
		System.out.println("Point y값 : "+ point.getY());
		
		
		point.setX(10);
		point.setY(20);
		
		System.out.println("Point x값 : "+ point.getX());
		System.out.println("Point y값 : "+ point.getY());
		
		// 자식 클래스 생성자 - Point 클래스 상속받음
//		Circle circle = new Circle();
		
		Circle circle = new Circle(10, 20);
		
		System.out.println("circle x값 : "+ circle.getX());
		System.out.println("circle y값 : "+ circle.getY());
		
		
		circle.setX(100);
		circle.setY(200);
		
		System.out.println("circle x값 : "+ circle.getX());
		System.out.println("circle y값 : "+ circle.getY());
		
		
	}

}
