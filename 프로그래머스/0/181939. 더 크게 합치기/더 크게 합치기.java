class Solution {
    public int solution(int a, int b) {
        
        String strAB = String.valueOf(a) + String.valueOf(b);
        String strBA = String.valueOf(b) + String.valueOf(a);
        
        if (Integer.valueOf(strAB) < Integer.valueOf(strBA)) {
        	return Integer.parseInt(strBA);
        }else {
        	return Integer.parseInt(strAB);
        }
    }
}