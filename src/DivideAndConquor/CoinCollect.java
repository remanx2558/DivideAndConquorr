package DivideAndConquor;
import java.util.*;

public class CoinCollect {
    // Java Code to Collect all coins in
// minimum number of steps




        // recursive method to collect coins from
        // height array l to r, with height h already
        // collected
        public static int minStepsRecur(int height[], int l,
                                        int r, int h)
        {
            if(l>=r){return 0;}
            if(l==r){
                return 1;
            }
            /////assuming continious//////
            int val=0;
            int Index=-1;
            int min=Integer.MAX_VALUE;
            for(int i=l;i<=r;i++){
                if(min>height[i]){
                    min=height[i];
                    Index=i;
                }
            }
            /////////////
            val=min;
            int verti=0;
            ///////////////
            for(int i=l;i<=r;i++){
                if(height[i]!=0){
                    verti++;
                }
                height[i]=height[i]-min;

            }
            ////////////////////
            ///recurr left and right
            int left=minStepsRecur(height, l,
            Index-1, 0);
            int right=minStepsRecur(height, Index+1,
                    r, 0);
            return val+(Math.min(left+right,verti));

        }

        // method returns minimum number of step to
        // collect coin from stack, with height in
        // height[] array
        public static int minSteps(int height[], int N)
        {
            return minStepsRecur(height, 0, height.length-1, 0);
        }

        /* Driver program to test above function */
        public static void main(String[] args)
        {

            int height[] = { 2, 1, 2, 5, 1 };
            int N = height.length;

            System.out.println(minSteps(height, N));
        }
    }

// This code is contributed by Arnav Kr. Mandal.


