class Solution {
    public boolean isIsomorphic(String s, String t) {
        //字符串，所以先訂 256的數組 default = 0
        //如果數字都符合的話，就讓數字變成 i+1
        
        int[] sm = new int[256];
        int[] tm = new int[256];
        
        for (int i =0; i < s.length(); i++) {
            if (sm[s.charAt(i)] != tm[t.charAt(i)]) {
                return false;
            } else {
                sm[s.charAt(i)] = tm[t.charAt(i)] = i+1;
            }
        }
        return true;
    }
}
