import java.util.Objects;

public class Author {
    private final String firstName;
    private final String middleName;

    public Author(String firstName, String middleName) {

        this.firstName = firstName;
        this.middleName = middleName;

    }

    public String getAuthorName() {

        return this.firstName + " " + this.middleName;
    }

    @Override
    public String toString() {
        return "Autor: " + firstName + " " + middleName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Author author = (Author) other;
        return Objects.equals(firstName,author.firstName) && Objects.equals(middleName, author.middleName);
    }
    @Override
    public int hashCode(){
        return Objects.hash(firstName, middleName);
    }
}


