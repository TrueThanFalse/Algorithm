import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
    	int[] answer = new int[queries.length];
    	
        for (int i = 0; i < queries.length; i++) {
        	ArrayList<Integer> integerArray = new ArrayList<Integer>();
        	
        	for (int j = queries[i][0]; j <= queries[i][1]; j++) {
        		if (arr[j] > queries[i][2]) {
        			integerArray.add(arr[j]);
    			}
			}
        	
        	if (integerArray.isEmpty()) {
				answer[i] = -1;
			} else {
				answer[i] = Collections.min(integerArray);
			}
		}
        
        return answer;
    }
}