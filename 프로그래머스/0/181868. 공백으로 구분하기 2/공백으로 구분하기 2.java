import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        String str = my_string.trim();
        ArrayList<String> list = new ArrayList<String>();
        
        for (String s : str.split(" ")) {
        	if (!s.isEmpty()) {
				list.add(s);
			}
        }

        return list.toArray(new String[list.size()]);
    }
}