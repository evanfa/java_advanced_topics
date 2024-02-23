package course.advanced.topic.streams;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("Common Implementation-");
        System.out.println("----------------------");
        ClientsLists cl = new ClientsLists();
        System.out.println("----------------------");
        System.out.println("-Stream Implementation-");
        System.out.println("----------------------");
        ClientsStream clS = new ClientsStream();
        System.out.println("----------------------------");
        System.out.println("-Stream Peek Implementation-");
        System.out.println("----------------------------");
        ClientsObjectStream coS = new ClientsObjectStream();

        System.out.println("----------------------------");
        System.out.println("------Collect Object-------");
        System.out.println("----------------------------");
        Set<Object> miSet = Stream.of(8,15,-3,23,-23,-9,-12,0,1,-48).sorted()
                .collect(Collectors.toSet());

        System.out.println("Collect: "+miSet.toString());

        System.out.println("----------------------------");
        System.out.println("------Product-------");
        System.out.println("----------------------------");
        //TODO Reducer is not working
        Optional<Integer> product = Stream.of(8,15,-3,23,-23,-9,-12,0,1,-48).sorted().peek(integer -> System.out.println(integer)).reduce((a,b)->a*b);
        System.out.println("Product: "+product.get());

        System.out.println("----------------------------");
        System.out.println("------SUM-------");
        System.out.println("----------------------------");
        int sum = IntStream.of(8,15,-3,23,-23,-9,-12,0,1,-48).sorted().sum();
        System.out.println("Sum: "+sum);

        boolean exist = Stream.of(8,15,-3,23,-23,-9,-12,0,1,-48).sorted().anyMatch(i->i>50);
        System.out.println("Upper than: "+exist);

        boolean existAll = Stream.of(8,15,-3,23,-23,-9,-12,0,1,-48).sorted().allMatch(i->i>-50);
        System.out.println("All Upper than: "+existAll);
    }
}
