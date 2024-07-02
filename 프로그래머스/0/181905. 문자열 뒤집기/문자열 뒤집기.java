import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String my_string, int s, int e) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = s; i <= e; i++) {
			list.add(String.valueOf(my_string.charAt(i)));
		}
        Collections.reverse(list);
        
        String[] arr = my_string.split("");
        for (int i = 0; i < list.size(); i++) {
			arr[i + s] = list.get(i);
		}
        
        return String.join("", arr);
    }
}