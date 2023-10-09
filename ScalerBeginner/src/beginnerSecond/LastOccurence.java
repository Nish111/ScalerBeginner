package beginnerSecond;
//https://www.scaler.com/academy/mentee-dashboard/class/45207/assignment/problems/11534/hints?navref=cl_pb_nv_tb
public class LastOccurence {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final String A, final int B) {
         for(int i=A.length()-1; i>=0; i--){
            int temp = A.charAt(i)-'a';
            int temp2 = B-97;
            if(temp==temp2) return i;
        }
        return -1;
    }
    public int solveScalerSol(final String A, final int B) {
        int N = A.length();
    
        int idx = -1;
        
        for (int i = N - 1; i >= 0;i--){
            // If ascii value of character at ith postion is equal to B
            if(A.charAt(i) == B){
                idx = i;
                break;
            }
        }
        return idx;
    }
}
