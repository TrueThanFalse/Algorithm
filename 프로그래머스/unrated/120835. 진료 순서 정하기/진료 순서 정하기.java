import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] emergency) {
    	int[] answer = new int[emergency.length];
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<emergency.length; i++) {
        	list.add(emergency[i]);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        int emergencyNumber = 1;
        
        for(int i=0; i<list.size(); i++) {
        	for(int j=0; j<list.size(); j++) {
        		if(list.get(i) == emergency[j]) {
        			answer[j] = emergencyNumber;
        			emergencyNumber++;
        		}
        	}
        }
        
        return answer;
    }
}