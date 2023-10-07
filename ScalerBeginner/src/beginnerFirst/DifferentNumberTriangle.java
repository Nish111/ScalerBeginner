package beginnerFirst;
import java.lang.*;
import java.util.*;
// https://www.scaler.com/academy/mentee-dashboard/class/45202/homework/problems/10878?navref=cl_tt_nv
public class DifferentNumberTriangle {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int row = 1; row <= N ;row++){
            // print zeroes
            for(int zer = 1; zer <= N-row; zer++){
                System.out.print("0" + " ");
            }
            // print N of first row
            if(row == 1){
                System.out.print(N + " ");
            }
            // middle numbers
            if(row > 1 && row < N){
                // multiples
                for(int j = 1; j <= 2*row-1; j++){
                    System.out.print(j*(N-row+1) + " ");
                }
            }
            // last row numbers
            if(row == N){
                for(int i = 1; i <= (2*N)-1; i++){
                    System.out.print(i + " ");
                }
            }
            // last col zeroes
            for(int zer = 1; zer <= N-row; zer++){
                System.out.print("0" + " ");
            }
            System.out.println();
        }
        /*
        // Loop for N rows
        for (int i = 1; i <= n; i++)
    	{
    	    // Print leading 0s
    		int spaces = n - i;
    		for (int j = 1; j <= spaces; j++){
    			 System.out.print("0 ");
    		}
    		// Print non-zero number series
    		int lim = 2 * i - 1;
            int cnt = 1;
            for (int j = 1; j <= lim; j++)
    		{
    		    System.out.print((n-i+1)*cnt + " ");
                cnt++;
    		}
    		// Print trailing 0s
    		for (int j = 1; j <= spaces; j++){
    			System.out.print("0 ");
    		}
        	System.out.println();
    	}
        */
    }
}