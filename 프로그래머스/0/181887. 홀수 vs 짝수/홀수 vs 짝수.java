class Solution {
    public int solution(int[] num_list) {
        int add = 0;
        int even = 0;
        for (int i = 0; i < num_list.length; i++) {
			if (i % 2 == 0) {
				add += num_list[i];
			} else {
				even += num_list[i];
			}
		}
        return add > even ? add : even;
    }
}