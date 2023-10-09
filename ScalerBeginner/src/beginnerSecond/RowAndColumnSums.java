package beginnerSecond;

import java.util.ArrayList;

//https://www.scaler.com/academy/mentee-dashboard/class/45206/assignment/problems/11617?navref=cl_tt_nv
public class RowAndColumnSums {
    public int[] solve(int[][] A) {
        int[] res = new int[A.length+A[0].length];
        for(int i=0; i<A.length; i++){
            for(int j=0;j<A[0].length; j++){
                res[i] += A[i][j];
            }
        }
        for(int i=0; i<A[0].length; i++){
            for(int j=0;j<A.length; j++){
                res[i+A.length] += A[j][i];
            }
        }
        return res;
    }
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer>ans = new ArrayList<>();
        int n = A.size();
        int m = A.get(0).size();
        
        //travel rows to get each row sum
        for(int i=0; i < n; i++) {
            int temp = 0;
            // Finding sum of elements of ith row
            for(int j=0; j < m;j++) {
                temp += A.get(i).get(j);
            }
            ans.add(temp);
        }
        
        //travel cols to get each col sum
        for(int j=0; j < m; j++) {
            int temp = 0;
            // Finding sum of elements of jth column
            for(int i=0; i < n;i++) {
                temp += A.get(i).get(j);
            }
            ans.add(temp);
        }
        
        return ans;
    }
}
