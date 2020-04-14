package CodeforcesApril;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeforce41 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int p = 0; p < t; p++) {
            long n = Long.parseLong(br.readLine());
            greed(n);
        }

    }
    static  void greed(long n){
        long sum=0;
        if(n<=2){
            System.out.println(sum);
        }
        else if(n%2==0){
            System.out.println(n/2-1);
        }
        else {
            System.out.println(n/2);
        }
    }
}
