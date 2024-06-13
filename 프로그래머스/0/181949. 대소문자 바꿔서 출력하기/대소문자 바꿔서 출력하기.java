import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] CharArray = a.toCharArray();
        ArrayList<String> StringArray = new ArrayList<String>();
        
        for(char temp : CharArray) {
			if(Character.isUpperCase(temp)) {
				StringArray.add(String.valueOf(temp).toLowerCase());
			}else if(Character.isLowerCase(temp)) {
				StringArray.add(String.valueOf(temp).toUpperCase());
			}
		}
        
        StringBuilder sb = new StringBuilder();
        for(String str : StringArray) {
        	sb.append(str);
        }
        System.out.println(sb);
    }
}