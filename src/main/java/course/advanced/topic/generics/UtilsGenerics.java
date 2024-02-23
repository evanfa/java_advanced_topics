package course.advanced.topic.generics;

public class UtilsGenerics {

    public static <T> int countIncidences(T[]lista,T object){
        int counter = 0;

        for(T objectList: lista){
            if(object.equals(objectList)){
                counter++;
            }
            T miVariable;
            //No hay error al usar TIPO GENERICO
        }
        return counter;
    }

    public void otherIncidence(){
        //T miVariable;
        //T no es reconocido - Error en TIPO GENERICO
    }

}
