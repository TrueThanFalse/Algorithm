import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
    	
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
    	for (String i : strArr) {
    		if (map.get(i.length()) == null) {
				map.put(i.length(), 1);
			} else {
				int count = map.get(i.length());
				map.remove(i.length());
				map.put(i.length(), count + 1);
			}
    	};
        return Collections.max(map.values());
    }
}