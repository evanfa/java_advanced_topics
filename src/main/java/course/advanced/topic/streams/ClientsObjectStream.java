package course.advanced.topic.streams;

import course.advanced.topic.lambda.example.Person;

import java.util.ArrayList;

public class ClientsObjectStream {

    public ClientsObjectStream() {
        /* Execution steps in peek */
        /* Ops:
        * -filter
        * -peek
        * -distinct
        * -map
        * -sorted
        * */
        ArrayList<Person> clientes = manageObject_Lambda();
        clientes.stream()
                .filter(cliente->cliente.getName().startsWith("L"))
                .peek(cliente -> System.out.println("Nombre Start: L :"+cliente))
                .filter(cliente->cliente.getLastName().equalsIgnoreCase("Gomez"))
                .peek(cliente-> System.out.println("Con el Apellido: Gomez: "+cliente))
                .count();
    }

    public static ArrayList<Person> manageObject_Lambda(){
        Person p1 = new Person("Dante", "Bueno");
        Person p2 = new Person("Lorena", "Gomez");
        Person p3 = new Person("Veronica", "Ramos");
        Person p4 = new Person("Belem", "Cervantez");
        Person p5 = new Person("Lucia", "Becerra");
        Person p6 = new Person("Lilia", "Ordoñez");
        Person p7 = new Person("Lucile", "Gomez");

        ArrayList<Person> listP = new ArrayList<>();
        listP.add(p1);
        listP.add(p6);
        listP.add(p2);
        listP.add(p5);
        listP.add(p7);
        listP.add(p3);
        listP.add(p4);

        return listP;
    }

}
