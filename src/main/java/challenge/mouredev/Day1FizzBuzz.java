package challenge.mouredev;

import io.reactivex.Flowable;
/**
 * A program that substitute the values for a string
 * Input value of numbers 1 to 100 and exchange when:
 * Divisible for 3 by fiiz
 * Disivible for 5 by buzz
 * Divisible for 3 and 5 by fiizbuzz
 */
public class Day1FizzBuzz {
    public static void main(String[] args) {
        //Flowable<Integer> intVal = Flowable.range(1,1000).filter(item->item % 3 == 0 || item % 5 == 0 || item % 7 == 0);
        long startTime3 = System.nanoTime();

        Flowable<Integer> intVal = Flowable.range(1,1000)
                .filter(item->item % 3 == 0)
                .doOnNext(item->{
                            System.out.println("Fizz");
                        }
                )
                .filter(item->item % 5==0)
                .doOnNext(item->{
                    System.out.println("Buzz");
                })
                .filter(item->item % 7 ==0)
                .doOnNext(item->{
                    System.out.println("FizzBuzz");
                });
        intVal.subscribe(System.out::println,Throwable::printStackTrace);

        long endTime3 = System.nanoTime();

        long benchmark3 =endTime3-startTime3;

        long startTime2 = System.nanoTime();
        for (int i = 0; i < 1001; i++) {
            if(i%3==0){
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }else if(i%7==0) {
                System.out.println("FizzBuzz");
            }
        }
        long endTime2 = System.nanoTime();

        long benchmark2 =endTime2-startTime2;

        long startTime1 = System.nanoTime();
        Flowable<String> intValx = Flowable.range(1, 1000)
                .map(item -> {
                    StringBuilder output = new StringBuilder();
                    if (item % 3 == 0) {
                        output.append("Fizz");
                    }
                    if (item % 5 == 0) {
                        output.append("Buzz");
                    }
                    if (item % 7 == 0) {
                        output.append("FizzBuzz");
                    }
                    return output.length() > 0 ? output.toString() : String.valueOf(item);
                })
                .doOnNext(System.out::println);
        intVal.subscribe(
                // No onNext action needed here, as doOnNext already handles the printing
                item -> {},
                Throwable::printStackTrace,
                () -> System.out.println("Finished processing all numbers.")
        );
        long endTime1 = System.nanoTime();

        long benchmark1 =endTime1-startTime1;

        System.out.println("Lineal "+benchmark2/1000000);
        System.out.println("Flowable "+benchmark3/1000000);
        System.out.println("Flowable Update "+benchmark1/1000000);
    }
}

//21798000
//237664500
//7234500