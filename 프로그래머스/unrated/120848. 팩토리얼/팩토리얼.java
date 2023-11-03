class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int count = 1;
        double share = 1;
        while(share <= n) {
        	count++;
        	share *= count;
        }
        
        answer = count-1;
        
        return answer;
    }
}