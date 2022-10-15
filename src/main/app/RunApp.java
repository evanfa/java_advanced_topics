package main.app;

import course.advanced.topic.exceptions.custom.PositionException;
import course.advanced.topic.generics.Box;
import course.advanced.topic.generics.BoxGeneric;

import java.io.IOException;

public class RunApp {
    public static void main(String[] args) throws IOException, PositionException {
        System.out.println("Advanced Topics in Java");
        System.out.println("JDK 11");

            //UserOptions uOp = new UserOptions("C:\\Users\\fabio_rodriguez\\AppData\\Roaming\\JetBrains\\IdeaIC2021.2\\scratches\\input_files\\checklist.txt");
            //uOp.displayMenu();

        Box bx= new Box();
        bx.setObject(23);

        //Se obliga a hacer el casting del objeto
        //SIN EMBARGO NO MUESTRA ERROR Y COMPILA PERO NO EJECUTA
        //String valS = (String)bx.getObject();
        //Pero la clase Integer no puede ser casteada a String

        BoxGeneric<Integer> bxG = new BoxGeneric<>();
        bxG.setObject(58);

        //MUESTRA ERROR Y NO PERMITE COMPILAR
        //String valsS = (String)bxG.getObject();

    }
}
