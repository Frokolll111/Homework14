public class Hogwarts {
    private String name;
    private String surname;
    private String faculty;

    public Hogwarts(String name, String surname, String faculty) {
        this.name = name;
        this.surname = surname;
        this.faculty = String.valueOf(faculty);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
