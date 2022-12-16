import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);
        int sum = list.stream().mapToInt(Integer::valueOf).sum();
        double value = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("The sum: " + sum);
        System.out.println("Arif. num:  " + value);
        System.out.println("Size: " + list.size());
    }
}
