import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> duplicationList = new ArrayList<Integer>();
        
        for(int i=2; n!=1; i++) {
        	while (n % i == 0) {
                duplicationList.add(i);
                n /= i;
                i = 2;
            }
        }
        
        List<Integer> uniqueList = new ArrayList<Integer>();
        for(int temp : duplicationList) {
        	if(!uniqueList.contains(temp)) {
        		uniqueList.add(temp);
        	}
        }
        
        int[] answer = new int[uniqueList.size()];
        for(int i=0; i<uniqueList.size(); i++) {
        	answer[i] = uniqueList.get(i);
        }
        
        return answer;
    }
}