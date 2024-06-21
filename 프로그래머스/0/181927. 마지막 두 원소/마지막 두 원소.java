import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
    	int temp = 0;
        
        if (num_list[num_list.length - 2] < num_list[num_list.length - 1]) {
        	temp = num_list[num_list.length - 1] - num_list[num_list.length - 2];
		} else {
			temp = num_list[num_list.length - 1] * 2;
		}
        
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        answer[answer.length - 1] = temp;
        
        return answer;
    }
}