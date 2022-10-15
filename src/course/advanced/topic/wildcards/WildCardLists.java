package course.advanced.topic.wildcards;

import java.util.ArrayList;

public class WildCardLists {

    ArrayList<Number> numList = new ArrayList<>();
    ArrayList<Integer> intList = new ArrayList<>();

    public ArrayList<Number> getNumList() {
        return numList;
    }

    public ArrayList<Integer> getIntList() {
        return intList;
    }

    public WildCardLists() {
        numList.add((Integer)23112);
        numList.add((Number)231111);


        intList.add((Integer)23112);
        intList.add(222222);
        //Number es un subtipo de Integer pero Integer no es un subtipo de Number
        //intList.add((Number)231111);
    }

    public static void displayLists(ArrayList<? extends Number> dslList){
        //Si se conserva Integer o Number marca error dado que puede ser cualquiera de los dos
        //Para solucionar se indica que la wildcard puede ser una de otra en el parametro
        for(Number intN: dslList){
            System.out.println("Value: "+intN);
        }
    }

    //Si deseamos que esté acotado a recibir solo cierta clase o super clase.
    //Supongamos que queremos que acepte solo Integers o sus super clases Number u Objects.
    public static void displayListSuper(ArrayList<? super Integer> dslList){
        for(Object intN: dslList){
            System.out.println("Value: "+intN);
        }
    }

    public static void main(String[] args) {
        WildCardLists wC = new WildCardLists();
        WildCardLists.displayLists(wC.getIntList());
        WildCardLists.displayListSuper(wC.getNumList());
    }

}
