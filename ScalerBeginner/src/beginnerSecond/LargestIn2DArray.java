package beginnerSecond;
//https://www.scaler.com/academy/mentee-dashboard/class/45205/homework/problems/16511?navref=cl_tt_nv
public class LargestIn2DArray {
    public int[] solve(int[][] A) {
        int[] arr = new int[A.length];
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                arr[i] = Math.max(arr[i], A[i][j]);
            }
        }
        // 
        int n = A.length;
        int m = A[0].length;
        for(int i = 0; i < n; i++)
        {
            // Finding maximum element of ith row
            for(int j = 0; j < m; j++)
            {
                arr[i] = Math.max(arr[i], A[i][j]);
            }
        }
        return arr;
    }
}
