public class Main {


    public static void main(String[] args) {

        Book titel= new Book ("Три мушкетера ", "Собачье сердце", 1844, 1925);
        titel.year=1845;
        titel.year2=1922;

        Author name= new Author("Дюма", "Булгаков", "Александр", "Михаил");

        System.out.println(titel.getName()+ " "+ titel.getYear()+" "+name.getName() + " "+ name.getSurname());
        System.out.println(titel.getName2()+ " "+ titel.getYear2()+" "+name.getName2()+ " " + name.getSurname2());


    }
}