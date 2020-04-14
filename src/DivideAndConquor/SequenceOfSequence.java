package DivideAndConquor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SequenceOfSequence {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int p = 0; p < t; p++) {
          //  int n = Integer.parseInt(br.readLine());

            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(getTotalNumberOfSequences(arr[0],arr[1]));
        }

    }
    static int  getTotalNumberOfSequences(int m, int n)
    {
        // define T and build in bottom manner to store
        // number of special sequences of length n and
        // maximum value m
        int T[][]=new int[m+1][n+1];
        for (int i=0; i<m+1; i++)
        {
            for (int j=0; j<n+1; j++)
            {
                // Base case : If length of sequence is 0
                // or maximum value is 0, there cannot
                // exist any special sequence
                if (i == 0 || j == 0)
                    T[i][j] = 0;

                    // if length of sequence is more than
                    // the maximum value, special sequence
                    // cannot exist
                else if (i < j)
                    T[i][j] = 0;

                    // If length of sequence is 1 then the
                    // number of special sequences is equal
                    // to the maximum value
                    // For example with maximum value 2 and
                    // length 1, there can be 2 special
                    // sequences {1}, {2}
                else if (j == 1)
                    T[i][j] = i;

                    // otherwise calculate
                else
                    T[i][j] = T[i-1][j] + T[i/2][j-1];
            }
        }
        return T[m][n];
    } }
