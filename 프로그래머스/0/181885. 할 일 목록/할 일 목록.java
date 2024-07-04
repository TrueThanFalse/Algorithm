class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int L = 0;
        for (boolean i : finished) {
        	if (!i) {
				L++;
			}
        }
    	String[] answer = new String[L];
    	int idx = 0;
    	for (int i = 0; i < finished.length; i++) {
			if (!finished[i]) {
				answer[idx++] = todo_list[i];
			}
		}
        return answer;
    }
}