import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<numbers.length-1; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		int tmp = numbers[i] * numbers[j];
        		arr.add(tmp);
        	}
        }
        int max = Collections.max(arr);
        answer = max;

        return answer;
    }
}