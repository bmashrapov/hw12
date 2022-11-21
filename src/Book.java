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

    public void setYear(int year) {
        this.year = year;
    }
}
