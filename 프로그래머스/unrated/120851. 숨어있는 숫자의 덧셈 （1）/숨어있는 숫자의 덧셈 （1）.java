class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] arr = my_string.split("");
        for(int i=0; i<arr.length; i++) {
        	if(arr[i].equals("1")) {
        		answer += 1;
        	}else if(arr[i].equals("2")) {
        		answer += 2;
        	}else if(arr[i].equals("3")) {
        		answer += 3;
        	}else if(arr[i].equals("4")) {
        		answer += 4;
        	}else if(arr[i].equals("5")) {
        		answer += 5;
        	}else if(arr[i].equals("6")) {
        		answer += 6;
        	}else if(arr[i].equals("7")) {
        		answer += 7;
        	}else if(arr[i].equals("8")) {
        		answer += 8;
        	}else if(arr[i].equals("9")) {
        		answer += 9;
        	}
        }
        
        return answer;
    }
}