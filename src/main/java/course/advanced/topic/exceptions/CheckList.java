package course.advanced.topic.exceptions;

import course.advanced.topic.exceptions.custom.PositionException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CheckList {
    private ArrayList<String> list;
    private String fileNam;

    public CheckList(String fileName) throws IOException {
        loadList(fileName);
        fileNam = fileName;
    }

    private void loadList(String fileName) throws IOException {
        list = new ArrayList<>(Files.readAllLines(Paths.get(fileName)));
    }

    //Chained Exceptions - Custom Excpetion + Pre Defined Exception (Parent Exception)
    public String getElements(int index) throws PositionException{
        try{
            return list.get(index-1);
        }catch (ArrayIndexOutOfBoundsException e){
            //return "Out of bounds";
            //throw new PositionException("Out of bounds position");
            //throw  new PositionException("Out of Bounds - Custom", e);
            //Setting Cause
            PositionException pE = new PositionException("Out of Bounds - Custom");
            pE.initCause(e);
            throw pE;
        }finally {
            System.out.println("Execute Finally");
        }
    }

    public void insertElement(String element) throws IOException{
        BufferedWriter out = null;

        try {
            FileWriter fStream = new FileWriter(fileNam, true);
            out = new BufferedWriter(fStream);
            out.write("\n"+element);
            loadList(fileNam);
        }catch (IOException e){
            //System.out.println("Exception Insert: "+e);
            e.printStackTrace();
            //Relaunch Exception:......
            throw e;
        }
        finally {
            System.out.println("Finally");
            if(out!=null){
                out.close();
            }
        }
    }

}
