import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for (int i = 0; i < arr.length; i++) {
			if (list.isEmpty()) {
				list.add(arr[i]);
			} else if (!list.isEmpty() && list.get(list.size() - 1) == arr[i]){
				list.remove(list.size() - 1);
			} else if (!list.isEmpty() && list.get(list.size() - 1) != arr[i]){
				list.add(arr[i]);
			}
		}
        return list.size() == 0 ? new int[] {-1} : list.stream().mapToInt(i -> i).toArray();
    }
}