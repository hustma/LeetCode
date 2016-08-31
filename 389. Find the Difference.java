public class Solution {
    public char findTheDifference(String s, String t) {
        int[] arrayS = new int[26];
        for(int i = 0; i < s.length();i++){
            arrayS[s.charAt(i)-'a']++;
        }
        for(int i = 0; i < t.length();i++){
            int position = t.charAt(i) - 'a';
            arrayS[position]--;
            if(arrayS[position] < 0) return t.charAt(i);
        }
        return 'a';
        
    }
}