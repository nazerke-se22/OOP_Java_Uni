package Project;

public class University {
    private String Name;
    private String Location;

    public University(String Name,String Location){
        this.Name=Name;
        this.Location=Location;
    }

    public String getName(){
        return Name;
    }
    public void setName(String Name){

        this.Name=Name;
    }
    public String getLocation(){

        return Location;
    }
    public void setLocation(String Location){

        this.Location=Location;
    }

    public void displayUniversity(){
        System.out.println("Name: "+Name);
        System.out.println("Location: "+Location);
    }
}

