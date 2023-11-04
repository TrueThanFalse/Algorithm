import java.util.ArrayList;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        ArrayList<Integer> list = new ArrayList<>();
        String[] arr = letter.split(" ");
        
        for(int i=0; i<arr.length; i++) {
        	for(int j=0; j<morse.length; j++) {
        		if(arr[i].equals(morse[j])) {
        			list.add(j);
        		}
        	}
        }
        
        for(int i=0; i<list.size(); i++) {
	        switch (list.get(i)) {
			case 0:
				answer += "a";
				break;
			case 1:
				answer += "b";
				break;
			case 2:
				answer += "c";
				break;
			case 3:
				answer += "d";
				break;
			case 4:
				answer += "e";
				break;
			case 5:
				answer += "f";
				break;
			case 6:
				answer += "g";
				break;
			case 7:
				answer += "h";
				break;
			case 8:
				answer += "i";
				break;
			case 9:
				answer += "j";
				break;
			case 10:
				answer += "k";
				break;
			case 11:
				answer += "l";
				break;
			case 12:
				answer += "m";
				break;
			case 13:
				answer += "n";
				break;
			case 14:
				answer += "o";
				break;
			case 15:
				answer += "p";
				break;
			case 16:
				answer += "q";
				break;
			case 17:
				answer += "r";
				break;
			case 18:
				answer += "s";
				break;
			case 19:
				answer += "t";
				break;
			case 20:
				answer += "u";
				break;
			case 21:
				answer += "v";
				break;
			case 22:
				answer += "w";
				break;
			case 23:
				answer += "x";
				break;
			case 24:
				answer += "y";
				break;
			case 25:
				answer += "z";
				break;
			default:
				break;
			}
    	}
        return answer;
    }
}