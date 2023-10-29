import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        String[] arrBefore = before.split("");
        Arrays.sort(arrBefore);
        String[] arrAfter = after.split("");
        Arrays.sort(arrAfter);
        before = "";
        after = "";
        
        for(int i=0; i<arrBefore.length; i++) {
        	before += arrBefore[i];
        	after += arrAfter[i];
        }
        
        if(before.equals(after)) {
        	return answer = 1;
        }
        
        return answer;
    }
}