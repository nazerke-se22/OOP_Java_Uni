//inheritance
package Project;

import java.util.Objects;

public class ExchangeUniversity extends University {//конструктор 1
    private String studentName;
    private String currentUniversity;
    private double gpa;

    public ExchangeUniversity(String name, String location, String studentName, String currentUniversity, double gpa) {
        super(name, location);
        this.studentName = studentName;
        this.currentUniversity = currentUniversity;
        this.gpa = gpa;
    }

    public ExchangeUniversity() {//конструктор 2
        super();
        this.studentName = "Katty Nell";
        this.currentUniversity = "Korea University";
        this.gpa = 4.0;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCurrentUniversity() {
        return currentUniversity;
    }

    public void setCurrentUniversity(String currentUniversity) {
        this.currentUniversity = currentUniversity;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {//для отображения информации о студенте
        return super.toString() +
                ", Student{name='" + studentName + "', currentUniversity='" + currentUniversity +
                "', gpa=" + gpa + "}";
    }

    @Override
    public boolean equals(Object o) {//для сравнения объектов с учетом нового функционала
        if (this == o) return true;
        if (!(o instanceof ExchangeUniversity)) return false;
        if (!super.equals(o)) return false;
        ExchangeUniversity that = (ExchangeUniversity) o;
        return Double.compare(that.gpa, gpa) == 0 &&
                Objects.equals(studentName, that.studentName) &&
                Objects.equals(currentUniversity, that.currentUniversity);
    }

    @Override
    public int hashCode() {// для создания уникальных хэшей
        return Objects.hash(super.hashCode(), studentName, currentUniversity, gpa);
    }
}
