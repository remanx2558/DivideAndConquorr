package CodeforcesApril;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeforce3 {

    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());



            String str0[]=br.readLine().split(" ");
            long arr0[]=new long[str0.length];
            for(int i=0;i<str0.length;i++){
                arr0[i]=Long.parseLong(str0[i]);
            }

            greed(arr0);
        }
static void greed(long []arr){
       long val=0;
       /////////////////////////////////
    int n=arr.length;
    long dp[]=new long[n];
    dp[0]=arr[0];
    for(int i=1;i<n;i++){
        dp[i]=dp[i-1]+arr[i];
    }
    ////////////
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            long k=dp[j]-dp[i]+arr[i];
            if(k==0){
                break;
            }
            val++;
        }
    }
    System.out.println(val);

}
}
