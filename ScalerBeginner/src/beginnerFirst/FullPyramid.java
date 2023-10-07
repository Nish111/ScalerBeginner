package beginnerFirst;
import java.lang.*;
import java.util.*;
// https://www.scaler.com/academy/mentee-dashboard/class/45202/assignment/problems/10454?navref=cl_tt_nv
public class FullPyramid {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int j=0;
	    for(int i=1; i<=N; i++){
	    	for(j=1; j<=N-i; j++) {
	    		System.out.print(" ");
	    	}
	    	for(int k=N-i; k<N; k++) {
	    		System.out.print("* ");
	    	}
	    	System.out.println();
	    }
        /*
        // Loop for N rows
        for(int i=1;i<=n;i++){ 
            
            // Print n-i spaces
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            
            // Print i+1 stars
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        */
    }
}