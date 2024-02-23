package course.advanced.topic.lambda.example;

import course.advanced.topic.lambda.BinaryOperator;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class RefereceToStaticMethods {
    public static int displaySum(int val, int val2){
        return val+val2;
    }

    public static void runningThread_Classic(){
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running Classic...");
            }
        });

        th.start();
    }

    public static void runningThread_Lambda(){
        Thread th = new Thread(()-> System.out.println("Running New...."));
        th.start();
    }

    public static void listIteration_Lambda(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");
        arrayList.add("G");

        arrayList.forEach((s -> System.out.println("Val: "+s)));
    }

    public static void manageObject_Lambda(){
        Person p1 = new Person("Dante", "Bueno");
        Person p2 = new Person("Lorena", "Gomez");
        Person p3 = new Person("Veronica", "Ramos");
        Person p4 = new Person("Belem", "Cervantez");
        Person p5 = new Person("Lucia", "Becerra");

        List<Person> listP = Arrays.asList(p1,p2,p3,p4,p5);

        //listP.sort(Comparator.comparing(Person::getName));
        listP.sort(Comparator.comparing(Person::getLastName));
        listP.forEach(System.out::println);
    }

    public static void manageActionListener_Lambda(){
        JButton jB = new JButton("Display");
        jB.addActionListener(e-> System.out.println("Click Event"));

    }

    public static void main(String[] args) {

        BinaryOperator<Integer> sum = (a,b)->a+b;
        BinaryOperator<Integer> sum2 = RefereceToStaticMethods::displaySum;
        ;

        System.out.println("Concat: "+sum.setSum(33,11));
        System.out.println("Concat: "+sum2.setSum(133,11));

        String strTemp = "Hi Mary";
        Supplier<String> strTempUpper = strTemp::toUpperCase;

        System.out.println("Uppercase: "+strTempUpper.get());

        UnaryOperator<String> cnstStr = String::new;
        cnstStr.apply("Hey, new string");
        System.out.println("Previous: "+String.valueOf(cnstStr));

        String newStr = cnstStr.apply("New Temp string");
        System.out.println("New Strings: "+newStr);

        runningThread_Classic();
        runningThread_Lambda();
        listIteration_Lambda();
        manageObject_Lambda();
    }
}
