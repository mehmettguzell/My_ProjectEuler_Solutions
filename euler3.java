package My_ProjectEuler_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class euler3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());
                //code here
                System.out.println(largestPrimeFactor(n));

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    private static long largestPrimeFactor(long n) {
        long maxPrime = -1;

        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }

        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
        }

        if (n > 2) maxPrime = n;

        return maxPrime;
    }
}
