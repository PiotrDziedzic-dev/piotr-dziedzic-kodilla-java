import java.awt.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSequenceMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any positive integer number");
        int given_n = scanner.nextInt();
        int a1 = 0;
        int a2 = 1;

        System.out.println("I will write down all "+given_n+" numbers of Fibonacci sequence");

        List<Integer> fibonacciSequence = new LinkedList<>();
        fibonacciSequence.add(a1);
        fibonacciSequence.add(a2);
        for(int i = 2; i<=given_n; i++)
        {
            fibonacciSequence.add(fibonacciSequence.get(i-2)+fibonacciSequence.get(i-1));
        }

        for (int i=0; i<given_n; i++) {
            System.out.println(fibonacciSequence.get(i));
        }

        System.out.println("I will write down the "+given_n+"-th "+"number of Fibonacci sequence");
        System.out.println(fibonacciSequence.get((given_n)-1));

    }
}
