package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger loggers[]= {new DatabaseLogger(),new FileLogger(),new SmsLogger()};
		CustomerManager customerManager =new CustomerManager(loggers);
		Customer yunus=new Customer(1, "yunus", "kaya");
		customerManager.add(yunus);
	}

}
