package lessonFirstClass;

public class Author {

    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void showData(){
        System.out.println("Автор: " + getFirstName() + " " + getLastName());
    }

    public String getData(){
        return "Автор: " + getFirstName() + " " + getLastName();
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }


}
