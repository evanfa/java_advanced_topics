package course.advanced.topic.streams;

import course.advanced.topic.lambda.example.Person;
import java.util.ArrayList;

public class ClientsStream {
    public ClientsStream() {
        ArrayList<Person> clientes = createClientList();

        //clientes.stream().filter(cliente -> cliente.getName().startsWith("L")).filter(cliente->cliente.getLastName().equalsIgnoreCase("Ordoñez")).forEach(System.out::println);
        clientes.parallelStream().filter(cliente -> cliente.getName().startsWith("L")).forEach(System.out::println);
    }

    public ArrayList<Person> createClientList(){
        ArrayList<Person> clientes = new ArrayList<>();
        Person p1 = new Person("Dante", "Bueno");
        Person p2 = new Person("Lorena", "Gomez");
        Person p3 = new Person("Veronica", "Ramos");
        Person p4 = new Person("Belem", "Cervantez");
        Person p5 = new Person("Lucia", "Becerra");
        Person p6 = new Person("Lilia", "Ordoñez");
        clientes.add(p1);
        clientes.add(p2);
        clientes.add(p3);
        clientes.add(p4);
        clientes.add(p5);
        clientes.add(p6);

        return clientes;
    }
}
