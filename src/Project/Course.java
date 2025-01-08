package Project;

public class Course {
    private String CourseName;
    private int Code;
    private int Credits;

    public Course(String CourseName, int Code,int Credits){
        this.CourseName=CourseName;
        this.Code=Code;
        this.Credits=Credits;
    }
    public Course(){
        this.CourseName="Inroduction to programming";
        this.Code=1451;
        this.Credits=5;
    }

    public String getCourseName(){
        return CourseName;
    }
    public void setCourseName(String CourseName){
        this.CourseName=CourseName;
    }
    public int getCode(){
        return Code;
    }
    public void setCode(int Code){
        this.Code=Code;
    }
    public int getCredits(){
        return Credits;
    }
    public void setCredits(int Credits){
        this.Credits=Credits;
    }
    public void displayCourse(){
        System.out.println("Name: "+CourseName);
        System.out.println("Code: "+Code);
        System.out.println("Credits: "+Credits);
    }
}