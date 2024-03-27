class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int width = 0;
        int height = 0;
        
        // 가로 길이
        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                int tempWidth = Math.abs(dots[i][0] - dots[j][0]);
                if (tempWidth > width) {
                    width = tempWidth;
                }
            }
        }
        
        // 세로 길이
        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                int tempHeight = Math.abs(dots[i][1] - dots[j][1]);
                if (tempHeight > height) {
                    height = tempHeight;
                }
            }
        }
        
        answer = width * height;
        
        return answer;
    }
}