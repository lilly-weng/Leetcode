class Solution {
    public String freqAlphabets(String s) {
        int cur;
        int len = s.length();
        StringBuilder ans = new StringBuilder();
        for (int i = len - 1; i >=0; i--) { //從後面開始
            if (s.charAt(i) == '#') {
                cur = (s.charAt(i - 2) - '0') * 10 + s.charAt(i - 1) - '0'; 
                //把文字轉成數字，而且 # 前面要兩位數一起考慮
                i -= 2;
            } else {
                cur = s.charAt(i) - '0'; //文字轉成數字 (type)
            }
            ans.append((char)(cur - 1  + 'a')); //數字透過ASCII值轉為 character
        }
        return ans.reverse().toString();
    }
}
