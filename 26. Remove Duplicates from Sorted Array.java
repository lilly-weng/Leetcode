class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        //雙指針方式去check
        int id = 1; //紀錄有多少個unique number
        for (int i = 1; i < nums.length; i++) { //i從 1 開始，因為id要和下一個數比較是否相同
            if (nums[i] != nums[id-1]) { //發現和id指針不一樣的數，id要減一，因為從零開始
                nums[id] = nums[i]; //id紀錄下一個不一樣的數
                id ++; //unique number增加
            }
        }
        return id;
    }
}
