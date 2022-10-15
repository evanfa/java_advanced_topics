package course.advanced.topic.lambda;

public class LambdaCall {
    public static void main(String[] args) {
        MyValue mV = ()->2.9;
        System.out.println("Value: "+mV.getValue());

        UnarioOperator uO = (n)-> Math.sqrt(n);
        System.out.println("Raiz: "+uO.setValue(3.0));

        uO = (n)-> Math.pow(n,n);
        System.out.println("Potencia: "+uO.setValue(3.0));

        BinaryOperator bO = (n,m)-> (Double)n*(Double) m;
        System.out.println("Multiplicacion: "+bO.setMultiply(2.2312, 92.1211));

//Is required use "return" as a common block of code
        bO = (n,m)-> {

            System.out.println("First Val: "+n);
            System.out.println("Second Val: "+m);

            return Math.pow(((Double)m*(Double)n),(Double)n);
        };

        System.out.println("Values Binary Operator Complex: "+bO.setMultiply(2.0,6.0));

        BinaryOperator<String> boGeneric = (n,m)->n.concat(m);
        System.out.println("Concatenation: "+boGeneric.setMultiply("XXXX","-YYYY"));

    }
}
