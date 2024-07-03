import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for (int i : arr) {
    		list.add(i);
    	}
    	
    	int s = list.indexOf(2);
    	if (s == -1) {
			return new int[] {-1};
		}
    	int e = list.lastIndexOf(2);
    	
    	int[] answer = new int[e - s + 1];
    	for (int i = s; i <= e; i++) {
			answer[i - s] = arr[i];
		}
    	
        return answer;
    }
}