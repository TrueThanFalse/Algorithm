class Solution {
    public int[] solution(int[] numlist, int n) {
        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist.length - i - 1; j++) {
                int distance1 = Math.abs(numlist[j] - n);
                int distance2 = Math.abs(numlist[j + 1] - n);

                // 큰 수를 앞으로 배치
                if ((distance1 == distance2 && numlist[j] < numlist[j + 1]) || (distance1 > distance2)) {
                    int temp = numlist[j];
                    numlist[j] = numlist[j + 1];
                    numlist[j + 1] = temp;
                }
            }
        }

        return numlist;
    }
}