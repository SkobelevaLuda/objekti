public class Main {
    public static void main(String[] args) {
        Author duma = new Author("Александр", "Дюма");
        Author bulgakov = new Author("Михаил", "Булгаков");

        Book threeMushketera = new Book("Три мушкетера", duma, 1845);
        Book heartOfDog = new Book("Собачье сердце", bulgakov, 1925);

        System.out.println(threeMushketera.getTitel() + " " + threeMushketera.getAuthorName() + " "
                + threeMushketera.getAuthorSurname() + " " + threeMushketera.getYear());
        System.out.println(heartOfDog.getTitel() + " " + heartOfDog.getAuthorName() + " "
                + heartOfDog.getAuthorSurname() + " " + heartOfDog.getYear());

        threeMushketera.setYear(1844);
        System.out.println(threeMushketera.getTitel() + " " + threeMushketera.getAuthorName() + " "
                + threeMushketera.getAuthorSurname() + " " + threeMushketera.getYear());
        System.out.println(threeMushketera);
        System.out.println(heartOfDog);


    }
}