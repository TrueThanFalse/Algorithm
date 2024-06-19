class Solution {
    public String solution(String code) {
        String answer = "";
        
        String[] array = code.split("");
        int mode = 0;
        
        for (int i = 0; i < array.length; i++) {
			switch (mode) {
			case 0:
				if (array[i].equals("1")) {
					mode = 1;
				}else if(i % 2 == 0){
					answer += array[i];
				}
				break;
				
			case 1:
				if (array[i].equals("1")) {
					mode = 0;
				}else if(i % 2 == 1){
					answer += array[i];
				}
				break;
				
			default: System.out.println("ERROR");
				break;
			}
		}
        
        if (answer.equals("")) {
			answer = "EMPTY";
		}
        
        return answer;
    }
}