class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int add = 0;
        int mul = 1;
        
        for (int temp : num_list) {
        	add += temp;
        	mul *= temp;
        }
        
        add = add * add;
        
        answer = mul < add ? 1 : 0;
        
        return answer;
    }
}