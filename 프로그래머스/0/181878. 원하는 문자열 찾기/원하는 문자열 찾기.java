class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String lowMyString = myString.toLowerCase();
        String lowPat = pat.toLowerCase();
        if (lowMyString.contains(lowPat)) {
			answer = 1;
		}
        
        return answer;
    }
}