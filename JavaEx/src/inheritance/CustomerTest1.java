package inheritance;
import externalEx.ProgramInfo;
public class CustomerTest1 {
	public static void main(String[] args) {
		ProgramInfo.print("상속실습", "박상종", "1.0");
		Customer customer1 = new Customer();
		customer1.customerID = 1111;
		customer1.customerName = "이순신";
		customer1.bonusPoint = 1000;
		System.out.println(customer1.showCustomerInfo());
		Customer customer2 = new VIPCustomer();
		customer2.customerID = 2222;
		customer2.customerName = "강감찬";
		customer2.bonusPoint = 10000;
		System.out.println(customer2.showCustomerInfo());
	}
}