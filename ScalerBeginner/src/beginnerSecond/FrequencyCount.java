package beginnerSecond;
//https://www.scaler.com/academy/mentee-dashboard/class/45204/homework/problems/11618/hints?navref=cl_pb_nv_tb
public class FrequencyCount {
    public int[] solve(int[] A) {
        int[] result = new int[A.length];
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A.length; j++){
                if(A[j]==A[i]) result[i]++;
            }
        }
        return result;
    }
}
