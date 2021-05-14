
public class Instructor extends User {
	
	String[] courses;
	
	public Instructor(String firstName, String lastName, String email, String username, String password,String[] Courses) {
		super(firstName, lastName, email, username, password);
		this.courses=courses;
	}
	
	
	
}
