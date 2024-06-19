class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if (eq.equals("=")) {
			if (ineq.equals(">")) {
				answer = n >= m ? 1 : 0;
			} else if (ineq.equals("<")){
				answer = n <= m ? 1 : 0;
			}
		} else if (eq.equals("!")){
			if (ineq.equals(">")) {
				answer = n > m ? 1 : 0;
			} else if (ineq.equals("<")){
				answer = n < m ? 1 : 0;
			}
		} else {
			System.out.println("입력값에 오류가 있습니다.");
		}
        
        return answer;
    }
}