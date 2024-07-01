import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < intStrs.length; i++) {
        	String str = "";
			for (int j = s; j < s + l; j++) {
				str += String.valueOf(intStrs[i].charAt(j));
			}
			if (!list.contains(str) && Integer.parseInt(str) > k) {
				list.add(Integer.parseInt(str));
			}
		}
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
}