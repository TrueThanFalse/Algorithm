import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int variable = 1;
        while (len > variable) {
			variable *= 2;
		}
        int[] answer = Arrays.copyOf(arr, variable);
        return answer;
    }
}