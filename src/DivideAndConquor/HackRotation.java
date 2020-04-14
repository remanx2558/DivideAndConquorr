package DivideAndConquor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackRotation {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            int n=Integer.parseInt(br.readLine());

            String str0[]=br.readLine().split(" ");
            //    int str1[]=new int[str0.length] ;

            // String str1[]=br.readLine().split(" ");

            //     String str2[]=br.readLine().split(" ");


            int arr0[]=new int[str0.length];
            for(int i=0;i<str0.length;i++){
                arr0[i]=Integer.parseInt(str0[i]);
                //  System.out.print(arr0[i]+" ");
                //  mul=mul*arr0[i];
            }
            // System.out.println(mul);

            min=arr0[0];
          //  greed(arr0,0,arr0.length-1);
            min=findMin(arr0,0,arr0.length-1);
            System.out.println(min);

            minI=0;
            greed2(arr0,0,arr0.length-1);
            System.out.println(minI);

        }}
    static int min;
    static int minI;

    static void greed2(int []arr,int l,int r){
        if(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==min){
                minI=mid;
                greed2(arr,l,mid-1);//left

              //  greed(arr,l,mid-1);
            }
            else if(arr[mid]<arr[r]){
                //min=arr[mid];
                greed2(arr,l,mid-1);//left
            }
            else greed2(arr,mid+1,r);//right
        }
    }

    static void greed(int []arr,int l,int r){
        if(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]>min){
                greed(arr,mid+1,r);
                greed(arr,l,mid-1);
            }
            else{
                min=arr[mid];
                greed(arr,l,mid-1);}
        }
    }

    static int findMin(int arr[], int low, int high)
    {
        // This condition is needed to handle the case when array
        // is not rotated at all
        if (high < low)  return arr[0];

        // If there is only one element left
        if (high == low) return arr[low];

        // Find mid
        int mid = low + (high - low)/2; /*(low + high)/2;*/

        // Check if element (mid+1) is minimum element. Consider
        // the cases like {3, 4, 5, 1, 2}
        if (mid < high && arr[mid+1] < arr[mid])
            return arr[mid+1];

        // Check if mid itself is minimum element
        if (mid > low && arr[mid] < arr[mid - 1])
            return arr[mid];

        // Decide whether we need to go to left half or right half
        if (arr[high] > arr[mid])
            return findMin(arr, low, mid-1);
        return findMin(arr, mid+1, high);
    }
}
