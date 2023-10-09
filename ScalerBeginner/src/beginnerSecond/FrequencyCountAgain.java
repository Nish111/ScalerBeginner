package beginnerSecond;

import java.util.ArrayList;
import java.util.HashMap;

//https://www.scaler.com/academy/mentee-dashboard/class/45206/homework/problems/11618?navref=cl_tt_nv
public class FrequencyCountAgain {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num: A){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            res.add(hm.getOrDefault(A.get(i), 0));
        }
        return res;
    }
    public int[] solve(int[] A) {
        int n = A.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            int curr = 0;
            // to find the frequency of A[i]
            for(int j = 0; j < n; j++){
                if(A[i] == A[j])
                    curr++;
            }
            ans[i] = curr;
        }
        return ans;
    }
}
