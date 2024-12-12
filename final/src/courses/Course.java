package courses;



import java.util.*;


public class Course {
    public enum CourseType {
        MAJOR, MINOR, FREE_ELECTIVE
    }

    private static final Set<Course> courseRegistry = new HashSet<>();

    private String courseId;
    private String courseName;
    private int credits;
    private List<Teacher> instructors;
    private List<Student> students;
    private HashMap<Student, Mark> marks = new HashMap<>();
    private CourseType courseType;

    public Course() {
        this.instructors = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public Course(String courseId, String courseName, int credits, CourseType courseType) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.courseType = courseType;
        this.instructors = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }


    public boolean isFreeElectiveForSITE() {
        return this.courseType == CourseType.FREE_ELECTIVE;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credits=" + credits +
                ", courseType=" + courseType +
                ", instructors=" + instructors +
                ", students=" + students +
                '}';
    }
}
