class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int maxCount = 0;
        int mode = 0;
        boolean isMultiple = false;
        
        for(int i = 0; i < array.length; i++) {
            int count = 0;
            for(int j = 0; j < array.length; j++) {
                if(array[i] == array[j]) {
                    count++;
                }
            }
            if(count > maxCount) {
                maxCount = count;
                mode = array[i];
                isMultiple = false;
            }else if(count == maxCount && mode != array[i]) {
                // 같은 횟수로 나온 다른 숫자가 있다면...
                isMultiple = true;
            }
        }
        
        if(isMultiple) {
            answer = -1;
        }else {
            answer = mode;
        }
        
        return answer;
    }
}