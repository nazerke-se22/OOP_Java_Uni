package Project;

public class Professor {
    private String Name;
    private String Email;
    private int experienceYears;


    public Professor(String Name, String Email, int experienceYears) {
        this.Name = Name;//поля,парметр
        this.Email = Email;
        this.experienceYears = experienceYears;
    }
    public Professor(){
        this.Name = "Maqsat";
        this.Email = "maqsat@gmail.com";
        this.experienceYears = 7;
    }

    public String getName(){//возвращает значение определенного поля объекта
        return Name;
    }
    public void setName(String Name){//устанавливает значение определенного поля объекта

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

    public void displayProfessor(){//вывод и метод
        System.out.println("Name: "+Name);
        System.out.println("Email: "+Email);
        System.out.println("Experience Years: "+experienceYears);
    }
}
