import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<String>();
        for (String str : strArr) {
        	list.add(str);
        }
        
        a: while (true) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).contains("ad")) {
					list.remove(i);
					continue a;
				}
			}
			break;
		}
        
        return list.toArray(new String[list.size()]);
    }
}