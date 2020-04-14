package DivideAndConquor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShuffleInteger {


    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++) {
            int n = Integer.parseInt(br.readLine());

            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
          //  greed(arr);
            shufleArray(arr, 0, arr.length-1);
            for (int ii = 0; ii < arr.length; ii++) {
                System.out.print(arr[ii]+" ");
            }

            System.out.println();


        }}
        static void greed(int []arr){
        int mid=(arr.length-1)/2;



        int k=arr.length%2==0?mid+1:mid;
        int arr2[]=new int[arr.length];
        mid=arr.length%2==0?mid:mid-1;

        int n=0;
        int i=0;
        int j=k;
        while(i<=mid && j<arr.length && n<arr.length){
            arr2[n++]=arr[i++];
            arr2[n++]=arr[j++];

        }
        while(i<=mid && n<arr.length ){
            arr2[n++]=arr[i++];
        }
            while(j<arr.length && n<arr.length){
                arr2[n++]=arr[j++];
            }


            for (int ii = 0; ii < arr.length; ii++) {
                System.out.print(arr2[ii]+" ");
            }

            System.out.println();

        }
    static void shufleArray(int a[], int l, int r)
    {
        if (l > r)
            return;

        // If only 2 element, return
        if (r - l == 1)
            return;

        // finding mid to divide the array
        int mid = (r + l) / 2;

        // using temp for swapping first half of second array
        int temp = mid + 1;//1st part of second half start here

        // mmid is use for swapping second half for first array
        int mmid = (r + mid) / 2;

        // Swapping the element
        for (int i = mmid + 1; i <= mid; i++)
        {
            // swap a[i], a[temp++]
            int temp1 = a[i];
            a[i] = a[temp];
            a[temp++] = temp1;
        }

        // Recursively doing for first half and second half
        shufleArray(a, l, mid);
        shufleArray(a, mid + 1, r);
    }

}
