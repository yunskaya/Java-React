
public class Main {

	public static void main(String[] args) {
				
				String courses[] = {"java","React", "sql"};
				//USER
				User user = new User("Yunus", "Kaya", "yunusky38@outlook.com", "yunusKaya", "password");
				
				//INSTRUCTOR
				Instructor instructor = new Instructor("Engin", "Demiroð", "engindemirog@gmail.com", "engindemirog","engndmr",courses);
				
				//STUDENT
				Student student = new Student("Hasan", "Kaya", "hsnkyqgmail.cm", "hasnky","12345",courses );
						
				//USER MANAGER
				UserManager userManager = new UserManager();
				
				userManager.add(user);
			
				
				//INSTRUCTOR MANAGER
				InstructorManager instructorManager = new InstructorManager();
				
				instructorManager.add(instructor);
				
				//STUDENT MANAGER
				StudentManager studentManager = new StudentManager();
				
				studentManager.add(student);
	}

}
