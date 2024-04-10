public class Solution {
    public int solution(int n) {
        int answer = 0;
        int index = 0;
        
        while (n > 0) {
            index++;
            int nowNum = index;
            boolean isOK = false;
            
            if (nowNum % 3 == 0) {
                // 3의 배수일 때
                isOK = true;
            } else {
                while (nowNum > 0) {
                    if (nowNum % 10 == 3) {
                        // 숫자 3을 포함할 때
                        isOK = true;
                        break;
                    }
                    nowNum /= 10;
                }
            }
            
            // 사용 가능한 숫자일 때
            if (!isOK) {
                n--;
                answer = index;
            }
        }
        
        return answer;
    }
}