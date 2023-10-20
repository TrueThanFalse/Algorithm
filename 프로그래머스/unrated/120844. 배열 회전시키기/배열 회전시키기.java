class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        System.arraycopy(numbers, 0, answer, 0, numbers.length);
        if(direction.equals("right")) {
        	int lastNum = answer[answer.length-1];
        	for(int i=answer.length-1; i>=0; i--) {
        		if(i == 0) {
        			answer[0] = lastNum;
        			break;
        		}
        		answer[i] = answer[i-1];
        	}
        }else if(direction.equals("left")) {
        	int firstNum = answer[0];
        	for(int i=0; i<answer.length; i++) {
        		if(i == answer.length-1) {
        			answer[i] = firstNum;
        			break;
        		}
        		answer[i] = answer[i+1];
        	}
        }
        
        return answer;
    }
}