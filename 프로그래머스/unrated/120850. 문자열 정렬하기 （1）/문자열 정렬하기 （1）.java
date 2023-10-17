import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(String my_string) {
    	
    	int countIndex = 0;
    	ArrayList<Integer> arr1 = new ArrayList<Integer>();
    	String[] arr2 = my_string.split("");
    	for(int i=0; i<arr2.length; i++) {
    		if(arr2[i].equals("0")){
    			arr1.add(Integer.parseInt(arr2[i]));
    			countIndex++;
    		}else if(arr2[i].equals("1")){
    			arr1.add(Integer.parseInt(arr2[i]));
    			countIndex++;
    		}else if(arr2[i].equals("2")){
    			arr1.add(Integer.parseInt(arr2[i]));
    			countIndex++;
    		}else if(arr2[i].equals("3")){
    			arr1.add(Integer.parseInt(arr2[i]));
    			countIndex++;
    		}else if(arr2[i].equals("4")){
    			arr1.add(Integer.parseInt(arr2[i]));
    			countIndex++;
    		}else if(arr2[i].equals("5")){
    			arr1.add(Integer.parseInt(arr2[i]));
    			countIndex++;
    		}else if(arr2[i].equals("6")){
    			arr1.add(Integer.parseInt(arr2[i]));
    			countIndex++;
    		}else if(arr2[i].equals("7")){
    			arr1.add(Integer.parseInt(arr2[i]));
    			countIndex++;
    		}else if(arr2[i].equals("8")){
    			arr1.add(Integer.parseInt(arr2[i]));
    			countIndex++;
    		}else if(arr2[i].equals("9")){
    			arr1.add(Integer.parseInt(arr2[i]));
    			countIndex++;
    		}
    	}
    	
    	Collections.sort(arr1);
    	int[] answer = new int[countIndex];
    	for(int i=0; i<arr1.size(); i++) {
    		answer[i] = arr1.get(i);
    	}

        return answer;
    }
}