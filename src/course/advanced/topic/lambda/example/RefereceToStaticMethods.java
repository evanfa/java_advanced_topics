package course.advanced.topic.lambda.example;

import course.advanced.topic.lambda.BinaryOperator;

public class RefereceToStaticMethods {
    public static int displaySum(int val, int val2){
        return val+val2;
    }

    public static void main(String[] args) {

        BinaryOperator<Integer> sum = (a,b)->a+b;
        BinaryOperator<Integer> sum2 = RefereceToStaticMethods::displaySum;

        ;

        System.out.println("Concat: "+sum.setSum(33,11));
        System.out.println("Concat: "+sum2.setSum(133,11));

    }
}
