import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = end_num; i <= start_num; i++) {
			list.add(i);
		}
        Collections.reverse(list);
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

        return answer;
    }
}