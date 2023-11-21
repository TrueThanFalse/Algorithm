import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String tmp = "";
        String pattern = "[0-9]";
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<my_string.length()-1; i++) {
        	if(my_string.substring(i,i+1).matches(pattern)) {
        		tmp += my_string.substring(i,i+1);
        	}else {
        		if(tmp.length() == 0) {
        			continue;
        		}else {
        			list.add(Integer.valueOf(tmp));
        			tmp = "";
        		}
        	}
        }
        
        // 마지막 문자 처리
        if(my_string.substring(my_string.length()-1).matches(pattern)) {
        	tmp += my_string.substring(my_string.length()-1);
        }
        if(!tmp.isEmpty()) {
        	list.add(Integer.valueOf(tmp));
        }
        
        // 자연수만 합산하여 return
        for(int number : list) {
        	answer += number;
        }
        
        return answer;
    }
}