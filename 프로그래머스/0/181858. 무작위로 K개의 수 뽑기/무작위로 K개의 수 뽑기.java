import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
			if (count == k) {
				break;
			}
			if (!list.contains(arr[i])) {
				list.add(arr[i]);
				count++;
			}
		}
        
        while (list.size() < k) {
			list.add(-1);
		}
        
        return list.stream().mapToInt(z -> z).toArray();
    }
}