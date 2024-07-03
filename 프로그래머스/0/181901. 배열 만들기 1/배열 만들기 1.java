import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = k; i <= n; i += k) {
			list.add(i);
		}
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
}