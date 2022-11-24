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
}


