package DivideAndConquor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class AllocateMinimumNumberOfPages {


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
                int s=Integer.parseInt(br.readLine());

                greed(arr,s);
            }


        }
        static void greed(long arr[],int s){
            ///array get sorted
            Arrays.sort(arr);
           Stack<Long> stk=new Stack<Long>();//later use
            ArrayList<Long> al=new ArrayList<Long>();

            //base cases
            if(arr.length<s || s==0){
                System.out.println("-1");
                return;
            }
            else if(arr.length==s){
                System.out.println(arr[arr.length-1]);
                return;
            }
            else if(s==1){
                long sum=0;
                for(int i=0;i<arr.length;i++){
                    sum=sum+arr[i];
                }
                System.out.println(sum);
                return;
            }
            /////real shit starts here
            else {
   ///////////part two////////////////////

                long students[]=new long[s];
                int i=0;//for students
                int j=0;//for arr

                //fill stack initially

                for(int y=arr.length-1;y>=arr.length-1-s+1;y--){
                    stk.push(arr[y]);
                 //   System.out.println("element pushed is "+stk.peek());
                    j=y;
                }
              //  System.out.println("stack is initailies for ist time ");

                //fill in the students initially
                for(int k=s-1;k>=0 && (!stk.isEmpty());k--){
                    students[k]=stk.pop();
                }
             //   System.out.println("student is initallised");
             //   for(int k=0;k<students.length;k++){
                  //  System.out.print(students[k]+" ");
              //  }
////limit of arr is changed till j-1
                j=j-1;
                i=0;
             //   System.out.println("limit of arr is changed from i =0 to "+j);
          //      System.out.println();
                ////////////////now game begins
             //   int counter=-1;
                long max=Long.MIN_VALUE;
                while(i<=j){
                    //fill stack///

                 //   if(al.isEmpty()){
                   //     System.out.println("as expected stack is empty before iteration");
                 //   }
                    int counter=0;
                    for(;i<=j && i<=i+s-1;i++){
                     //   stk.push(arr[i]);
                   //     counter++;
                        al.add(arr[i]);

                       System.out.println("pushed item is "+al.get(counter));
                       counter++;
                    }
                    ////use stack
                    int k=0;
                 //   Arrays.sort(students);

                    while (!al.isEmpty()){
                        if(k==students.length-1){
                            Arrays.sort(students);
                            k=0;
                        }

                        long val=al.get(0);
                        al.remove(0);
                      //  counter--;

                        if(students[k]<=students[k+1]){

                           System.out.println("poped value is "+val+"added into k="+k+"which is "+students[k]);
                            students[k]=val+students[k];
                        }
                        else {
                            k++;
                        }
                    }
                    Arrays.sort(students);
//                    for(int r=0;r<students.length;r++){
//                        System.out.print(students[r]+"/");
//                    }
//                    System.out.println();



                    //////
                }
                for(int r=0;r<students.length;r++){
                    if(max<students[r]){
                        max=students[r];
                    }
                }
                System.out.println(max);



            }



        }
}
