public class Author {
    private String surname;
    private String surname2;
    private String name;
    private String name2;

    public String getSurname() {
        return this.surname;
    }

    public String getSurname2() {
        return this.surname2;
    }

    public String getName() {
        return this.name;
    }

    public String getName2() {
        return this.name2;
    }

    public Author(String surname, String surname2, String name, String name2) {
        this.surname=surname;
        this.surname2=surname2;
        this.name=name;
        this.name2=name2;
    }
}
