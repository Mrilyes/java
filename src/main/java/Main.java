import java.sql.SQLOutput;

public class Main {
    public static void main(String args[]){
        System.out.println("Hello World"); // sout as a shortcut
        Person person = new Person("Ilyes");
        System.out.println(person.getName());
        System.out.println(person.toString());
    }
}
