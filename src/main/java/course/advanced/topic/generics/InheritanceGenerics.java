package course.advanced.topic.generics;

import java.util.ArrayList;

public class InheritanceGenerics {

    public InheritanceGenerics() {
        showListGenerics();
    }

    public static void showListGenerics(){
        Integer oneInteger = 22002;
        Number twoNumber = 2122;

        ArrayList<Number> mList = new ArrayList<>();
        mList.add(oneInteger);
        mList.add(twoNumber);

        showList(mList);
    }

    public static void showList (ArrayList<Number> lst){
        for(Number n: lst){
            System.out.println("Number: "+n);
        }
    }

    public static void main(String[] args) {
        InheritanceGenerics.showListGenerics();
    }

}
