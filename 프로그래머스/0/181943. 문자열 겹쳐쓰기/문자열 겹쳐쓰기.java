class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        String[] array = my_string.split("");
        for (int i = s; i < s + overwrite_string.length(); i++) {
			array[i] = overwrite_string.substring(i - s, i - s + 1);
		}
        
        StringBuilder sb = new StringBuilder();
        for (String temp : array) {
        	sb.append(temp);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}