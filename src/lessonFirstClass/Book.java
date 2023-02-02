package lessonFirstClass;

import java.util.Objects;

public class Book {
    private int year;
    private final String name;
    private Author author;

    public Book(String name, Author author, int year){

        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book " + name + " year " + year + " by author=" + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, name, author);
    }

    public  void  setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }
    public int getName(){
        return this.year;
    }
    public Author getAuthor(){
        return this.author;
    }

    public void showData(){
        System.out.println("Книжка: " + getName() + " " + getAuthor().getData() + " Год издания:" + getYear());
    }
}
