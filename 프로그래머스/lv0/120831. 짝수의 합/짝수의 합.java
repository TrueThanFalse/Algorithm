import java.util.ArrayList;
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=1; i<=n; i++) {
        	if(i%2 == 0) {
        		list.add(i);
        	}
        }
        
        for(int i=0; i<list.size(); i++) {
        	answer += list.get(i);
        }
        
        return answer;
    }
}