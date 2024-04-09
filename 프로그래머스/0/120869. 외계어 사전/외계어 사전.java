import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        
        // 문자열 정렬
        String spellWord = String.join("", spell);
        char[] spellChars = spellWord.toCharArray();
        Arrays.sort(spellChars);
        spellWord = new String(spellChars);

        // 일치 여부 확인
        for (String word : dic) {
            char[] wordChars = word.toCharArray();
            Arrays.sort(wordChars);
            String sortedWord = new String(wordChars);

            if(spellWord.equals(sortedWord)) {
                return 1;
            }
        }

        return 2;
    }
}