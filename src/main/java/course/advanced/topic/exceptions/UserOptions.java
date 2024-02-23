package course.advanced.topic.exceptions;

import course.advanced.topic.exceptions.custom.PositionException;

import java.util.Scanner;

public class UserOptions {
    private CheckList listaCheck;

    public UserOptions(String file) {
        try {
            this.listaCheck = new CheckList(file);
            //}catch (Exception | ArrayIndexOutOfBoundsException e){
        }catch (Exception e){
            System.out.println("Error with file");
        }
    }

    public void displayMenu() throws PositionException {
        Scanner scan= new Scanner(System.in);
        int option;

        do{
            System.out.println("Out 0...");
            System.out.println("Insert index: ");
            option = scan.nextInt();
            if(option!=0){
                displayElements(option);
            }
        }while(option!=0);
    }

    private void displayElements(int index) throws PositionException {
        System.out.println("Element "+index+" is: "+listaCheck.getElements(index));
    }
}
