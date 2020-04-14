package DivideAndConquor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MaximumAreaHistoroGram {
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            int n=Integer.parseInt(br.readLine());

            String str[]=br.readLine().split(" ");
            long arr[]=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=Long.parseLong(str[i]);
            }
            greed(arr);
        }


    }
    static void greed(long []arr){
        Stack<Integer> stk=new Stack<Integer>();
        long maxSum=0;
        long sum=0;




int i=0;

        for( i=0;i<arr.length;){
if(stk.isEmpty() || arr[stk.peek()]<=arr[i]){
    stk.add(i++);

}
else {
    int top=stk.pop();
    if(stk.isEmpty()){
        sum=arr[top]*i;

    }
    else{
        //stk not empty
        sum=arr[top]*(i-stk.peek()-1);


    }
    if(sum>maxSum){
        maxSum=sum;
    }

}




        }

while (!stk.isEmpty()){
    int top=stk.pop();
    if(stk.isEmpty()){
        sum=arr[top]*i;
    }
    else {
        sum=arr[top]*(i-stk.peek()-1);
    }
    if(sum>maxSum){
        maxSum=sum;
    }

}



System.out.println(maxSum);
    }
}
