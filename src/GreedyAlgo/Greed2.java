package GreedyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Greed2 {

    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){

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
            greed(arr1[1],arr2);


        }

    }

    static void greed(int n,int []arr2){
        ArrayList<Integer>neg=new ArrayList<Integer>();
        ArrayList<Integer>pos=new ArrayList<Integer>();
        /////////////////////////////
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]>=0){
                pos.add(arr2[i]);
            }
            else neg.add(arr2[i]);
        }
        ////////////////////////////
        Collections.sort(neg);
        long nigga=0;
        for(int i=0;i<neg.size();i++){
            nigga=nigga+neg.get(i);
        }
        nigga=(-1)*nigga;

    //    if(n>=neg.size()){
            ////////make all =ve

      //  }
      //  else
            if(n<neg.size()) {
            ///////slect last n elements 0....n-1 contributed to +ve
            for(int i=neg.size()-1;i>n-1;i--){
                nigga=nigga+(2)*neg.get(i);
            }
        }
        /////////////////////////
        ///////update k value/////
        n=n-neg.size();
        long sum=0;
        //////
        int min=Integer.MAX_VALUE;
        for(int i=0;i<neg.size();i++){
          //  sum=sum+neg.get(i);
            if(neg.get(i)<min){
                min=Math.abs(neg.get(i));
            }
        }
        sum=sum+nigga;

        for(int i=0;i<pos.size();i++){
            sum=sum+pos.get(i);
            if(pos.get(i)<min){
                min=pos.get(i);
            }
        }
        if((n>0) && (n%2!=0)){
            ///find min value
            sum=sum-(long)(2)*min;
            ///if n==odd  sum-min-min else sum

        }

        System.out.println(sum);
    }
}
