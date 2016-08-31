public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();
        for(Character c : magazine.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }else{
                map.put(c,1);
            }
        }
        for(Character c : ransomNote.toCharArray()){
            if(map.containsKey(c)){
                int num = map.get(c);
                if(num < 1) return false;
                map.put(c,map.get(c) - 1);
            }else{
               return false;
            }
        }
        return true;
    }
}