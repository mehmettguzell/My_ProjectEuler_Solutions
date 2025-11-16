package My_ProjectEuler_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class euler2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());
                System.out.println(calculateFibonacciNumbersIfOdd(n));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    private static long calculateFibonacciNumbersIfOdd(long stopNumber) {
        long firstNumber = 1;
        long secondNumber = 2;
        long sumAllFibonacciNumberBeforeStopNumber = 0;

        while(secondNumber<=stopNumber) {
            if (secondNumber %2 == 0) {
                sumAllFibonacciNumberBeforeStopNumber += secondNumber;
            }
            long tmp = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = tmp;
        }
        return sumAllFibonacciNumberBeforeStopNumber;
    }
}
