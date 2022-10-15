package course.advanced.topic.lambda;

public class LambdaCall {
    public static void main(String[] args) {
        MyValue mV = ()->2.9;
        System.out.println("Value: "+mV.getValue());

        UnarioOperator uO = (n)-> Math.sqrt(n);
        System.out.println("Raiz: "+uO.setValue(3.0));

        uO = (n)-> Math.pow(n,n);
        System.out.println("Potencia: "+uO.setValue(3.0));
    }
}
