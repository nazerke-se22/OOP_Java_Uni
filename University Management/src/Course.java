public class Course {
    private String Name;
    private int Code;
    private int Credits;

    public Course(String Name, int Code,int Credits){
        this.Name=Name;
        this.Code=Code;
        this.Credits=Credits;
    }
    public String getCourse() {
        return "Name: " + Name + "\nCode: " + Code + "\nCredits: " + Credits;
    }


    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
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
    @Override
    public String toString() {
        return "Course{name='" + Name + "', code=" + Code + ",  credits=" + Credits + "}";
    }
}


