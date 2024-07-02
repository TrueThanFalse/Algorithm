import java.util.ArrayList;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        ArrayList<String> suffixList = new ArrayList<String>();
        for (int i = 0; i < my_string.length(); i++) {
			suffixList.add(my_string.substring(i));
		}
        
        if (suffixList.contains(is_suffix)) {
			answer = 1;
		}
        
        return answer;
    }
}