package Project;

import java.util.Objects;

public class University {
    //Encapsulation
    private String name;
    private String location;

    public University(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public University() {
        this.name = "Narxoz University";
        this.location = "Almaty";
    }
    //encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    // Override toString
    @Override// Polymorphism: Method Overriding
    public String toString() {
        return "University{name='" + name + "', location='" + location + "'}";
    }
    // Override equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University)) return false;
        University that = (University) o;
        return Objects.equals(name, that.name) && Objects.equals(location, that.location);
    }
    // Override hashCode
    @Override
    public int hashCode() {//unique Hashmap
        return Objects.hash(name, location);
    }
}