package beginnerSecond;
import java.lang.*;
import java.util.*;
// https://www.scaler.com/academy/mentee-dashboard/class/45207/homework/problems/11422/hints?navref=cl_pb_nv_tb
public class VowelsVsConsonants {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int j=0; j<T; j++){
            String S = scan.next();
            int countV = 0, countC = 0;
            for(int i=0; i<S.length(); i++){
                if(S.charAt(i)=='a' || S.charAt(i)=='e'||S.charAt(i)=='i'
                ||S.charAt(i)=='o'||S.charAt(i)=='u') countV++;
                else countC++;
            }
            System.out.println(countV+" "+countC);
        }
        //
        while(T-- > 0) {
            String str = scan.next();
            
            int v = 0;
            int c = 0;
            // v is the count of vowels in string
            // iterating over the string to find v
            for(int i=0; i < str.length();i++) {
                char ch = str.charAt(i);
                
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    v++;
                }
                else {
                    c++;
                }
            }
            
            System.out.println(v + " " + c);
        }
    }
}