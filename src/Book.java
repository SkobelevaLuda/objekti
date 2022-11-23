public class Book {
    private String name;
    private String name2;

    int year;
    int year2;

    public void setYear(int year) {
        this.year = year;
    }

    public void setYear2(int year2) {
        this.year2 = year2;
    }

    public String getName() {
        return this.name;
    }
    public String getName2() {
        return this.name2;
    }
    public int getYear() {
        return this.year;
    }
    public int getYear2() {
        return this.year2;
    }

    public Book(String name, String name2, int year, int year2){
        this.name=name;
        this.name2=name2;
        this.year=year;
        this.year2=year2;

    }

}
