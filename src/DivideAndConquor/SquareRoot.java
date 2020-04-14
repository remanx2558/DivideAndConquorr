package DivideAndConquor;

import java.util.Scanner;

public class SquareRoot {

    public static void main (String[] args)
    {
        //code
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){

            long k=s.nextInt();
            long f= (long) Math.sqrt(k);
            if(f*f==k){
                System.out.println((int)f-1);

            }
            else {
                System.out.println((int)f);

            }
        }
    }

}