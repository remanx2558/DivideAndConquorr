package DivideAndConquor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.Long.reverse;

public class Div1 {

    static int reverse(int n){

        int rev=0,rem;
        for(;n>0;n=n/10){
            rem=n%10;
            rev=rev*10+rem;
        }
        return rev;

    }

    public static void main (String[] args) {
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            int n=sc.nextInt();
            BigInteger f=BigInteger.valueOf(n);
            //System.out.println(reverse(n));
            BigInteger rev=BigInteger.valueOf(reverse(n));
            BigInteger res=f.modPow(rev,BigInteger.valueOf(1000000007));
            System.out.println(res.toString());


        }
    }
}
