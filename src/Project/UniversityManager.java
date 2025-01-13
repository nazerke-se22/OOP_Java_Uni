package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class UniversityManager {
    private List<University> universities= new ArrayList<>();
    private List<Professor> professors= new ArrayList<>();
    private List<Course> courses= new ArrayList<>();

    public void addCourse(Course course){
        courses.add(course);
    }
    public void addProfessor(Professor professor){
        professors.add(professor);
    }
    public void addUniversity(University university){
        universities.add(university);
    }
    // Filtering
    public List<Course> filterCoursesByCredits(int minCredits) {
        return courses.stream()
                .filter(course -> course.getCredits() >= minCredits)
                .collect(Collectors.toList());
    }

    // Searching
    public Professor searchProfessorByName(String name) {
        return professors.stream()
                .filter(professor -> professor.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    // Sorting
    public List<University> sortUniversitiesByName() {
        return universities.stream()
                .sorted(Comparator.comparing(University::getName))
                .collect(Collectors.toList());
    }
}
