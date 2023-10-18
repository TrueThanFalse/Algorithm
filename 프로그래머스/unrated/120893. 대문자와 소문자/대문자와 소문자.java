class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] tmp = my_string.split("");
        for(int i=0; i<tmp.length; i++) {
        	char ch = tmp[i].charAt(0);
        	boolean isLower = Character.isLowerCase(ch);
        	boolean isUpper = Character.isUpperCase(ch);
        	if(isLower) {
        		answer += tmp[i].toUpperCase();
        	}else if(isUpper) {
        		answer += tmp[i].toLowerCase();
        	}
        }
        
        return answer;
    }
}