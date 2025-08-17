import java.util.ArrayList;

public class Course_lib {
    private ArrayList<Course> courses = new ArrayList<>();

    public void addCourse(Course course){
        courses.add(course);
    }
    
    public void listCourses(){
        for (Course c : courses) {
            System.out.println(c.toString());
        }
    }

    public Course searchCourse(String courseName){
        for (Course c : courses) {
        if (c.getCourseName().equalsIgnoreCase(courseName)) {return c; }
    }    
        return null;
    }

    public String assignTeacher(String cTitle, String cTeacherName) {
        Course cFound = searchCourse(cTitle);
        Course cChanged = cFound.toBuilder().cTeacher(cTeacherName).build();
        int idx = courses.indexOf(cFound);
        courses.set(idx, cChanged);
        return cChanged.toString();
    }

    public String changeActive(String cTitle, boolean cActive) {
        Course cFound = searchCourse(cTitle);
        Course cChanged = cFound.toBuilder().cActive(cActive).build();
        int idx = courses.indexOf(cFound);
        courses.set(idx, cChanged);
        return cChanged.toString();
    }


}

