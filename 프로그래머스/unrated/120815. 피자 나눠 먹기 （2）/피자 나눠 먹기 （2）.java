class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=n; ; i+=n) {
        	for(int j=0; j<=n*6; j++) {
        		if(i == 6*j) {
        			return answer = j;
        		}
        	}
        }
    }
}