import java.util.Objects;

public class Book {
    private String name;
    private final Author authorName;
    private int year;

    public Book(String name, Author authorName, int year) {
        this.name = name;
        this.authorName = authorName;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public void setYear(int year) {

        this.year = year;
    }
    @Override
    public String toString() {
        return "Book: " + name + " Year " + year;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other==null || getClass()!=other.getClass())return false;
        Book book = (Book) other;
        return year==book.year&& Objects.equals(name,book.name)&& Objects.equals(authorName,book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,authorName,year);
    }
}
