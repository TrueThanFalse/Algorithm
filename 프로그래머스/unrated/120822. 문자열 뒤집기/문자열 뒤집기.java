class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] tmp = my_string.split("");
        
        for(int i=tmp.length-1; 0<=i; i--) {
        	answer = answer.concat(tmp[i]);
        }
        
        return answer;
    }
}