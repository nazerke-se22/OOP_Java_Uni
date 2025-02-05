package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbFunctions {
    public Connection connect_to_db(String dbname, String user, String pass) {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, pass);
            if (conn != null) {
                System.out.println("Connected to PostgreSQL database");
            } else {
                System.out.println("Failed to connect to PostgreSQL database");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;

    }

    public void create_table_professor(Connection conn, String table_name) {
        Statement statement;
        try {
            String query = "CREATE TABLE " + table_name + " (" +
                    "professor_id SERIAL, " +
                    "name VARCHAR(200), " +
                    "email VARCHAR(200), " +
                    "experience_years INTEGER, " +
                    "PRIMARY KEY(professor_id));";
            statement = conn.createStatement();
            statement.execute(query);
            System.out.println("Table created: " + table_name);
        } catch (Exception e) {
            System.out.println("Error creating table " + table_name + ": " + e);
        }
    }

    public void create_table_course(Connection conn, String table_name) {
        Statement statement;
        try {
            String query = "CREATE TABLE " + table_name + " (" +
                    "course_id SERIAL, " +
                    "course_name VARCHAR(200), " +
                    "code INTEGER, " +
                    "credits INTEGER, " +
                    "PRIMARY KEY(course_id));";
            statement = conn.createStatement();
            statement.execute(query);
            System.out.println("Table created: " + table_name);
        } catch (Exception e) {
            System.out.println("Error creating table " + table_name + ": " + e);
        }
    }

    public void create_table_university(Connection conn, String table_name) {
        Statement statement;
        try {
            String query = "CREATE TABLE " + table_name + " (" +
                    "university_id SERIAL, " +
                    "name VARCHAR(200), " +
                    "location VARCHAR(200), " +
                    "PRIMARY KEY(university_id));";
            statement = conn.createStatement();
            statement.execute(query);
            System.out.println("Table created: " + table_name);
        } catch (Exception e) {
            System.out.println("Error creating table " + table_name + ": " + e);
        }
    }

    public void insert_row_professor(Connection conn, String table_name, Professor professor) {
        Statement statement;
        try {
            String query = String.format("INSERT INTO %s(name, email, experience_years) values('%s', '%s', %d);",
                    table_name, professor.getName(), professor.getEmail(), professor.getExperienceYears());
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row inserted into professor table");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void insert_row_course(Connection conn, String table_name, Course course) {
        Statement statement;
        try {
            String query = String.format("INSERT INTO %s(course_name, code, credits) values('%s', %d, %d);",
                    table_name, course.getCourseName(), course.getCode(), course.getCredits());
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row inserted into course table");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void insert_row_university(Connection conn, String table_name, University university) {
        Statement statement;
        try {
            String query = String.format("INSERT INTO %s(name, location) values('%s', '%s');",
                    table_name, university.getName(), university.getLocation());
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row inserted into university table");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void read_professor_data(Connection conn, String table_name) {
        Statement statement;
        ResultSet rs = null;
        try {
            String query = String.format("SELECT * FROM %s", table_name);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                System.out.print(rs.getInt("professor_id") + " ");
                System.out.print(rs.getString("name") + " ");
                System.out.println(rs.getString("email") + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void read_course_data(Connection conn, String table_name) {
        Statement statement;
        ResultSet rs = null;
        try {
            String query = String.format("SELECT * FROM %s", table_name);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                System.out.print(rs.getInt("course_id") + " ");
                System.out.print(rs.getString("course_name") + " ");
                System.out.println(rs.getInt("credits") + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void read_university_data(Connection conn, String table_name) {
        Statement statement;
        ResultSet rs = null;
        try {
            String query = String.format("SELECT * FROM %s", table_name);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                System.out.print(rs.getInt("university_id") + " ");
                System.out.print(rs.getString("name") + " ");
                System.out.println(rs.getString("location") + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void update_professor_email(Connection conn, String table_name, int professorId, String newEmail) {
        Statement statement;
        try {
            String query = String.format("UPDATE %s SET email = '%s' WHERE professor_id = %d", table_name, newEmail, professorId);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Professor email updated");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void update_course_credits(Connection conn, String table_name, int courseId, int newCredits) {
        Statement statement;
        try {
            String query = String.format("UPDATE %s SET credits = %d WHERE course_id = %d", table_name, newCredits, courseId);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Course credits updated");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void update_university_location(Connection conn, String table_name, int universityId, String newLocation) {
        Statement statement;
        try {
            String query = String.format("UPDATE %s SET location = '%s' WHERE university_id = %d", table_name, newLocation, universityId);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("University location updated");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void delete_professor_by_id(Connection conn, String table_name, int professorId) {
        Statement statement;
        try {
            String query = String.format("DELETE FROM %s WHERE professor_id = %d", table_name, professorId);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Professor deleted");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void delete_course_by_id(Connection conn, String table_name, int courseId) {
        Statement statement;
        try {
            String query = String.format("DELETE FROM %s WHERE course_id = %d", table_name, courseId);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Course deleted");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void delete_university_by_id(Connection conn, String table_name, int universityId) {
        Statement statement;
        try {
            String query = String.format("DELETE FROM %s WHERE university_id = %d", table_name, universityId);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("University deleted");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}