package CodeforcesApril;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class codeforce43 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int p = 0; p < t; p++) {
            int n = Integer.parseInt(br.readLine());

            String str[]=br.readLine().split(" ");
            long arr[]=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=Long.parseLong(str[i]);
            }
            greed(arr);
        }

    }
    static  void greed(long []arr){

        if(arr.length<2){
            System.out.println("0");
            return;
        }
        HashMap<Long,Long> hm=new HashMap<Long, Long>();
        long same=0;
        long diff=0;
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                long val=hm.get(arr[i]);
                val=val+1;
                if(val>same){
                    same=val;
                }
                hm.remove(arr[i]);
                hm.put(arr[i],val);

            }
            else{
                hm.put(arr[i],(long)1);
                diff++;
            }

        }

        ////
        if(same==0){
            same=1;
            diff=diff-1;

            System.out.println(same);
            return;
        }
        ////////////
        long case1=Math.min(diff-1,same);//one of sames compromised
        long case2=Math.min(diff,same-1);
        System.out.println(Math.max(case1,case2));
}
}
