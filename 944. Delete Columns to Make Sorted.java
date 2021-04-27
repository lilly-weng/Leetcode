class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        for (int i = 0; i < strs[0].length(); i++) { //單字長度
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) < strs[j-1].charAt(i)) { //前面的比後面大就不可以
                    count ++;
                    break;
                }
            }
        }
        return count;
    }
}
