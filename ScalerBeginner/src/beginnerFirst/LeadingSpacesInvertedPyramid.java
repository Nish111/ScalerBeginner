package beginnerFirst;
import java.lang.*;
import java.util.*;
// https://www.scaler.com/academy/mentee-dashboard/class/45201/homework/problems/20828/hints?navref=cl_pb_nv_tb
public class LeadingSpacesInvertedPyramid {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=1; i<=N; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j=i; j<=N; j++){
                System.out.print("*");
            }
          
            System.out.println();
        }
        //
     // Loop for N rows
        for (int i = 0; i < N; i++) {
            // Loop for i columns
            for (int j = 0; j < i; j++) System.out.print(' ');
            // Loop for N-i columns
            for (int j = i; j < N; j++) System.out.print('*');
            System.out.println();
        }
    }
}