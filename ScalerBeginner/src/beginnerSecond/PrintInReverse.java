package beginnerSecond;
import java.lang.*;
import java.util.*;
import java.util.stream.IntStream;
// https://www.scaler.com/academy/mentee-dashboard/class/45204/assignment/problems/11555?navref=cl_tt_nv
public class PrintInReverse {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scan.nextInt();
        }
        //for(int i=N-1; i>=0; i--){
          //  System.out.print(arr[i]+" ");
        //}
        IntStream.rangeClosed(1, N)
                .mapToObj(i -> arr[N - i])
                .forEach(element -> System.out.print(element + " "));
    }
}