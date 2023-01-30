import lessonFirstClass.Author;
import lessonFirstClass.Book;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Ivan", "Ivanov");
        Book book1 = new Book("Dreamland", author1, 1960);
    }
}