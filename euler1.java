package My_ProjectEuler_Solutions;

import java.util.Scanner;

public class euler1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(scanner.nextLine().trim());
            System.out.println(sumMultiplesOf3Or5(n-1));
        }

        scanner.close();
    }
    public static long sumMultiplesOf3Or5(long n) {
        return sumDivisibleBy(3, n) +  sumDivisibleBy(5, n) - sumDivisibleBy(15, n);
    }

    private static long sumDivisibleBy(int i, long n) {
        long p = n / i;
        return i * p * (p+1)/2;
    }
}

