class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        String strSave = "";
        for(int z=i; z<=j; z++) {
        	strSave += String.valueOf(z);
        }
        
        String[] arr = strSave.split("");
        for(int z=0; z<arr.length; z++) {
        	if(arr[z].equals(String.valueOf(k))) {
        		answer++;
        	}
        }
        
        return answer;
    }
}