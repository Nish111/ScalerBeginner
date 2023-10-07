package beginnerFirst;
import java.lang.*;
import java.util.*;
// https://www.scaler.com/academy/mentee-dashboard/class/45202/homework/problems/10453?navref=cl_tt_nv
public class HollowInvertedHalfPyramid {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int j=0; j<N; j++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=1; i<N; i++){
            for(int j=1; j<=N-i; j++){
                if(j==1 || j==(N-i)){
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
        //
        for(int i = 0; i < N; i++){
            
            for(int j = 0; j < N-i; j++){
            
                // If 1st row or 1st column or last column print star else print space
                if(i == 0 || j == 0 || j == N-i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
}