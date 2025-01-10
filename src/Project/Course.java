package Project;

import java.util.Objects;

public class Course {
    private String courseName;
    private int code;
    private int credits;

    public Course(String courseName, int code, int credits) {
        this.courseName = courseName;
        this.code = code;
        this.credits = credits;
    }

    public Course() {
        this.courseName = "Introduction to Programming";
        this.code = 1451;
        this.credits = 5;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course{courseName='" + courseName + "', code=" + code + ", credits=" + credits + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return code == course.code && credits == course.credits && Objects.equals(courseName, course.courseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, code, credits);
    }
}