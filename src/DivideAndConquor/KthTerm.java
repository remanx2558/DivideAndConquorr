package DivideAndConquor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Vector;

public class KthTerm {

public static void main(String args[]) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int p=0;p<t;p++){
        String str[]=br.readLine().split(" ");
        String str1[]=br.readLine().split(" ");
        String str2[]=br.readLine().split(" ");
        int arr[]=new int[str.length];
        for(int i=0;i<str.length;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        int arr1[]=new int[str1.length];
        for(int i=0;i<str1.length;i++){
            arr1[i]=Integer.parseInt(str1[i]);
        }
        int arr2[]=new int[str2.length];
        for(int i=0;i<str2.length;i++){
            arr2[i]=Integer.parseInt(str2[i]);
        }
        greed(arr[2],arr1,arr2);
    }
}
static void greed(int k,int []arr,int []arr2){
    int n=arr.length+arr2.length;
    int arr3[]=new int[n];
    int l=0;int t=0;
    int i=0;
    for( i=0;i<n && l<arr.length && t<arr2.length;i++){
        if(arr[l]<arr2[t] && l<arr.length){
            arr3[i]=arr[l];
            l++;
        }
        else if(arr[l]>=arr2[t] &&t <arr2.length){
            arr3[i]=arr[t];
            t++;
        }
        else {
            break;
        }
    }
    while(i<n && arr[l]>arr2[t] &&t <arr2.length ){
        arr3[i++]=arr2[t++];

    }
    while(i<n && arr[l]<arr2[t] && l  <arr.length ){
        arr3[i++]=arr2[t++];

    }
    System.out.println(arr3[k-1]);

}
}
