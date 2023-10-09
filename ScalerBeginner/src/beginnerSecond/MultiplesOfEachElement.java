package beginnerSecond;

import java.util.ArrayList;
import java.util.List;

//https://www.scaler.com/academy/mentee-dashboard/class/45206/homework/problems/31190?navref=cl_tt_nv
public class MultiplesOfEachElement {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
       for (int divisor : B) {
	            List<Integer> currentRow = new ArrayList<>();
	            for (int num : A) {
	                if (num % divisor == 0) {
	                    currentRow.add(num);
	                }
	            }
	            res.add((ArrayList<Integer>) currentRow);
	        }

	        return res;
    }
    public ArrayList<ArrayList<Integer>> solveScalerSol	(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = B.size();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int i = 0 ; i < n ; i++){
            ans.add(new ArrayList<Integer>());
        }
        // Iterating over vector B
        for(int i = 0 ; i < n ; i++){
            // Iterating over vector A
            for(int j = 0 ; j < A.size() ; j++){
                if(A.get(j) % B.get(i) == 0){
                    ans.get(i).add(A.get(j));
                }
            }
        }
        return ans;
    }
}
