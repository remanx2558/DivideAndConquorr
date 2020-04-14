package DivideAndConquor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MultipleTwoPolynomial {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            //int n=Integer.parseInt(br.readLine());

            String str0[]=br.readLine().split(" ");

            String str1[]=br.readLine().split(" ");

            String str2[]=br.readLine().split(" ");

            int arr0[]=new int[str0.length];
            for(int i=0;i<str0.length;i++){
                arr0[i]=Integer.parseInt(str0[i]);
            }
            /////////////
            int arr1[]=new int[str1.length];
            for(int i=0;i<str1.length;i++){
                arr1[i]=Integer.parseInt(str1[i]);
            }
            ///////////////
            int arr2[]=new int[str2.length];
            for(int i=0;i<str2.length;i++){
                arr2[i]=Integer.parseInt(str2[i]);
            }

            greed(arr1,arr2);}

    }
    static void greed(int []arr1,int []arr2){

        int arr[]=new int[arr1.length+arr2.length-1];



       // HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                arr[i+j]=arr[i+j]+(arr1[i]*arr2[j]);
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        //Collections.sort(hm);

    }

}
