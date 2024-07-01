package java_05.customer;

public class ExMain {

	public static void main(String[] args) {
		
		// 일반 고객
		Coustomer customerLee = new Coustomer();
		customerLee.setCustomerId("mem_lee");
		customerLee.setCustomerName("Lee");
		
		System.out.println(customerLee.customerInfo());
		System.out.println(customerLee.calcRatio(10000));
		
		// VIP 고객
		VIPCoustomer customerKim = new VIPCoustomer();
		customerKim.setCustomerId("mem_kim");
		customerKim.setCustomerName("KIM");
		
		System.out.println(customerKim.customerInfo());
		
		// VIP 고객
		Coustomer customerPark = new VIPCoustomer();
		customerPark.setCustomerId("mem_park");
		customerPark.setCustomerName("Park");
		
		System.out.println(customerPark.customerInfo());

	}
}
