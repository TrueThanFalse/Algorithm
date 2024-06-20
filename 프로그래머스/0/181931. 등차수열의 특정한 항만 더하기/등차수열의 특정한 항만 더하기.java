class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for (boolean condition : included) {
			if (condition) {
				answer += a;
			}
			a += d;
		}
        
        return answer;
    }
}