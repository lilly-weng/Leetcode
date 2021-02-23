class Solution {
    public boolean isValid(String s) {
        Stack<Character> mark = new Stack<Character>();
        for (int i= 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                mark.push(s.charAt(i));
            }else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
                if (mark.isEmpty()) return false;
                char cur = mark.pop();
                
                if (cur == '(' && s.charAt(i) != ')') return false;
                if (cur == '[' && s.charAt(i) != ']') return false;
                if (cur == '{' && s.charAt(i) != '}') return false;
            }
        }
        
        if (mark.isEmpty()) return true;
        return false;
    }
}
