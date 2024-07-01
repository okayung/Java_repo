package java_05.car;

public class LightCar extends Car {

	
	private double discountOffer; // 경차 할인율	

	
	public LightCar() {
		
	}
	
	public LightCar(String model, int wheel, int seat, String fuel, double discountOffer) {
		super(model, wheel, seat, fuel);
		this.discountOffer = discountOffer;
	}

	public String carInfo() {
		String result ="";
		

		
		result+= "[차종] " + model+ "\n";
		result+= "[휠] " + wheel+ "\n";
		result+= "[최석수] " + seat+ "\n";
		result+= "[연료] " + fuel+ "\n";
		result+= "[할인율] " + discountOffer  + "\n";
		
		return result;
	}
	
	
	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
}
