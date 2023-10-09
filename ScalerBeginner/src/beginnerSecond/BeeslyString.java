package beginnerSecond;
//https://www.scaler.com/academy/mentee-dashboard/class/45207/homework/problems/25634?navref=cl_tt_lst_sl
public class BeeslyString {
    public int solve(String A) {
        int countA = 0, countM = 0, countP = 0;
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i)=='a') countA++;
            else if(A.charAt(i)=='m') countM++;
            else if(A.charAt(i)=='p') countP++;
        }
        if(countM/2==countA && countA==countP) return 1; // this is of no need
        else if (countM==countP+countA) return 1; // only this is correct
        else return 0;
    }
    public int solveScalerSol(String A) {
        int p = 0, a = 0, m = 0;
        // p is the frequency of 'p' in A
        // a is the frequency of 'a' in A
        // m is the frequency of 'm' in A
    	for (int i = 0; i < A.length(); i++)
    	{
    		if (A.charAt(i) == 'p')
    			p++;
    		else if (A.charAt(i) == 'a')
    		    a++;
    		else
    			m++;
    	}
    	if(p + a == m)
    	    return 1;
    	else
    	    return 0;
    }
    public static void main(String[] args) {
		BeeslyString bs=  new BeeslyString();
		String A = "mpampamm";
		String B = "pampampam";
		String C = "mmmppammampmpmamammpmmaammpmpmmaammamapmpmmpmppppa"; // 25 14 11
		String D = "mammmmmpmpmmampmmmpmpaaapmammmpmmmpaaaaammpmmmmmpp";
		System.out.println(bs.solve(A)); // 1
		System.out.println(bs.solve(B)); //0
		System.out.println(bs.solve(C)); // 1
		System.out.println(bs.solve(D));// 0
	}
}
