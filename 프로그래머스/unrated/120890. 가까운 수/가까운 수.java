import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        int indexCount = -1;
        
        array = Arrays.copyOf(array, array.length+1);
        array[array.length-1] = n;
        Arrays.sort(array);
        
        for(int i=0; i<array.length; i++) {
        	if(array[i] == n) {
        		indexCount = i;
        		break;
        	}
        }
        
        if(indexCount == 0) {
        	answer = array[indexCount+1];
        }else if(indexCount == array.length-1) {
        	answer = array[indexCount-1];
        }else {
        	int downBetweenNum = array[indexCount]-array[indexCount-1];
        	int upBetweenNum = array[indexCount+1]-array[indexCount];
        	
        	if(downBetweenNum <= upBetweenNum) {
        		answer = array[indexCount-1];
        	}else {
        		answer = array[indexCount+1];
        	}
        }
        
        return answer;
    }
}