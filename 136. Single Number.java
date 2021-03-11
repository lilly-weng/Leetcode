class Solution {
    public int singleNumber(int[] nums) {
        int x = 0;
        for (int n:nums) {
            x ^= n; // 異或：a^b^a = b (只剩單數個的數字) , 0^任意數=任意數
        }
    return x;
    }
}
