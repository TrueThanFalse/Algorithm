class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int maxSide = Math.max(sides[0], sides[1]);
        int minSide = Math.min(sides[0], sides[1]);
        
        int maximum = maxSide + minSide - 1;
        int minimum = maxSide - minSide + 1;
        
        answer = maximum - minimum + 1;
        
        return answer;
    }
}