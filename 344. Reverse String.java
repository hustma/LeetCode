public class Solution {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
        // return res;
        // Stack<Character> stack = new Stack<Character>();
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < s.length(); i++) {
        //     stack.push(s.charAt(i));
        // }
        // while (!stack.empty()) {
        //     sb.append(stack.pop());
        // }
        // return sb.toString();

    }
}