class Solution {
    public String solution(int age) {
        String answer = "";
        
        String tmp = Integer.toString(age);
        for(int i=0; i<tmp.length(); i++) {
        	char ch = tmp.charAt(i);
        	char eng = (char)Character.toLowerCase(ch+49);
        	answer += eng;
        }
        
        return answer;
    }
}