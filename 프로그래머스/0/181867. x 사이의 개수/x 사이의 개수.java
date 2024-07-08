class Solution {
    public int[] solution(String myString) {
    	int variable = 0;
    	if (myString.charAt(myString.length() - 1) == 'x') {
			variable = 1;
		}
    	int[] answer = new int[myString.split("x").length + variable];
    	int idx = 0;
    	for (String str : myString.split("x")) {
    		answer[idx++] = str.length();
    	}
        return answer;
    }
}