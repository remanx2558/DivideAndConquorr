package GreedyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Greed5 {

    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            int n=Integer.parseInt(br.readLine());

            String str1=br.readLine();
           // String str2[]=br.readLine().split(" ");
            char arr1[]=new char[str1.length()];
            for(int i=0;i<str1.length();i++){
                arr1[i]=str1.charAt(i);
               // System.out.println(arr1[i]+"cool");
            }
           // int arr2[]=new int[str2.length];
          //  for(int i=0;i<str2.length;i++){
          //      arr2[i]=Integer.parseInt(str2[i]);
          //  }
            greed(arr1);


        }

    }

    static void greed(char []arr){
        int s=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                if(arr[i]!='['){
                    int c=search('[',arr,i+1,arr.length-1);
                    s=s+(c-i);
                    swap(arr,i,c);
                }
            }
            if(i%2!=0){
                if(arr[i]!=']'){
                    int c=search(']',arr,i+1,arr.length-1);
                    s=s+(c-i);
                    swap(arr,i,c);
                }
            }
        }

System.out.println(s);
    }
    static void swap(char []arr ,int s,int e){
        char temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        return;

    }
static int search(char k,char[] arr,int s,int e){
        int val=s;
        for(int i=s;i<=e;i++){
            if(arr[i]==k){
                val=i;
                break;
            }
        }
        return val;

}
}
