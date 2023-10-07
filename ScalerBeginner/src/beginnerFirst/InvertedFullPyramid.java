package beginnerFirst;
import java.lang.*;
import java.util.*;
// https://www.scaler.com/academy/mentee-dashboard/class/45202/homework/problems/10455?navref=cl_tt_nv
public class InvertedFullPyramid {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=0; i<N; i++){
            for(int j=i; j<N; j++){
                System.out.print("* ");
            }
            System.out.println();
            for(int k=0; k<=i; k++){
                System.out.print(" ");
            }
        }
     // Loop for N rows
        for(int i = N; i >= 1; i--){
        
            // Print leading spaces
            for(int j = N; j > i; j--){
                System.out.print(" ");
            }
            
            // Print stars with spaces
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}