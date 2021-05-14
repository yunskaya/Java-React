package lessonHomework;

public class Main {

	public static void main(String[] args) {
		Student student=new Student(1,"test Student","test@mail.com","test123");


		
		System.out.println(student.fullname);
		System.out.println(student.mail);
		System.out.println(student.password);
	
		Course course=new Course(1, "Java React", "2530");
		System.out.println(course.courseName);
		
		CourseManager manager=new CourseManager();
		manager.addToCourse(student);

		manager.deleteFromCourse(student);

	}

}
