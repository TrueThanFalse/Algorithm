import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {

        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        switch (n) {
		case 1:
			int[] answer1 = new int[b + 1];
			for (int i = 0; i < answer1.length; i++) {
				answer1[i] = num_list[i];
			}
			return answer1;
		case 2:
			int[] answer2 = new int[num_list.length - a];
			for (int i = 0; i < answer2.length; i++) {
				answer2[i] = num_list[i + a];
			}
			return answer2;
		case 3:
			int[] answer3 = new int[b - a + 1];
			for (int i = 0; i < answer3.length; i++) {
				answer3[i] = num_list[a + i];
			}
			return answer3;
		case 4:
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = a; i <= b; i += c) {
				list.add(num_list[i]);
			}
			int[] answer4 = new int[list.size()];
			for (int i = 0; i < answer4.length; i++) {
				answer4[i] = list.get(i);
			}
			return answer4;
		default:
			break;
		}
        
        return new int[0];
    }
}