import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        for (int i = l; i <= r; i++) {
        	boolean verification = true;
        	String[] str = Integer.toString(i).split("");
			for (int j = 0; j < str.length; j++) {
				if (!str[j].equals("5") && !str[j].equals("0")) {
					verification = false;
				}
			}
			if (verification) {
				number.add(i);
			}
		}
        
    	
    	if (number.size() == 0) {
    		int[] answer = new int[1];
    		answer[0] = -1;
    		return answer;
		} else {
			int[] answer = new int[number.size()];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = number.get(i);
			}
			return answer;
		}
    }
}