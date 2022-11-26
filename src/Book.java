import java.util.Objects;

public class Book {
    private String titel;
    private Author author;
    private int year;

    public Book(String titel, Author author, int year) {
        this.titel = titel;
        this.author = author;
        this.year = year;
    }
    public String getAuthorName(){
        return author.getName();
    }
    public String getAuthorSurname(){
        return author.getSurname();
    }

    public String getTitel() {
        return titel;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;

    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Книга " + titel+ " Год издания " + year+ " Автор " + author;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass()!= o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return getYear() == book.getYear() && Objects.equals(getTitel(), book.getTitel()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitel(), getAuthor(), getYear());
    }
}


