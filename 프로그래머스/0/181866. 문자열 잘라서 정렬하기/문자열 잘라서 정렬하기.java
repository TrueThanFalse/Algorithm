import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
    	String[] arr = myString.split("x");
    	ArrayList<String> list = new ArrayList<String>();
    	for (String s : arr) {
    		if (!s.isEmpty()) {
				list.add(s);
			}
    	}
    	
    	String[] answer = list.toArray(new String[list.size()]);
    	Arrays.sort(answer);
        return answer;
    }
}