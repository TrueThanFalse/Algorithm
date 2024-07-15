import java.util.ArrayList;

class Solution {
    public String[] solution(String[] picture, int k) {
    	ArrayList<String> list = new ArrayList<String>();
    	for (String str : picture) {
    		StringBuilder sb = new StringBuilder();
    		for (int i = 0; i < str.length(); i++) {
    			for (int j = 0; j < k; j++) {
    				sb.append(str.charAt(i));
				}
			}
    		for (int i = 0; i < k; i++) {
    			list.add(sb.toString());
			}
    	}
        return list.toArray(new String[list.size()]);
    }
}