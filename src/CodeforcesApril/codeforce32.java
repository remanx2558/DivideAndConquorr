package CodeforcesApril;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class codeforce32 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int p = 0; p < t; p++) {
            int n = Integer.parseInt(br.readLine());
            String str[]=br.readLine().split(" ");

            long arr[]=new long[str.length];
            for(int i=0;i<n;i++){
                arr[i]=Long.parseLong(str[i]);
            }
          //  Arrays.sort(arr);
            greed(arr);
        }

    }
    static  void greed(long []arr){
        PriorityQueue<Long> pq1=new PriorityQueue<Long>();
        PriorityQueue<Long> pq2=new PriorityQueue<Long>(Comparator.reverseOrder());
for(int i=0;i<arr.length;i++){
    pq1.add(arr[i]);
    pq2.add(arr[i]);
}


        String str="";
        int i=0;
        int j=arr.length-1;
        boolean b=false;
        while(i<j){
            //o(n)
              //  str=arr[j]+" "+arr[i]+" "+str;
            str=pq2.poll()+" "+pq1.poll()+" "+str;
                j--;
                i++;

        }
        if(i==j && i<arr.length && j>=0){
            str=pq1.poll()+" "+str;
            }
        System.out.println(str);
return;


    }

}
