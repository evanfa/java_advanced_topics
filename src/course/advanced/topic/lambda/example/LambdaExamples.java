package course.advanced.topic.lambda.example;

import java.util.function.UnaryOperator;

public class LambdaExamples {
    private double dblVal = 5.50;
    private String strVal = "Hey";

    public void tryLambdaExamples() {
        double dblVal_Local = 7.0;
        String strVal_Local = "You";

        UnaryOperator<Double> op1 = n->dblVal+n;
        UnaryOperator<Double> op2 = n->dblVal_Local+n;
        UnaryOperator<String> op3 = n->strVal+n;
        UnaryOperator<String> op4 = n->strVal_Local+n;

        dblVal = 8.0;
        strVal = "Bye";

        UnaryOperator<String> op1Nxt = n->{
            dblVal++;
            return dblVal+n;
        };

        UnaryOperator<String> op2Nxt = n->{
            //Mismo nombre que la variable de instancia pero dentro del lambda
            String dblVal ="String Lambda";
            //Hacemos un this, para identificar cual es la que debe mostrar.
            //Muestra la variable de instancia.
            System.out.println("This for lambda expression: "+this.dblVal);

            return dblVal+n;
        };

        /*
        Si se quiere modificar...
        Una variable que se usa en lambda debe ser final o efectivamente final (Variables locales)
        */

        //dblVal_Local = 10.0;
        //strVal_Local = "Night";
        op2Nxt.apply(String.valueOf(2.0));
    }

    public static void main(String[] args) {
        LambdaExamples lbEx = new LambdaExamples();
        lbEx.tryLambdaExamples();
    }
}
