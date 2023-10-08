package beginnerSecond;

import java.util.ArrayList;
import java.util.HashMap;

//https://www.scaler.com/academy/mentee-dashboard/class/45208/homework/problems/31492?navref=cl_tt_lst_sl
public class FrequencyOfElementQuery {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> ar = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : A){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        for(int num: B){
            ar.add(hm.getOrDefault(num, 0));
        }
        return ar;
    }
    public int[] solveScalerSol(int[] A, int[] B) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i = 0 ; i < A.length ; i++){
            if(freq.containsKey(A[i])){
                freq.put(A[i], freq.get(A[i]) + 1);
            }
            else{
                freq.put(A[i], 1);
            }
        }
        int[] ans = new int[B.length];
        for(int i = 0 ; i < B.length ; i++){
            if(freq.containsKey(B[i])){
                ans[i] = freq.get(B[i]);
            }
            else{
                ans[i] = 0;
            }
        }
        return ans;
    }
}
