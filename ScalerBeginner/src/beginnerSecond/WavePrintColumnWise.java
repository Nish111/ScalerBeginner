package beginnerSecond;
import java.lang.*;
import java.util.*;
// https://www.scaler.com/academy/mentee-dashboard/class/45205/assignment/problems/17356?navref=cl_tt_nv
public class WavePrintColumnWise {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] mat = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                mat[i][j] = scan.nextInt();
            }
        }
        int start=0;
        for(int i=0; i<N; i++){
            if(i%2==0) {
                for(int j=0; j<N; j++){
                    System.out.print(mat[j][i]+" ");
                }
            }
            else {
                for(int j=N-1; j>=0; j--){
                    System.out.print(mat[j][i]+" ");
                }
            }
            
        }
        //
     // Iterating over the columns
        for(int col = 0; col < N; col++)
        {
            // Iterating over rows 
            for(int row = 0; row < N; row++)
            {
                if((col%2) == 1)
                {
                    System.out.print(mat[N - 1 - row][col]);
                }
                else
                {
                    System.out.print(mat[row][col]);
                }
                System.out.print(' ');
            }
        }

        System.out.println();
        //sc.close();
    }
}