package beginnerSecond;

import java.util.Arrays;
// https://www.scaler.com/academy/mentee-dashboard/class/45204/assignment/problems/11553?navref=cl_tt_lst_nm
public class CopyTheArray {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A, int B) {
        //for(int i=0; i<A.length; i++){
          //  A[i] = A[i]+B;
        //}
        //return A;
        return Arrays.stream(A)
                .map(element -> element + B)
                .toArray();
    }
}
