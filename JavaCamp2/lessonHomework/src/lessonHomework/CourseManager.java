package lessonHomework;

public class CourseManager {
	public void addToCourse(Student student) {
		System.out.println(student.fullname +" enrolled in the course.");
		
	}
	
	public void deleteFromCourse(Student student) {
		System.out.println(student.fullname + "removed from the course.");
		
	}
}
