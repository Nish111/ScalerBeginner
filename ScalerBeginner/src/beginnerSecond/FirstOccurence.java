package beginnerSecond;
//https://www.scaler.com/academy/mentee-dashboard/class/45207/assignment/problems/11491?navref=cl_tt_nv
public class FirstOccurence {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final String A, final int B) {
        for(int i=0; i<A.length(); i++){
            int temp = A.charAt(i)-'a';
            int temp2 = B-97;
            if(temp==temp2) return i;
        }
        return -1;
    }
    public int solveScalerSol(final String A, final int B) {
        int N = A.length();
    
        int idx = -1;
        
        for (int i = 0; i < N;i++){
            // If ascii value of character at ith postion is equal to B
            if(A.charAt(i) == B){
                idx = i;
                break;
            }
        }
        return idx;
    }
}
