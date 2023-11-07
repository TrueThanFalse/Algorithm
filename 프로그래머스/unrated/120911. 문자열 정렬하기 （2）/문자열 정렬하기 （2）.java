import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String tmpStr = my_string.toLowerCase();
        String[] arr = tmpStr.split("");
        Arrays.sort(arr);
        for(String str : arr) {
        	answer += str;
        }
        
        return answer;
    }
}