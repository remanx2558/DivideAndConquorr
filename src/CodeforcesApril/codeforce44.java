package CodeforcesApril;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class codeforce44 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int p = 0; p < t; p++) {


            char mat[][]=new char [9][9];

            for(int i=0;i<9;i++){
                String str=br.readLine();
                for(int j=0;j<str.length();j++){
                    mat[i][j]=str.charAt(j);
                }

            }
            greed(mat);
        }

    }
    static  void greed(char [][]mat){

        int hoshika=0;
        int currhoshika=0;
        for(int i=0;i<9;i++){
            if(currhoshika>=9){
                hoshika++;
                currhoshika=hoshika;
            }

         mat[i][currhoshika]= (char)((int)(mat[i][currhoshika]+1)%9+49);
            currhoshika=currhoshika+3;
        }
        ///////////show time;
        for(int i=0;i<9;i++){
           // String str[]=br.readLine().split(" ");
            for(int j=0;j<9;j++){
              //  mat[i][j]=Integer.parseInt(str[j]);
            System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }


}
