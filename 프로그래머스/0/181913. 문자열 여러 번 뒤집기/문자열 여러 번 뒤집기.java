import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String my_string, int[][] queries) {
    	for (int i = 0; i < queries.length; i++) {
			String start = my_string.substring(0, queries[i][0]);
			String end = my_string.substring(queries[i][1] + 1, my_string.length());
			
			ArrayList<String> list = new ArrayList<String>();
			for (int j = queries[i][0]; j <= queries[i][1]; j++) {
				list.add(String.valueOf(my_string.charAt(j)));
			}
			Collections.reverse(list);
			String reverse = String.join("", list);
			
			my_string = start + reverse + end;
		}
        return my_string;
    }
}