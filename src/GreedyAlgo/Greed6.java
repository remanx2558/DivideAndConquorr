package GreedyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Greed6 {
static class element{
    int s;
    int e;
    element(int ss,int ee){
        s=ss;
        e=ee;
    }

}
static class my implements Comparator<element>{

    @Override
    public int compare(element t1, element t2) {
        int k=t1.s<t2.s?-1:1;
        if(t1.s==t2.s){
            k=0;
        }
        return k;
    }
}
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            int n=Integer.parseInt(br.readLine());

            String str1[]=br.readLine().split(" ");
            String str2[]=br.readLine().split(" ");

            // String str2[]=br.readLine().split(" ");
            Integer arr1[]=new Integer[str1.length];
            for(int i=0;i<str1.length;i++){
                arr1[i]=Integer.parseInt(str1[i]);
                // System.out.println(arr1[i]+"cool");
            }
            ////
            Integer arr2[]=new Integer[str2.length];
            for(int i=0;i<str1.length;i++){
                arr2[i]=Integer.parseInt(str2[i]);
                // System.out.println(arr1[i]+"cool");
            }
            ///////
            element [] arr=new element[str1.length];
            for(int i=0;i<str1.length;i++){
                arr[i]=new element(arr1[i],arr2[i]);
                // System.out.println(arr1[i]+"cool");
            }
//////
            Arrays.sort(arr,new my());
            for(int i=0;i<str1.length;i++){
                //arr[i]=new element(arr1[i],arr2[i]);
                 System.out.println(arr[i].s+"cool");
            }
            /////////
            sonam(arr);


        }

    }
static void sonam(element[] arr){
    int dp[]=new int [arr.length];
    int follower[]=new int[dp.length];


    Arrays.fill(dp,1);
    for (int i=0;i<follower.length;i++){
        follower[i]=i;
    }

    int maxyet=Integer.MIN_VALUE;
    int in=0;

    for(int i=1;i<dp.length;i++){
        for (int j=i-1;j>=0;j--){
            if(arr[i].s>=arr[j].e){
                dp[i]=Math.max(dp[j]+1,dp[i]);
                if(maxyet<dp[i])
                {
                    maxyet=dp[i];
                    in=i;
                    break;
                }
                follower[i]=(dp[i]==dp[j]-1)?j:follower[i];
            }

        }
    }
    System.out.println(maxyet);

    while (follower[in]!=in){
        System.out.print(arr[in].s+" ");
        in=follower[in];
    }




}
}
