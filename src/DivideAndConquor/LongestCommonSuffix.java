package DivideAndConquor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LongestCommonSuffix {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            int n=Integer.parseInt(br.readLine());

            String str2[]=br.readLine().split(" ");

            System.out.println(greed(0,n-1,str2));


        }

    }

    static String greed(int l,int r,String []arr2) {
        if(l==r){
            return arr2[l];
        }
        if(l<r){
            int mid=(l+r)/2;
            String left=greed(l,mid,arr2);
            String right=greed(mid+1,r,arr2);

            String so=lcs(left,right);
            if(so==""){
                return "-1";
            }else return so;
        }
        String str="-1";
        return str;
    }
    static String lcs(String s1,String s2){
        String s3="";
        int n1=0;
        int n2=0;

        while(n1<s1.length() && n2<s2.length()){
            if(s1.charAt(n1)==s2.charAt(n2)){
                s3=s3+s1.charAt(n1);
                n1++;
                n2++;
            }
            else {break;}
        }
        return s3;
    }
}
