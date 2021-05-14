package lessonHomework;

public class Student {

	 int id;
	 String fullname;
	 String mail;
	 String password;
	 
	public Student() {
		System.out.println("Empty Constructor worked.");
	}
	
	public Student(int id, String fullname,String mail, String password) {

		this.id=id;
		this.fullname=fullname;
		this.mail=mail;
		this.password=password;
	 
	}
	
	
}
