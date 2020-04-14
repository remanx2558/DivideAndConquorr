package DivideAndConquor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MaximumSum {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            int n=Integer.parseInt(br.readLine());

            String str2[]=br.readLine().split(" ");
            int arr[]=new int[str2.length];
            for(int i=0;i<str2.length;i++){
                arr[i]=Integer.parseInt(str2[i]);
            }

           greed(arr);


        }

    }
    static void greed(int []arr){
        int maxSum=Integer.MIN_VALUE;
        int iSum=0;
        int dp[]=new int [arr.length];
        dp[0]=arr[0];
        ////////////////
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=0){
                dp[i]=Math.max(dp[i-1]+arr[i],arr[i]);
            }
            else dp[i]=arr[i];
        }
        /////////////////////
        for(int i=0;i<arr.length;i++){
            if(maxSum<=dp[i]){
                //dp[i]=Math.max(dp[i-1]+arr[i],arr[i]);
                maxSum=dp[i];
                iSum=i;
            }
            //else dp[i]=arr[i];
        }
        ArrayList<Integer>al=new ArrayList<Integer>();
        for(int i=iSum;i>=0;i--){
            if(arr[i]>=0){
                al.add(arr[i]);
            }
            else break;
        }
        ///////////////////
        for(int i=al.size()-1;i>=0;i--){
           System.out.print(al.get(i)+" ");
        }
        System.out.println();
    }
}
