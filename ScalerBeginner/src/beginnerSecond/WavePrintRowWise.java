package beginnerSecond;
import java.lang.*;
import java.util.*;
// https://www.scaler.com/academy/mentee-dashboard/class/45205/assignment/problems/17364/?navref=cl_pb_nv_tb
public class WavePrintRowWise {
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
                    System.out.print(mat[i][j]+" ");
                }
            }
            else {
                for(int j=N-1; j>=0; j--){
                    System.out.print(mat[i][j]+" ");
                }
            }
            
        }
        //
        // Iterating over the rows
        for(int row = 0; row < N; row++)
        {
            // Iterating over the columns
            for(int col = 0; col < N; col++)
            {
                if((row%2) == 1)
                {
                    System.out.print(mat[row][N - 1 - col]);
                }
                else
                {
                    System.out.print(mat[row][col]);
                }
                System.out.print(' ');
            }
        }

        System.out.println();
    }
}