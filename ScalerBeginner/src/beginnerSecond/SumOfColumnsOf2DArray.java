package beginnerSecond;
//https://www.scaler.com/academy/mentee-dashboard/class/45205/homework/problems/16531?navref=cl_tt_nv
public class SumOfColumnsOf2DArray {
    public int[] solve(int A, int B, int[][] C) {
        int[] arr = new int[B];
        for(int i=0; i<B; i++){
            for(int j=0; j<A; j++){
                arr[i] += C[j][i];
            }
        }
   
        //
        for(int i = 0; i < B; i++)
        {
            // Finding the sum of elements of ith column
            for(int j = 0; j < A; j++)
            {
                arr[i] += C[j][i];
            }
        }
        return arr;
    }
}
