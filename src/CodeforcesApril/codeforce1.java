package CodeforcesApril;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeforce1 {

    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
          //  int n=Integer.parseInt(br.readLine());

            String str0[]=br.readLine().split(" ");
            int arr0[]=new int[str0.length];
            for(int i=0;i<str0.length;i++){
                arr0[i]=Integer.parseInt(str0[i]);
             }
            greed(arr0[0],arr0[1]);

        }}
        static  void greed(int n,int m){
        char[][] word=new char[n][m];
        int k=n*m;
        int B=k/2+1;
        int W=k-B;


        boolean b=false;
        boolean bb=false;
        for(int i=0;i<n;i++){

            if(b==false){
                for(int j=0;j<m;j++){
                    if(W<=0){
                        bb=false;
                    }

                   if(B>0 && bb==false){
                       word[i][j]='B';
                       bb=true;
                       B--;
                   }
                   else{
                       word[i][j]='W';
                       bb=false;
                       W--;
                   }


                }

                b=true;
            }
            else {
                for(int j=m-1;j>=0;j--){
                    if(W<=0){
                        bb=false;
                    }

                    if(B>0 && bb==false){
                        word[i][j]='B';
                        bb=true;
                        B--;
                    }
                    else{
                        word[i][j]='W';
                        bb=false;
                        W--;
                    }

                }

                b=false;
            }




        }
        //////show time
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(word[i][j]);
                }
                System.out.println();
            }


        }
}
