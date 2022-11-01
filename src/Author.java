import java.util.Objects;

public class Author {
    private final String surname ;
    private final   String name;
    public Author(String surname, String name) {
        this.surname=surname;
        this.name=name;
    }
    public String getSurname() {
        return this.surname;
    }
    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return name+" "+surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && surname.equals(author.surname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

}
