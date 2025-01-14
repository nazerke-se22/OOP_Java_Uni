import Project.*;

public class Main {
    public static void main(String[] args) {
        UniversityManager manager = new UniversityManager();

        // Add courses
        manager.addCourse(new Course("Calculus", 101, 5));
        manager.addCourse(new Course("Political science", 102, 3));
        manager.addCourse(new Course("Linear Algebra", 103, 4));

        // Add professors
        manager.addProfessor(new Professor("John Doe", "john.doe@example.com", 10));
        manager.addProfessor(new Professor("Jane Smith", "jane.smith@example.com", 8));

        // Add universities
        manager.addUniversity(new University("AITU", "Astana"));
        manager.addUniversity(new University("KBTU", "Almaty"));
        University uni = new University("KBTU", "Almaty");
        System.out.println(uni);

        // Filtering
        System.out.println("Courses with credits >= 4:");
        manager.filterCoursesByCredits(4).forEach(System.out::println);

        // Searching
        System.out.println("\nSearching for Professor 'John Doe':");
        System.out.println(manager.searchProfessorByName("John Doe"));

        // Sorting
        System.out.println("\nUniversities sorted by name:");
        manager.sortUniversitiesByName().forEach(System.out::println);

        //ExchangeUniversity
        System.out.println("\n=== Exchange University Program ===");
        ExchangeUniversity exchangeUni = new ExchangeUniversity("AITU", "Astana", "Alice Johnson", "MIT", 3.9);
        System.out.println(exchangeUni);

        // updated info
        exchangeUni.setStudentName("Bob Smith");
        exchangeUni.setCurrentUniversity("Harvard");
        exchangeUni.setGpa(3.8);

        System.out.println("Updated: " + exchangeUni);

        ExchangeUniversity anotherExchangeUni = new ExchangeUniversity("AITU", "Astana", "Bob Smith", "Harvard", 3.8);

        System.out.println("Universities are equal: " + exchangeUni.equals(anotherExchangeUni));
    }
}