package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer yunus = new IndividualCustomer();
		yunus.customerNumber = "123123";
		
		CorparateCustomer hepsiBurada = new CorparateCustomer();
		hepsiBurada.customerNumber = "123456";
		
		UnionCustomer abc = new UnionCustomer();
		abc.customerNumber = "789789";
		
		CustomerManger customerManager = new CustomerManger();
		customerManager.add(hepsiBurada);
		customerManager.add(yunus);
		customerManager.add(abc);
		
		
		Customer[] customers = {yunus, hepsiBurada, abc};
		
		customerManager.addMultiple(customers);
		
	}

}
