package GreedyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Greed3 {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            int n=Integer.parseInt(br.readLine());

            String str2[]=br.readLine().split(" ");
            int arr2[]=new int[str2.length];
            for(int i=0;i<str2.length;i++){
                arr2[i]=Integer.parseInt(str2[i]);
            }
            greed(n,arr2);


        }

    }

    static void greed(int n,int []arr2){
        Arrays.sort(arr2);
        long sum=0;
        for(int i=0;i<arr2.length;i++){
            sum=sum+(long)i*arr2[i];
        }
        System.out.println(sum);
       }

}
