import model.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person("Ricardo", 20);
        person1.addMainContact("ricardorhv.dev@gmail.com", "44 91234-5678");

        person1.addNewContact("ricardohenriquevinciguerra@gmail.com", "44 94321-1234", "Pessoal");
        person1.addNewContact("aleatorio@gmail.com", "44 94321-1234", "Pessoal");
        person1.addNewContact("aleatorio@gmail.com", "44 94321-1234", "Aleatorio");
        person1.removeContact("Aleatorio");

        person1.showData();
    }
}
