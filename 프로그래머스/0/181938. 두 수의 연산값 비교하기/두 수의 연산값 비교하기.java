class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String strAdd = String.valueOf(a) + String.valueOf(b);
        int mul = 2 * a * b;
        
        if (mul > Integer.parseInt(strAdd)) {
			answer = mul;
		} else {
			answer = Integer.parseInt(strAdd);
		}
        
        return answer;
    }
}