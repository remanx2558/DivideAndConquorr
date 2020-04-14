package CodeforcesApril;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeforce42 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int p = 0; p < t; p++) {
            String str[]=br.readLine().split(" ");
            long arr[]=new long[3];
            for(int i=0;i<str.length;i++){
                arr[i]=Long.parseLong(str[i]);
            }
            greed(arr[0], arr[1], arr[2]);
        }

    }
    static  void greed(long n,long a,long b){
        String str="abcdefghijklmnopqrstuvwxyz";
        String sub=str.substring(0, (int) b);
        if(a==b){
            sub=str;
        }



        String result="";
        int vv=sub.length();
        int p=0;
        for(int i=0;i<n;i++){
            result=result+sub.charAt(p++);
            if(p==vv){
                p=0;
            }
        }
        System.out.println(result);



    }

}
