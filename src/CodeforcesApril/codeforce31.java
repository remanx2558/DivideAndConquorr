package CodeforcesApril;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class codeforce31 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int p = 0; p < t; p++) {
            int n = Integer.parseInt(br.readLine());
            n=2*(n-1);
            System.out.println(factorial(BigInteger.valueOf(n)));


        }

    }

    public static BigInteger factorial(BigInteger number) {

        // factorial of 0 and 1 is always 1 - base case
        if (number == BigInteger.ZERO || number == BigInteger.ONE) {
            return BigInteger.ONE;
        }

        // !n = n*!n-1 - recursive call
        return number.multiply(factorial(number.subtract(BigInteger.ONE)));

    }
}
