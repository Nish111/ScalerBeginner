package beginnerSecond;

import java.util.Arrays;

// https://www.scaler.com/academy/mentee-dashboard/class/45206/assignment/problems/1224?navref=cl_tt_nv
public class UniqueElements {
    public int solve(int[] A) {
       int steps = 0;
       Arrays.sort(A);
        int i = 1;
        int j = 0;
        while (j < A.length){
            if (i >= A[j]){
                steps = steps + (i - A[j]);
                j = j + 1;
                i = i + 1;
            }
            else {
                i = A[j] + 1;
                j = j + 1;
            }
        }
        return steps;
    }
    public int solveScalerSol(int[] A) {
        int n = A.length;
        // sort the array
        Arrays.sort(A);
        // initialize variables
        int steps = 0, i = 1, j = 0;
        // loop unitil you reach the end
        while (j < n) {
            // make current element unique
            if (i >= A[j]) {
                steps += (i - A[j++]);
                i += 1;
            } else {
                i = A[j] + 1;
                j += 1;
            }
        }
        // return the answer
        return steps;
    }
    public static void main(String[] args) {
		UniqueElements ue = new UniqueElements();
		int[] A = {1, 1, 3};
		System.out.println(ue.solve(A));
		int[] B = {2, 4, 5};
		System.out.println(ue.solve(B));
	}
    
}
