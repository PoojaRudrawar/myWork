package NEW.Java8;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 *Created by PRudrawar on 8/27/2018
 */
public class JavaStreams {
    public static void main(String[] args) {
        IntStream.range(1,10).forEach(System.out::print);
        System.out.println();

        IntStream.range(1,10).skip(5).forEach(x -> System.out.print(x));
        System.out.println();

        System.out.println(IntStream.range(1,5).sum());

        Stream.of("Pooja","Kunal","Darsh").sorted().findFirst().ifPresent(System.out::println);

        String[] names={"aa","bb","ab","aab","aac"};

        Arrays.stream(names).filter(x -> x.startsWith("a")).sorted().forEach(System.out::print);

        System.out.println();
        Stream.of(names).filter(x-> x.startsWith("b")).sorted().forEach(System.out::println);

       // Arrays.stream(new Integer[]{1,2,3,4}).map(x-> x * x).average();
    }
}
