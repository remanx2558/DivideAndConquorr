package CodeforcesApril;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codforce2 {

    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            int n=Integer.parseInt(br.readLine());

            String str0[]=br.readLine().split(" ");
            String str1[]=br.readLine().split(" ");
            long arr0[]=new long[str0.length];
            for(int i=0;i<str0.length;i++){
                arr0[i]=Long.parseLong(str0[i]);
            }

            long arr1[]=new long[str1.length];

            for(int i=0;i<str1.length;i++){
                arr1[i]=Long.parseLong(str1[i]);
            }
           if( greed(arr0,arr1)){
               System.out.println("YES");
           }
           else {
               System.out.println("NO");
           }
        }}

static  boolean greed(long []arr1,long []arr2){
        boolean b=false;
        if(arr1[0]==arr2[0]){
            for(int i=1;i<arr1.length;i++){
                if(function(arr1,arr2,arr2[i],i,arr1.length)==false){
                    return false;
                }
                //arr1[i]=arr2[i];
            }
            b=true;
        }
        return b;
}
static boolean function(long []arr,long [] arr2,long key,int index,int n){
      boolean b=false;
        long x=key-arr[index];
      for(int j=0;j<index;j++){
          if(arr[j]!=0 && key/arr[j]>=0){

              return true;
          }
          else if(arr2[j]!=0 && key/arr2[j]>=0){
              return true;
          }

      }


        return b;
}
}
