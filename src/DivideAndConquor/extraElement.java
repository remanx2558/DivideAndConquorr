package DivideAndConquor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class extraElement {

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            int n=  Integer.parseInt(br.readLine());
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
            greed(n,arr1,arr2,0, arr2.length-1);
        }
    }
    static void greed(int n,int []arr1,int []arr2,int l,int r) {
        /////one is empty
        if (arr1.length == 1) {

            System.out.println(0);
            return;
        } else if (l == r + 1) {


            System.out.println(r + 1);
            return;
        } else if (l <= r) {
            int mid = (l + r) / 2;
            if (arr1[mid] == arr2[mid]) {
               // greed(n, arr1, arr2, l, mid-1);
                greed(n, arr1, arr2, mid + 1, r);
            }
            else if (arr1[mid] != arr2[mid]) {
                ///right
                if(mid-1 >=0 && arr1[mid-1]!=arr2[mid-1]){
                    greed(n,arr1,arr2,l,mid-1);
                }
                else if(mid-1 >=0 && arr1[mid-1]==arr2[mid-1] ){
                    System.out.println(mid);
                }
                else if(mid+1<n && arr2[mid]==arr1[mid+1]){
                    System.out.println(mid);
                }


            }
            //right
        }
    }


}
