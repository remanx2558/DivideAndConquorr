package DivideAndConquor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackKaratsuba {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            //int n=Integer.parseInt(br.readLine());

            String str0[]=br.readLine().split(" ");
        //    int str1[]=new int[str0.length] ;

           // String str1[]=br.readLine().split(" ");

       //     String str2[]=br.readLine().split(" ");

            int mul=1;
            int arr0[]=new int[str0.length];
            for(int i=0;i<str0.length;i++){
                arr0[i]=Integer.parseInt(str0[i],2);
              //  System.out.print(arr0[i]+" ");
                mul=mul*arr0[i];
            }
            System.out.println(mul);

        //    greed(0);}

    }
//static void greed(String[]arr){

}
}
