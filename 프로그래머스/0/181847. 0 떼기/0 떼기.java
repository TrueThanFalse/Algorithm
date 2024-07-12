class Solution {
    public String solution(String n_str) {
        while (true) {
        	if (n_str.startsWith("0")) {
        		n_str = n_str.substring(1, n_str.length());
    		} else {
    			return n_str;
    		}
		}
    }
}