public class Book {
    private final String nameBook;
    private final Author author;
    private int yearPublish;
    public Book(String name, Author author, int yearPublish) {
        this.nameBook = name;
        this.author = author;
        this.yearPublish = yearPublish;
    }
    public String getName() {
        return nameBook;
    }
    public Author getAuthor() {
        return author;
    }
    public int getYearPublish() {
        return yearPublish;
    }
    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }
}
