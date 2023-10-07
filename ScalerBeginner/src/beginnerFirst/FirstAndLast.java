package beginnerFirst;
import java.lang.*;
import java.util.*;

public class FirstAndLast {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
        for(int i=1; i<=T; i++){
            int N=scan.nextInt();
            int last = N%10;
            int first=0;
            while(N>0){
                first = N%10;    
                N/=10;
            }
            System.out.print(first+" "+last);
            System.out.println();
        }
        //
        while(T-- > 0) {
            int n = scan.nextInt();
            int first = 0;
            int last = 0;
            // n on modulo with 10 will give last digit
            // and after dividing n by 10 each time we will get first digit 
            last = n % 10;
            
            while(n > 0) {
                first = n % 10;
                n = n / 10;
            }
            
            System.out.println(first + " " + last);
        }
        //for
        for(int k = 1; k <= T;k++) {
            int n = scan.nextInt();
            int first = 0;
            int last = 0;
            // n on modulo with 10 will give last digit
            // and after dividing n by 10 each time we will get first digit 
            last = n % 10;
            
            for(; n > 0 ; n = n / 10) {
                first = n % 10;
            }
            
            System.out.println(first + " " + last);
        }
    }
}