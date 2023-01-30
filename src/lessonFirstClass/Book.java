package lessonFirstClass;

public class Book {
    private int year;
    private String name;
    private Author author;

    public Book(String name, Author author, int year){

        this.name = name;
        this.author = author;
        this.year = year;
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
