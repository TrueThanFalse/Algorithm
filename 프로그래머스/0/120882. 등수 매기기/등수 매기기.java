class Solution {
    public int[] solution(int[][] score) {
        int length = score.length;
        double[] average = new double[length];
        int[] answer = new int [length];
        
        for(int i = 0; i < length; i++) {
            average[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        
        // 초기화
        for(int i = 0; i < length; i++) {
            answer[i] = 1;
        }
        
        for(int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (average[i] < average[j]) {
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}