class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        int[] diceCount = new int[7];
        
        for (int i = 0; i < arr.length; i++) {
			diceCount[arr[i]]++;
		}
        
        for (int i = 1; i < diceCount.length; i++) {
			if (diceCount[i] == 4) {
				return 1111 * i;
			}
		}
        
        for (int i = 1; i < diceCount.length; i++) {
        	if (diceCount[i] == 3) {
				for (int j = 1; j < diceCount.length; j++) {
					if (diceCount[j] == 1) {
						return ((10 * i) + j) * ((10 * i) + j);
					}
				}
			}
		}
        
        for (int i = 1; i < diceCount.length; i++) {
			for (int j = 1; j < diceCount.length; j++) {
				if (i != j && diceCount[i] == 2 && diceCount[j] == 2) {
					return (i + j) * Math.abs(i - j);
				}
			}
		}
        
        for (int i = 1; i < diceCount.length; i++) {
			if (diceCount[i] == 2) {
				int q = 0;
				int r = 0;
				for (int j = 1; j < diceCount.length; j++) {
					if (diceCount[j] == 1) {
						if (q == 0) {
							q = j;
						} else {
							r = j;
						}
					}
				}
				return q * r;
			}
		}
        
        int min = 10;
        for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
        return min;
    }
}