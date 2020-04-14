package CodeforcesApril;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeforce23 {

static class point{
    long x;
    long y;
    point(long xx,long yy){
        x=xx;
        y=yy;
    }

}
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++) {
            int n=Integer.parseInt(br.readLine());
            point arr[]=new point[n];
            boolean b[]=new boolean[n];

            for(int i=0;i<n;i++){
                String s[]=br.readLine().split(" ");
                arr[i]=new point(Long.parseLong(s[0]),Long.parseLong(s[1]));
            }

            greed(b,arr);
        }
    }
static void greed(boolean[]b,point[]arr){

    boolean ba[]=new boolean[arr.length];//max
    boolean bc[]=new boolean[arr.length];//max

    boolean a[]=new boolean[arr.length];//min
    int baba=0;
    int aa=0;
    int bb=0;
    for(int i=0;i<arr.length;i++){

    }





}

}
