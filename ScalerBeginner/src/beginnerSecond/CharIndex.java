package beginnerSecond;
// https://www.scaler.com/academy/mentee-dashboard/class/45207/homework/problems/11652/hints?navref=cl_pb_nv_tb
public class CharIndex {
    public String solve(String A) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<A.length(); i++){
            int temp = A.charAt(i)-'a'+1;
            result.append(A.charAt(i));
            result.append(temp);
        }
        return result.toString();
    }
    public String solveScalerSol(String A) {
        String ans="";
        for(int i=0; i<A.length(); i++) {
            // Adding ascii value of A[i] in ans after adding A[i]
            ans = ans + A.charAt(i) + Integer.toString((int)A.charAt(i)-(int)'a'+1);
        }
        return ans;
        }
}
