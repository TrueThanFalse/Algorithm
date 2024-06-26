import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int x = n;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        arr.add(x);
        while (x != 1) {
			if (x % 2 == 0) {
				x /= 2;
				arr.add(x);
			} else if (x % 2 == 1) {
				x = (3 * x) + 1;
				arr.add(x);
			}
		}
        
        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
			answer[i] = arr.get(i);
		}
        
        return answer;
    }
}