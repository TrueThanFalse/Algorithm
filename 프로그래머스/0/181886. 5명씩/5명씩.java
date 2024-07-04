import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
    	ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < names.length; i += 5) {
			list.add(names[i]);
		}
        String[] answer = new String[list.size()];
        list.toArray(answer);
        return answer;
    }
}