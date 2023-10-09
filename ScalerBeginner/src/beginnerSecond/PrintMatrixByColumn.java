package beginnerSecond;
import java.lang.*;
import java.util.*;
// https://www.scaler.com/academy/mentee-dashboard/class/45205/homework/problems/30652?navref=cl_tt_lst_sl
public class PrintMatrixByColumn {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[][] arr = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        // 
      //print col by col
        for(int j=0;j < M;j++) {
            for(int i=0;i < N;i++) {
               System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}