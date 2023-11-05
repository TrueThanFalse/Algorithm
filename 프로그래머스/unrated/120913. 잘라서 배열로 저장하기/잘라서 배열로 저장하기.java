class Solution {
    public String[] solution(String my_str, int n) {
        int my_strLength = my_str.length();
        int numOfSubstrings = (my_strLength+n-1) / n;

        String[] answer = new String[numOfSubstrings];

        int answerIndex = 0;
        int startIndex = 0;

        while (startIndex < my_strLength) {
            int endIndex = Math.min(startIndex+n, my_strLength);
            answer[answerIndex] = my_str.substring(startIndex, endIndex);
            startIndex += n;
            answerIndex++;
        }

        return answer;
    }
}