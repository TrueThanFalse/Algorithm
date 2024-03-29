class Solution {
    public int solution(String A, String B) {
        // A와 B가 같으면
        if (A.equals(B)) {
            return 0;
        }
        
        int count = 0;
        int length = A.length();

        for (int i = 0; i < length; i++) {
            A = A.substring(length - 1) + A.substring(0, length - 1);
            count++;

            // A와 B가 같아지면
            if (A.equals(B)) {
                return count;
            }
        }

        return -1;
    }
}