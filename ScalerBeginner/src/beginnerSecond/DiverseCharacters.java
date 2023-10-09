package beginnerSecond;
//https://www.scaler.com/academy/mentee-dashboard/class/45207/assignment/problems/11490?navref=cl_tt_nv
public class DiverseCharacters {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final String A) {
       int count=0, count2=0;
        for(int i=0; i<A.length(); i++){
            int temp = A.charAt(i)-'a';
            int temp2 = A.charAt(i)-'A';
            int temp3 = A.charAt(i)-'0';
            if(temp>=0 && temp<=25) count++;
            if(temp2>=0 && temp2<=25) count++;
            if(temp3>=0 && temp3<=9) count2++;
        }
        return Math.max(count, count2);
    }
    public int solveScalerSol(final String A) {
        int cnta = 0; //count of alphabets
        int cntd = 0; //count of digits
        // Interating over the string
        // cnta will be the frequency of alphabets
        // cntd will be the frequency of digits
        for(int i=0; i < A.length();i++) {
            char ch = A.charAt(i);
            
            if(ch >= 'A' && ch <= 'Z') {
                cnta++;
            }
            else if(ch >= 'a' && ch <= 'z') {
                cnta++;
            }
            else if(ch >= '0' && ch <= '9') {
                cntd++;
            }
        }
        
        if(cnta > cntd) {
            return cnta;
        }
        else {
            return cntd;
        }
        
    }
}
