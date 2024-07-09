import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.replace("a", " ").replace("b", " ").replace("c", " ").split(" ");
        ArrayList<String> list = new ArrayList<String>();
        for (String str : arr) {
        	if (!str.isEmpty()) {
				list.add(str);
			}
        }
    	if (list.size() == 0) {
    		String[] empty = {"EMPTY"};
    		return empty;
		}
        return list.toArray(new String[list.size()]);
    }
}