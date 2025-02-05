import Project.*;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
//        UniversityManager manager = new UniversityManager();
//
//        // Add courses
//        manager.addCourse(new Course("Calculus", 101, 5));
//        manager.addCourse(new Course("Political science", 102, 3));
//        manager.addCourse(new Course("Linear Algebra", 103, 4));
//
//        // Add professors
//        manager.addProfessor(new Professor("John Doe", "john.doe@example.com", 10));
//        manager.addProfessor(new Professor("Jane Smith", "jane.smith@example.com", 8));
//
//        // Add universities
//        manager.addUniversity(new University("AITU", "Astana"));
//        manager.addUniversity(new University("KBTU", "Almaty"));
//        University uni = new University("KBTU", "Almaty");
//        System.out.println(uni);
//
//        // Filtering
//        System.out.println("Courses with credits >= 4:");
//        manager.filterCoursesByCredits(4).forEach(System.out::println);
//
//        // Searching
//        System.out.println("\nSearching for Professor 'John Doe':");
//        System.out.println(manager.searchProfessorByName("John Doe"));
//
//        // Sorting
//        System.out.println("\nUniversities sorted by name:");
//        manager.sortUniversitiesByName().forEach(System.out::println);
//
//        //ExchangeUniversity
//        System.out.println("\n=== Exchange University Program ===");
//        ExchangeUniversity exchangeUni = new ExchangeUniversity("AITU", "Astana", "Alice Johnson", "MIT", 3.9);
//        System.out.println(exchangeUni);
//
//        // updated info
//        exchangeUni.setStudentName("Bob Smith");
//        exchangeUni.setCurrentUniversity("Harvard");
//        exchangeUni.setGpa(3.8);
//
//        System.out.println("Updated: " + exchangeUni);
//
//        ExchangeUniversity anotherExchangeUni = new ExchangeUniversity("AITU", "Astana", "Bob Smith", "Harvard", 3.8);
//
//        System.out.println("Universities are equal: " + exchangeUni.equals(anotherExchangeUni));




        // Establish the database connection
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("db_connection", "postgres", "nazerke07");

        // Create tables with new names
//        db.create_table_university(conn, "University");
//        db.create_table_professor(conn, "Professor");
//        db.create_table_course(conn, "Course");

        // Insert
        Professor professor = new Professor("Alexandr", "alexandr@example.com", 5);
        Course course = new Course("Calculus", 101, 3);
        University university = new University("Harvard", "Cambridge, MA");

        db.insert_row_professor(conn, "Professor", professor);
        db.insert_row_course(conn, "Course", course);
        db.insert_row_university(conn, "University", university);

        // Update
        db.update_professor_email(conn, "Professor", 1, "new_email@example.com");
        db.update_course_credits(conn, "Course", 1, 4);
        db.update_university_location(conn, "University", 1, "Boston, MA");

        // Read data from the tables
        db.read_professor_data(conn, "Professor");
        db.read_course_data(conn, "Course");
        db.read_university_data(conn, "University");

        // Delete a row
//        db.delete_professor_by_id(conn, "Professor", 1);
//        db.delete_course_by_id(conn, "Course", 1);
//        db.delete_university_by_id(conn, "University", 1);
    }
}