package Lab4;

public class Faculty extends Employee {
    private String[] courses;

    Faculty(String inName, int inSalary, String[] inCourses) {
        super.name = inName;
        super.salary = inSalary;
        setCourses(inCourses);
    }

    public String getName() {
        return ("Professor " + name);
    }

    public String[] getCourses() {
        String[] temp = new String[courses.length];
        for (int i = 0; i < courses.length; i++) {
            temp[i] = courses[i];
        }
        return temp;
    }

    public String getCourseNames() {
        String courseNames = courses[0];
        for (int i = 1; i < courses.length; i++) {
            courseNames += (", " + courses[i]);
        }
        return courseNames;
    }

    public void setCourses(String[] addCourses) {
        String[] copy = new String[addCourses.length];
        for (int i = 0; i < addCourses.length; i++) {
            copy[i] = "" + (addCourses[i]);
        }
        courses = copy;
    }

    public String toString() {
        return (getName() + " teaches " + getCourseNames() + ".");
    }
}
