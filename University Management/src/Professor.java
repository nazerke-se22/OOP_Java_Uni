public class Professor {
    private String Name;
    private String Email;
    private int experienceYears;


    public Professor(String Name, String Email, int experienceYears) {
        this.Name = Name;
        this.Email = Email;
        this.experienceYears = experienceYears;
    }

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public String getEmail(){
        return Email;
    }
    public void setEmail(String Email){
        this.Email=Email;
    }
    public int getExperienceYears(){
        return experienceYears;
    }
    public void setexperienceYears(int experienceYears){
        this.experienceYears=experienceYears;
    }
    @Override
    public String toString(){
        return "Professor{Name="+Name+",Email="+Email+",experienceYears="+experienceYears+"}";

    }


}

