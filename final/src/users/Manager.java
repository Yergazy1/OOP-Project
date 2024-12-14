package classes;
import java.util.List;

import interfaces.CanViewCourses;
import interfaces.CanViewStudents;
import interfaces.CanViewTeachers;

public class Manager extends Employee implements CanViewTeachers, CanViewStudents, CanViewCourses{
	private List<Course> courses;
	private List<Teacher> teachers;
	private List<Student> students;
	private List<News> news;
	
	public Manager() {
        super();
    }
	
	public Manager(String id, String fullName, String email, String password) {
		super(id, fullName, email, password);
	}

	@Override
	public void viewCourses(List<Course> courses) {
        for (Course course : courses) {
            System.out.println(course);
        }
    }
	
	public void addCourse(Course course) {
		System.out.println("Course " + course.getCourseName() + " added.");
	}

	public void deleteCourse(Course course) {
	    System.out.println("Course " + course.getCourseName() + " deleted.");
	}

	public void manageCourses(Course course) {
	    System.out.println("Managing course: " + course.getCourseName());
	}
	 
	@Override
	public void viewStudents(List<Student> students) {
	    for (Student student : students) {
	    	System.out.println(student);
	    }
	}
	
	@Override
    public void viewTeachers(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void makeSchedule() {
        System.out.println("Schedule created.");
    }

    public void assignTeachersToCourse(Course course, List<Teacher> instructors) {
        for (Teacher teacher : instructors) {
            course.getInstructors().add(teacher);
            System.out.println("Assigned teacher " + teacher.getFullname() + " to course " + course.getCourseName());
        }
    }
    
    @Override
    public String logMessage() {
        return "Manager{" +
                "id='" + getId() + '\'' +
                ", fullName='" + getFullname() + '\'' +
                ", department='" + getDepartment() + '\'' +
                '}';
    }
}