class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        for(String temp : control.split("")) {
        	switch (temp) {
			case "w":
				n += 1;
				break;
			case "s":
				n -= 1;
				break;
			case "d":
				n += 10;
				break;
			case "a":
				n -= 10;
				break;
			default:
				break;
			}
        }
        
        answer = n;
        
        return answer;
    }
}