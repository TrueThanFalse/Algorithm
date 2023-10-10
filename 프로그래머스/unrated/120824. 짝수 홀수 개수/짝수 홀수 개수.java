import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        int odd = (int)Arrays.stream(num_list).filter(n-> n%2 == 1).count(); 
        int even = (int)Arrays.stream(num_list).filter(n-> n%2 == 0).count();
        answer[0] = even;
        answer[1] = odd;
        
        return answer;
    }
}