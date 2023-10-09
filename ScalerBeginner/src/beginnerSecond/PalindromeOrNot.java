package beginnerSecond;
//https://www.scaler.com/academy/mentee-dashboard/class/45207/assignment/problems/22287?navref=cl_tt_nv
public class PalindromeOrNot {
	public static boolean isPalin(String s) {
	    // complete the function template
	    for(int i=0; i<s.length(); i++){
	        if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
	    }
	    return true;
	}
	public static boolean isPalinScalerSol(String s) {
	    String rev = "";
	    // rev will be the reverse of s
	    for(int i=0;i<s.length();i++) {
	        rev = s.charAt(i) + rev;
	    }
	    return rev.equals(s);
	}
}

