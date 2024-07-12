import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for (int i : arr) {
    		list.add(i);
    	}
    	
    	a: for (int i = 0; i < delete_list.length; i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j) == delete_list[i]) {
					list.remove(j);
					continue a;
				}
			}
		}
    	
    	int[] answer = new int [list.size()];
    	for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        return answer;
    }
}