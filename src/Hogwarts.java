public class Hogwarts {
    private String name;
    private String surname;
    private String faculty;
    private int thePowerOfMagic;
    private int transgressions;

    public Hogwarts(String name, String surname, String faculty, int thePowerOfMagic, int transgressions) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.thePowerOfMagic = thePowerOfMagic;
        this.transgressions = transgressions;

    }

    public int getThePowerOfMagic() {
        return thePowerOfMagic;
    }

    public void setThePowerOfMagic(int thePowerOfMagic) {
        this.thePowerOfMagic = thePowerOfMagic;
    }

    public int getTransgressions() {
        return transgressions;
    }

    public void setTransgressions(int transgressions) {
        this.transgressions = transgressions;
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
