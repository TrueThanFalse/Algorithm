class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String[] arrKeywords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] arrValues = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for(int i=0; i<arrKeywords.length; i++) {
        	String keyword = arrKeywords[i];
        	String value = arrValues[i];
        	numbers = numbers.replaceAll(keyword, value);
        }
        
        answer = Long.valueOf(numbers);
        
        return answer;
    }
}