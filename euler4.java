package My_ProjectEuler_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class euler4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            long limit = Long.parseLong(br.readLine().trim());
            System.out.println(findLargestPalindrome(limit));
        }

        br.close();
    }
    private static long findLargestPalindrome(long limit) {
        for (long i = limit - 1; i >= 1; i--){
            if (isPalindrome(i) && areFactorsHas3Digit(i)){
                return i;
            }
        }
        return -1;
    }

    private static boolean isPalindrome(long num) {
        long originalNumber = num;
        long reversedNumber = 0;

        while (num > 0){
            reversedNumber = (reversedNumber * 10) + (num % 10);
            num /= 10;
        }
        return originalNumber == reversedNumber;
    }

    private static boolean areFactorsHas3Digit(long num){
        for (long i = 100; i <= 999; i++ ){
            if (num % i == 0){
                long j = num / i;
                if (j >= 100 &&  j <= 999){
                    return true;
                }
            }
        }
        return false;
    }
}
