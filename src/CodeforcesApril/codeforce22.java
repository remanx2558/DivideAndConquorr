package CodeforcesApril;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class codeforce22 {

    public static void main(String args[]) throws IOException {
        Scanner s=new Scanner(System.in);
     //   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=s.nextInt();
                //Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++) {
            int n =s.nextInt();
            long k=s.nextLong();
                    //br.readLine().split(" ");
           // String str1[] = br.readLine().split(" ");

            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] =s.nextLong();
                        //Long.parseLong(str[i]);
            }

            greed(arr,k);
        }
    }
    static  void greed(long []arr,long k){

        long surr=0;
        long count=0;
        Arrays.sort(arr);
        //for (int i = 0; i < arr.length; i++) {
//System.out.print(arr[i]+" ");
       // }


        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=k){

                surr=surr+(arr[i]-k);
                count++;
              //  System.out.println("1 surr has become"+surr+" count is "+count);
            }
            else if(arr[i]<k){
                long mo=k-arr[i];
                if(mo<=surr){
                    count++;
                    surr=surr-mo;
                 //   System.out.println("2 surr has become"+surr+" count is "+count);

                }


            }

        }
        System.out.println(count);


    }
}
