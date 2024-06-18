class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        String[] arrayStr1 = str1.split("");
        String[] arrayStr2 = str2.split("");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < arrayStr1.length; i++) {
        	sb.append(arrayStr1[i]);
        	sb.append(arrayStr2[i]);
		}
        
        answer = sb.toString();
        
        return answer;
    }
}