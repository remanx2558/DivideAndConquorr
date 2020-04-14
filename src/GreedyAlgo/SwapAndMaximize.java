package GreedyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SwapAndMaximize {


    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            String str1[]=br.readLine().split(" ");
            String str2[]=br.readLine().split(" ");
            //
            int arr1[]=new int[str1.length];
            for(int i=0;i<str1.length;i++){
                arr1[i]=Integer.parseInt(str1[i]);
            }
            //
            int arr2[]=new int[str2.length];
            for(int i=0;i<str2.length;i++){
                arr2[i]=Integer.parseInt(str2[i]);
            }
            greed(arr1,arr2);


        }

    }

    static void greed(int []arr1,int []arr2){
        Arrays.sort(arr2);
        int []arr3=new int[arr2.length];
        int k=0;
        int s=0;
        int e=arr2.length-1;
        boolean b=false;
        while(k<arr3.length){
            if(b==false){
                arr3[k++]=arr2[s++];
                b=true;
            }
            else {
                arr3[k++]=arr2[e--];
                b=false;
            }
        }

        int sum=Math.abs(arr3[0]-arr3[arr3.length-1]);
        if(arr3.length==1){
            sum=arr3[0];
        }
        for(int i=1;i<arr3.length;i++){
            //System.out.print(arr3[i]+" ");
            sum=sum+Math.abs(arr3[i]-arr3[i-1]);
        }
        System.out.println(sum);

    }
}
