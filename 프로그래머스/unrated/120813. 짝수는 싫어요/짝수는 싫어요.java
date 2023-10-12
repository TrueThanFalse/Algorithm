import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int n) {
    	int index = 0;
    	if(n%2==0) {
    		index = n/2;
    	}else {
    		index = (n/2)+1;
    	}
    	int[] answer = new int[index];
        
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=1; i<=n; i++) {
        	if(!(i%2==0)) {
        		arr.add(i);
        	}
        }
        for(int i=0; i<answer.length; i++) {
        	answer[i] = arr.get(i);
        }
        
        return answer;
    }
}