package lessonFirstClass;

public class Main {
    public static void main(String[] args) {

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
}
