import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < my_string.length(); i++) {
			list.add(my_string.substring(i));
		}
        Collections.sort(list);
        
        String[] answer = list.toArray(new String[list.size()]);
        
        return answer;
    }
}