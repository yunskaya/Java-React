package inheritance;

public class CustomerManger {
	
	/*public void add(IndividualCustomer customer){
		System.out.println(customer.customerNumber + " added.");
	}

	public void add(CorporateCustomer customer){
		System.out.println(customer.customerN + " added.");
	}*/
	
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + "added.");
	}
	
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
}
