class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int start = 0; //Index
        int end = nums.length - 1;
        while (start + 1 < end) { //當start和end相鄰的時候，停止搜尋
            int mid = start + (end - start)/2; //為了避免overflow
            if (nums[mid] == target) return mid;
            if (nums[start] < nums[mid]) { //情況一
                if (nums[start] <= target && nums[mid] >= target) end = mid;
                else start = mid;
            } else if (nums[mid] < nums[end]) { //情況二
                if (nums[end] >= target && nums[mid] <= target) start = mid;
                else end =mid;
            }
            
        }
        //當兩個指針相鄰的時候，看start或是end是不是target
        if (nums[start] == target) return start; 
        if (nums[end] == target) return end;
        return -1;
        
    }
}
