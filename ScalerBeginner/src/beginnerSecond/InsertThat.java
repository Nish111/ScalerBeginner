package beginnerSecond;

import java.lang.*;
import java.util.*;
// https://www.scaler.com/academy/mentee-dashboard/class/45204/assignment/problems/11458?navref=cl_tt_lst_sl
public class InsertThat {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
         Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N+1];
        for(int i=0; i<N; i++){
            arr[i] = scan.nextInt();
        }
        int X = scan.nextInt();
        int Y = scan.nextInt();
        /*for(int i=0; i<N; i++){
            if(i==X-1) System.out.print(Y +" "+arr[i]+" ");
            else System.out.print(arr[i]+" ");
        }*/
        N = N + 1;
        // looping from n-1 to x
        for(int i=N-1;i>X-1;i--) {
            arr[i] = arr[i-1];
        }
        arr[X-1] = Y;
        // looping from 0 to n-1
        for(int i=0;i<N;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}