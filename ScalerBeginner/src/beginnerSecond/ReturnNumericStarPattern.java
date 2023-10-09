package beginnerSecond;

import java.util.ArrayList;

//https://www.scaler.com/academy/mentee-dashboard/class/45206/assignment/problems/31083/hints?navref=cl_pb_nv_tb
public class ReturnNumericStarPattern {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=1; i<=A; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=1; j<=i; j++){
                temp.add(j);
            }
            arr.add(temp);
        }
        return arr;
        //
        /*
         ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int i = 0 ; i < A ; i++){
            ans.add(new ArrayList<Integer>());
        }
        // Looping from 0 to A-1
        for(int i = 0 ; i < A ; i++){
            // Looping from 0 to i
            for(int j = 0 ; j <= i ; j++){
                ans.get(i).add(j + 1);
            }
        }
        return ans;
        */
    }
}
