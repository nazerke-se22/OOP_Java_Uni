package Project;
import java.util.Objects;

public class Professor {
    private String name;
    private String email;
    private int experienceYears;

    public Professor(String name, String email, int experienceYears) {
        this.name = name;
        this.email = email;
        this.experienceYears = experienceYears;
    }

    public Professor() {
        this.name = "Default Professor";
        this.email = "default@gmail.com";
        this.experienceYears = 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return "Professor{name='" + name + "', email='" + email + "', experienceYears=" + experienceYears + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;
        Professor that = (Professor) o;
        return experienceYears == that.experienceYears && Objects.equals(name, that.name) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, experienceYears);
    }
}