package course.advanced.topic.lambda;

//En el caso de reusar una interfaz para realizar otra función por ejemplo "concatenar"
//Es necesario emplear genericos.

/*public interface BinaryOperator {
    double setMultiply(double val,double val2);
}*/

//Nueva Interface Generica
@FunctionalInterface
public  interface BinaryOperator <T>{
    T setSum(T val, T val2);
}
