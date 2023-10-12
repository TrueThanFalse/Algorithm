class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] arr = my_string.split("");
        for(int i=0; i<arr.length; i++) {
        	for(int j=1; j<=9; j++) {
        		if(arr[i].equals(String.valueOf(j))) {
        			answer += Integer.parseInt(arr[i]);
        		}
        	}
        }
        
        return answer;
    }
}