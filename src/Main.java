 import Project.Course;
 import Project.Professor;
 import Project.University;


public class Main {
    public static void main(String[] args) {
        Professor professor1=new Professor("Alex","alex97@gmail.com",5);
        Professor professor2=new Professor("Sanzhar","sanzhar@gmail.com",3);
        Professor professor3=new Professor();
        System.out.println("Professor 1:");
        professor1.displayProfessor();
        System.out.println("Professor 2:");
        professor2.displayProfessor();
        System.out.println("Professor 3:");
        professor3.displayProfessor();

        Course course1=new Course("Calculus1",2115,5);
        Course course2=new Course("Linear algebra",3457,5);
        System.out.println("Course 1:");
        course1.displayCourse();
        System.out.println("Course 2:");
        course2.displayCourse();

        University university1=new University("AITU","Astana");
        University university2=new University("KBTU","Almaty");
        System.out.println("University 1:");
        university1.displayUniversity();
        System.out.println("University 2:");
        university2.displayUniversity();

        boolean sameCourseCredits = course1.getCredits() == course2.getCredits();
        System.out.println("Do the two courses have the same number of credits? " + sameCourseCredits);
    }
}