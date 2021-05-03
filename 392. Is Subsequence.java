class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length()==0) return true;
        
        //因為要按照順序排列才是 subsequence 所以用雙指針
        int s_pointer = 0;
        int t_pointer = 0;
        
        while (t_pointer < t.length()) {
            if (t.charAt(t_pointer) == s.charAt(s_pointer)) {
                s_pointer ++;
                //因為 s_pinter ++ 在後面所以會加到跟長度一樣
                if (s_pointer == s.length()) return true;
            }
            t_pointer ++;
        }
        return false;
    }
}
