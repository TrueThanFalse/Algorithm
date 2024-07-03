import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] copy1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        int[] copy2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int num : copy1) {
        	list.add(num);
        }
        for (int num : copy2) {
        	list.add(num);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
}