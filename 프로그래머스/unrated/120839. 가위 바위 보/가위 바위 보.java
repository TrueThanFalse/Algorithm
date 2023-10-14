class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for (int i=0; i<rsp.length(); i++) {
            char tmp = rsp.charAt(i);
            if (tmp == '0') {
                answer += "5";
            } else if (tmp == '2') {
                answer += "0";
            } else if (tmp == '5') {
                answer += "2";
            }
        }
        
        return answer;
    }
}