class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
			if (arr1.length > arr2.length) {
				return 1;
			} else {
				return -1;
			}
		} else {
			int arr1Num = 0;
			int arr2Num = 0;
			for (int i = 0; i < arr2.length; i++) {
				arr1Num += arr1[i];
				arr2Num += arr2[i];
			}
			return arr1Num > arr2Num ? 1 : arr1Num == arr2Num ? 0 : -1; 
		}
    }
}