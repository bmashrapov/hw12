public class Main {

    public static void main(String[] args) {
        Author a1 = new Author("Antoine Exupery");
        Book b1 = new Book("The Little Prince", a1, 1958);
        System.out.println("Book " + b1.getName() + ". " + "Author: " + a1.getAuthorName() + " "
                + b1.getYear() + " year");
        b1.setYear(1978);
        System.out.println("Second year " + b1.getYear());
        Author a2 = new Author("Leo Tolstoy");
        Book b2 = new Book("War and Peace", a2, 1976);
        System.out.println("Book: " + b2.getName() + ". " + "Author: " + a2.getAuthorName() + " "
                + b2.getYear() + " year");
    }
}