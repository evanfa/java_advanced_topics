package course.advanced.topic.streams;

import course.advanced.topic.lambda.example.Person;
import java.util.ArrayList;

public class ClientsLists {

    public ClientsLists() {
        ArrayList<Person> clientes = createClientList();

        for(Person cliente: clientes){
            if(cliente.getName().startsWith("L")){
                System.out.println(cliente.toString());
            }
        }
    }

    public ArrayList<Person> createClientList(){
        ArrayList<Person> clientes = new ArrayList<>();
        Person p1 = new Person("Dante", "Bueno");
        Person p2 = new Person("Lorena", "Gomez");
        Person p3 = new Person("Veronica", "Ramos");
        Person p4 = new Person("Belem", "Cervantez");
        Person p5 = new Person("Lucia", "Becerra");
        clientes.add(p1);
        clientes.add(p2);
        clientes.add(p3);
        clientes.add(p4);
        clientes.add(p5);

        return clientes;
    }
}
