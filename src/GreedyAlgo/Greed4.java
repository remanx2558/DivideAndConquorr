package GreedyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Greed4 {

    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            int n=Integer.parseInt(br.readLine());

            String str1[]=br.readLine().split(" ");
            String str2[]=br.readLine().split(" ");
            int arr1[]=new int[str1.length];
            for(int i=0;i<str1.length;i++){
                arr1[i]=Integer.parseInt(str1[i]);
            }
            int arr2[]=new int[str2.length];
            for(int i=0;i<str2.length;i++){
                arr2[i]=Integer.parseInt(str2[i]);
            }
            greed(arr1,arr2);


        }

    }

    static void greed(int []arr1,int []arr2){
        Arrays.sort(arr2);
        Arrays.sort(arr1);
        int min=Integer.MIN_VALUE;
        for(int i=0;i<arr1.length;i++){
            int k=Math.abs(arr1[i]-arr2[i]);
            if(k>min){
                min=k;
            }
        }
        System.out.println(min);

    }
}
