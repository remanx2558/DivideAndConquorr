package CodeforcesApril;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeforce21 {
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++) {
            int n = Integer.parseInt(br.readLine());
            boolean b=true;

            String str[] = br.readLine().split(" ");

             prep=Integer.parseInt(str[0]);
             prec=Integer.parseInt(str[1]);
             if(prep<prec){
                 b=false;
             }
            for(int j=1;j<n;j++){

                String str1[] = br.readLine().split(" ");

                int arr1[] = new int[str1.length];

                for (int i = 0; i < str1.length; i++) {
                    arr1[i] = Integer.parseInt(str1[i]);
                }
                ////////////////////////////////
                ///////////////////////////////
if(greed(arr1)==false){
    b=false;
}

            }


            if(b==false){
                System.out.println("NO");
            }
            else System.out.println("YES");
 }
    }

   static int prep;
    static int prec;

    static boolean greed(int []arr1){
        boolean b=true;/////////
        //if
        if(arr1[0]<arr1[1]){
            b=false;
        }
        if(prep<prec){
            b=false;
        }

        if(prep>arr1[0]){
            b=false;
           // return b;
        }
        else {
            //////////////
            int diff=arr1[1]-prec;
            if(diff<0 ){
                b=false;
               // return b;
            }
            if(arr1[0]<prep+diff){
                b=false;
                //return b;
            }
        }
        prec=arr1[1];
        prep=arr1[0];

return b;
    }
}
