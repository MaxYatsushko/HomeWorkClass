package lessonFirstClass;

public class Main {
    public static void main(String[] args) {
        showTask1();
        showTask2();

    }
    public static void showTask1(){
        Author author1 = new Author("Ivan", "Ivanov");
        Author author2 = new Author("Gen", "Genadich");

        Book book1 = new Book("Mute", author1, 1960);
        Book book2 = new Book("Motherland", author2, 1900);

        book1.showData();
        book2.showData();

        book1.setYear(1990);
        book1.showData();
        author1.showData();

        book2.setYear(2000);
        book2.showData();
        author2.showData();
    }

    public static void showTask2(){
        Author author1 = new Author("Ivan", "Ivanov");
        Author author2 = new Author("Gen", "Genadich");
        Author author3 = new Author("Ivan", "Ivanov");

        Book book1 = new Book("Mute", author1, 1960);
        Book book3 = new Book("Mute", author1, 1960);
        Book book2 = new Book("Motherland", author2, 1900);

        System.out.println("Author equals " + author1.equals(author2));
        System.out.println("Author equals " + author1.equals(author1));
        System.out.println("Author equals " + author1.equals(author3));
        System.out.println("Author equals " + author1.equals(null));

        System.out.println("Author hashcode " + author1.hashCode());
        System.out.println("Author hashcode " + author2.hashCode());
        System.out.println("Author hashcode " + author3.hashCode());
        System.out.println("Author toString " + author3);

        System.out.println("Book toString " + book1);
        System.out.println("Book equals " + book1.equals(book3));
        System.out.println("Book equals " + book1.equals(book2));
        System.out.println("Book equals " + book1.equals(author3));

        System.out.println("Book hashcode " + book1.hashCode());
        System.out.println("Book hashcode " + book2.hashCode());
        System.out.println("Book hashcode " + book3.hashCode());
    }
}
