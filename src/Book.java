import java.util.Objects;

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
    @Override
    public String toString() {
        return "Название книги: " + nameBook + '\n' + "Автор: " + author + '\n' + "Год публикации: " + yearPublish;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublish == book.yearPublish && nameBook.equals(book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, yearPublish);
    }
}
