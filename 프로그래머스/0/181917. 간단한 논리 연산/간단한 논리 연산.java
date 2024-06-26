class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = truthTableB(truthTableA(x1, x2), truthTableA(x3, x4));
        return answer;
    }
    
    private boolean truthTableA(boolean a, boolean b) {
		return a == true || b == true ? true : false;
	}
    
    private boolean truthTableB(boolean a, boolean b) {
		return a == false || b == false ? false : true;
	}
}