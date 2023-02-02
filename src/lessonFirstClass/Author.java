package lessonFirstClass;

import java.util.Objects;

public class Author {

    private final String firstName;
    private final String lastName;

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

    @Override
    public String toString(){

        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if (this == obj) return  true;
        if (!obj.getClass().equals(Author.class)) return false;

        Author other = (Author) obj;

        //return this.firstName.equals(other.firstName) && this.firstName.equals(other.lastName);
        return Objects.equals(this.firstName, other.firstName) && Objects.equals(this.lastName, other.lastName);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.firstName, this.lastName);
    }
}
