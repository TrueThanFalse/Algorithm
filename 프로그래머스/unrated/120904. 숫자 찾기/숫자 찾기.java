class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        answer = -1;
        String tmp = num+"";
        String number = k+"";
        String[] arr = tmp.split("");
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i].equals(number)) {
        		answer = i+1;
        		return answer;
        	}
        }
        
        return answer;
    }
}