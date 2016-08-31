public class Solution {
    public int titleToNumber(String s) {
        //26½øÖÆ
        int len = s.length();
        if(s.length() == 0) return 0;
        int res = 0;
        for(int i = 0;i <len ; i++){
            res = res * 26 + s.charAt(i) - 'A' + 1;
        }
        return res;
    }
}