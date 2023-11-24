import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        int count = 0;
        for(char tmp : arr) {
        	for(int i=0; i<s.length(); i++) {
        		if(tmp == s.charAt(i)) {
        			count++;
        		}
        	}
        	if(count == 1) {
        		answer += tmp;
        		count = 0;
        	}else {
        		count = 0;
        	}
        }
        
        String[] arrAnswer = answer.split("");
        Arrays.sort(arrAnswer);
        answer = "";
        for(String tmp : arrAnswer) {
        	answer += tmp;
        }

        return answer;
    }
}