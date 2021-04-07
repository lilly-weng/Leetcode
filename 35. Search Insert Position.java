class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;
        
        int start = 0; // left
        int end = nums.length - 1; // right (index)
        
        while(start+1 < end) { //停止的條件 start和end相鄰
            int mid = start + (end - start)/2; //避免overflow
            if (nums[mid] > target) end = mid;
            else if (nums[mid] < target) start = mid;
            else return mid;
        }
        
        //停止後的條件，檢查數字大小
        if (nums[end] < target) return end+1;
        else if (nums[start] >= target) return start;
        else return end;
        
    }
}
