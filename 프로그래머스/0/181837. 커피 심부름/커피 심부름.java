class Solution {
    public int solution(String[] order) {
    	for (int i = 0; i < order.length; i++) {
			if (order[i].equals("americano") || order[i].equals("anything")) {
				order[i] = "iceamericano";
			} else if (order[i].equals("cafelatte")) {
				order[i] = "icecafelatte";
			}
		}
    	
        int answer = 0;
        for (String str : order) {
        	if (str.contains("americano")) {
				answer += 4500;
			} else {
				answer += 5000;
			}
        }
        return answer;
    }
}