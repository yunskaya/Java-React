
public class Student extends User {
	String[] Courses;
	
	public Student(String firstName, String lastName, String email, String username, String password,String[] Courses) {
		super(firstName, lastName, email, username, password);
		this.Courses=Courses;
	}
}
