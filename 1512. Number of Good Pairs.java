class Solution {
    public int numIdenticalPairs(int[] nums) {
        //先從第一位數開始遍歷
        //從下一位開始跟前面比，如果有一樣的就＋1
        
        int pair = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    pair += 1;
                }
            }
        }
        
        return pair;
        
    }
}
